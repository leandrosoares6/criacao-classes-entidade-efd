package com.example.demo.service;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import com.example.demo.enums.TipoOcorrencia;
import com.example.demo.model.anotacoes.Metadados;
import com.example.demo.model.anotacoes.PossuiDataPart;
import com.example.demo.repository.RegistrosRepository;
import com.example.demo.util.ClassUtils;
import com.example.demo.util.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegistroService.class);
	private static final String PACOTE = "com.example.demo.model.registros";
	private static final String REGISTRO_PAI = "0000";
	private static final String DELIMITADOR = "|";
	private static final String SUFIXO_REGISTRO_ABERTURA = "001";
	private static final String SUFIXO_REGISTRO_FECHAMENTO = "990";
	private static final String SUFIXO_REGISTRO_CONTAGEM = "9900";
	private static final long BYTE_TO_MB = 1024L * 1024L;


	@Autowired
	private RegistrosRepository repository;

	public List<Object> processarRegistros(Long teaId, Date teaDataCarga,
			BufferedReader arquivoEfd) {
		long inicio = System.currentTimeMillis();
		long memoriamInicial = getCurrentlyUsedMemory();

		Map<String, Object> cacheDeRegistrosPai = new HashMap<>();

		List<Object> registrosProcessados = new ArrayList<>();
		CollectionUtils.zipWithIndex(arquivoEfd.lines().filter(RegistroService::filtros))
				.forEach(entrada -> {
					String linha = entrada.getValue();
					var numeroLinhaAtual = entrada.getKey() + 1;
					var colunas = linha.split("\\" + DELIMITADOR);
					var nomeRegistroAtual = colunas[1];
					var nomeClasseRegistroAtual = "Registro" + nomeRegistroAtual;
					var caminhoClasse = PACOTE + "." + nomeClasseRegistroAtual;
					Class<?> classeRegistro = ClassUtils.obterClassePorCaminho(caminhoClasse);
					if (Objects.isNull(classeRegistro)) {
						return;
						// throw new IllegalStateException(String.format(
						// "A classe para o registro %s não foi encontrada.", nomeRegistroAtual));
					}

					if (nomeRegistroAtual.equals(REGISTRO_PAI)) {
						Object registro = ClassUtils.obterInstancia(classeRegistro, linha, teaId,
								teaDataCarga);
						cacheDeRegistrosPai.put(nomeRegistroAtual, registro);
						registrosProcessados.add(registro);
						return;
					}

					String nomeRegistroPai =
							classeRegistro.getAnnotation(Metadados.class).nomeRegistroPai();
					TipoOcorrencia ocorrencia = TipoOcorrencia
							.valueOf(classeRegistro.getAnnotation(Metadados.class).ocorrencia());
					boolean possuiDataPart =
							classeRegistro.isAnnotationPresent(PossuiDataPart.class);

					LOGGER.info("Registro atual: {}, Registro pai: {}", nomeRegistroAtual,
							nomeRegistroPai);

					Optional<Object> registroPai =
							Optional.ofNullable(cacheDeRegistrosPai.get(nomeRegistroPai));
					if (!registroPai.isPresent()) {
						throw new IllegalStateException(
								"Não foi encontrado última referência para o registro pai informado: "
										+ nomeRegistroPai);
					}
					Long idRegistroAtual = gerarIdAtual(teaId, numeroLinhaAtual);

					Object instanciaClasseRegistro =
							obterInstanciaDeRegistro(teaDataCarga, linha, classeRegistro,
									ocorrencia, possuiDataPart, registroPai.get(), idRegistroAtual);
					cacheDeRegistrosPai.put(nomeRegistroAtual, instanciaClasseRegistro);

					registrosProcessados.add(instanciaClasseRegistro);
				});

		repository.salvarRegistros(registrosProcessados);

		long fim = System.currentTimeMillis();
		long memoriaFinal = getCurrentlyUsedMemory();
		long tempo = fim - inicio;
		long memoriaConsumida = memoriaFinal - memoriamInicial;
		LOGGER.info("Tempo consumido: {} ms, Memoria consumida: {} MB", tempo, memoriaConsumida);
		// return registrosProcessados;
		return Collections.emptyList();
	}

	private Object obterInstanciaDeRegistro(Date teaDataCarga, String linha,
			Class<?> classeRegistro, TipoOcorrencia ocorrencia, boolean possuiDataPart,
			Object registroPai, Long idRegistroAtual) {
		Object instanciaClasseRegistro = null;

		if (ocorrencia.equals(TipoOcorrencia.UNICA) && possuiDataPart) {
			instanciaClasseRegistro =
					ClassUtils.obterInstancia(classeRegistro, linha, registroPai, teaDataCarga);
		}

		if (ocorrencia.equals(TipoOcorrencia.UNICA) && !possuiDataPart) {
			instanciaClasseRegistro = ClassUtils.obterInstancia(classeRegistro, linha, registroPai);
		}

		if (ocorrencia.equals(TipoOcorrencia.MULTIPLA) && possuiDataPart) {
			instanciaClasseRegistro = ClassUtils.obterInstancia(classeRegistro, linha,
					idRegistroAtual, registroPai, teaDataCarga);
		}

		if (ocorrencia.equals(TipoOcorrencia.MULTIPLA) && !possuiDataPart) {
			instanciaClasseRegistro =
					ClassUtils.obterInstancia(classeRegistro, linha, idRegistroAtual, registroPai);
		}
		return instanciaClasseRegistro;
	}

	private static Long gerarIdAtual(Long teaId, int andIncrement) {
		var incrementoFormatado = String.format("%09d", andIncrement);
		return Long.parseLong(
				String.valueOf(teaId.intValue()).concat(String.valueOf(incrementoFormatado)));
	}

	private static Boolean filtros(final String linha) {
		final String[] camposDaLinha = linha.split("\\" + DELIMITADOR);

		if (!linha.startsWith(DELIMITADOR) || camposDaLinha.length < 2) {
			return false;
		}

		String nomeTabela = camposDaLinha[1];
		String digitosFinais = nomeTabela.substring(1);
		Boolean eRegistroDeAberturaOuFechamento = digitosFinais.equals(SUFIXO_REGISTRO_ABERTURA)
				|| digitosFinais.equals(SUFIXO_REGISTRO_FECHAMENTO);
		Boolean eRegistroDeContagem = nomeTabela.equals(SUFIXO_REGISTRO_CONTAGEM);

		return !eRegistroDeAberturaOuFechamento && !eRegistroDeContagem;
	}

	private long getCurrentlyUsedMemory() {
		return (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())
				/ BYTE_TO_MB;
	}

}

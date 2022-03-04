package com.example.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
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


	@Autowired
	private RegistrosRepository repository;

	public List<Object> processarRegistrosWhile(Long teaId, Date teaDataCarga,
			BufferedReader arquivoEfd) throws IOException {
		Map<String, Long> cacheDeRegistrosPai = new HashMap<>();
		List<Object> registrosProcessados = new ArrayList<>();

		AtomicInteger contadorDeLinha = new AtomicInteger(0);

		for (String linha = arquivoEfd.readLine(); linha != null; linha = arquivoEfd.readLine()) {
			if (!linha.startsWith("|"))
				continue;
			var numeroLinhaAtual = contadorDeLinha.incrementAndGet();
			var colunas = linha.split("\\" + DELIMITADOR);
			var nomeRegistroAtual = colunas[1];
			var nomeClasseRegistroAtual = "Registro" + nomeRegistroAtual;
			var caminhoClasse = PACOTE + "." + nomeClasseRegistroAtual;
			Class<?> classeRegistro = ClassUtils.obterClassePorCaminho(caminhoClasse);

			if (Objects.isNull(classeRegistro)) {
				continue;
				// throw new IllegalStateException(String.format(
				// "A classe para o registro %s não foi encontrada.", nomeRegistroAtual));
			}

			if (nomeRegistroAtual.equals(REGISTRO_PAI)) {
				LOGGER.info("Processando registro {}", REGISTRO_PAI);

				registrosProcessados
						.add(ClassUtils.obterInstancia(classeRegistro, linha, teaId, teaDataCarga));
				cacheDeRegistrosPai.put(nomeRegistroAtual, teaId);
				continue;
			}

			String nomeRegistroPai =
					classeRegistro.getAnnotation(Metadados.class).nomeRegistroPai();
			TipoOcorrencia ocorrencia = TipoOcorrencia
					.valueOf(classeRegistro.getAnnotation(Metadados.class).ocorrencia());
			boolean possuiDataPart = classeRegistro.isAnnotationPresent(PossuiDataPart.class);

			LOGGER.info("Nome registro atual: {}", nomeRegistroAtual);
			LOGGER.info("Nome registro pai: {}", nomeRegistroPai);
			LOGGER.info("Ocorrência: {}", ocorrencia);

			Optional<Long> idRegistroPai =
					Optional.ofNullable(cacheDeRegistrosPai.get(nomeRegistroPai));
			if (!idRegistroPai.isPresent()) {
				throw new IllegalStateException(
						"Não foi encontrado última referência para o registro pai informado: "
								+ nomeRegistroPai);
			}
			Long idRegistroAtual = ocorrencia.equals(TipoOcorrencia.UNICA) ? idRegistroPai.get()
					: gerarIdAtual(teaId, numeroLinhaAtual);

			LOGGER.info("idRegistroPai: {}", idRegistroPai.get());
			LOGGER.info("idRegistroAtual: {}", idRegistroAtual);

			Object instanciaClasseRegistro =
					obterInstanciaDeRegistro(teaDataCarga, linha, classeRegistro, ocorrencia,
							possuiDataPart, idRegistroPai.get(), idRegistroAtual);
			registrosProcessados.add(instanciaClasseRegistro);
			cacheDeRegistrosPai.put(nomeRegistroAtual, idRegistroAtual);
		}

		repository.salvarRegistrosWhile(registrosProcessados);

		return registrosProcessados;
	}

	public List<Object> processarRegistrosStream(Long teaId, Date teaDataCarga,
			BufferedReader arquivoEfd) {
		Map<String, Long> cacheDeRegistrosPai = new HashMap<>();

		List<Object> registrosProcessados = new ArrayList<>();
		CollectionUtils
				.zipWithIndex(arquivoEfd.lines().filter(RegistroService::filtros)).forEach(entrada -> {
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
						LOGGER.info("Processando registro {}", REGISTRO_PAI);

						cacheDeRegistrosPai.put(nomeRegistroAtual, teaId);
						registrosProcessados.add(ClassUtils.obterInstancia(classeRegistro, linha, teaId,
						teaDataCarga));
						return;
					}

					String nomeRegistroPai =
							classeRegistro.getAnnotation(Metadados.class).nomeRegistroPai();
					TipoOcorrencia ocorrencia = TipoOcorrencia
							.valueOf(classeRegistro.getAnnotation(Metadados.class).ocorrencia());
					boolean possuiDataPart =
							classeRegistro.isAnnotationPresent(PossuiDataPart.class);

					LOGGER.info("Nome registro atual: {}", nomeRegistroAtual);
					LOGGER.info("Nome registro pai: {}", nomeRegistroPai);
					LOGGER.info("Ocorrência: {}", ocorrencia);

					Optional<Long> idRegistroPai =
							Optional.ofNullable(cacheDeRegistrosPai.get(nomeRegistroPai));
					if (!idRegistroPai.isPresent()) {
						throw new IllegalStateException(
								"Não foi encontrado última referência para o registro pai informado: "
										+ nomeRegistroPai);
					}
					Long idRegistroAtual =
							ocorrencia.equals(TipoOcorrencia.UNICA) ? idRegistroPai.get()
									: gerarIdAtual(teaId, numeroLinhaAtual);

					LOGGER.info("idRegistroPai: {}", idRegistroPai.get());
					LOGGER.info("idRegistroAtual: {}", idRegistroAtual);

					Object instanciaClasseRegistro = obterInstanciaDeRegistro(teaDataCarga, linha,
							classeRegistro, ocorrencia, possuiDataPart, idRegistroPai.get(),
							idRegistroAtual);
					cacheDeRegistrosPai.put(nomeRegistroAtual, idRegistroAtual);

					registrosProcessados.add(instanciaClasseRegistro);
				});

		repository.salvarRegistros(registrosProcessados);

		return registrosProcessados;
	}

	private Object obterInstanciaDeRegistro(Date teaDataCarga, String linha,
			Class<?> classeRegistro, TipoOcorrencia ocorrencia, boolean possuiDataPart,
			Long idRegistroPai, Long idRegistroAtual) {
		Object instanciaClasseRegistro = null;

		if (ocorrencia.equals(TipoOcorrencia.UNICA) && possuiDataPart) {
			instanciaClasseRegistro =
					ClassUtils.obterInstancia(classeRegistro, linha, idRegistroPai, teaDataCarga);
		}

		if (ocorrencia.equals(TipoOcorrencia.UNICA) && !possuiDataPart) {
			instanciaClasseRegistro =
					ClassUtils.obterInstancia(classeRegistro, linha, idRegistroPai);
		}

		if (ocorrencia.equals(TipoOcorrencia.MULTIPLA) && possuiDataPart) {
			instanciaClasseRegistro = ClassUtils.obterInstancia(classeRegistro, linha,
					idRegistroAtual, idRegistroPai, teaDataCarga);
		}

		if (ocorrencia.equals(TipoOcorrencia.MULTIPLA) && !possuiDataPart) {
			instanciaClasseRegistro = ClassUtils.obterInstancia(classeRegistro, linha,
					idRegistroAtual, idRegistroPai);
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

}

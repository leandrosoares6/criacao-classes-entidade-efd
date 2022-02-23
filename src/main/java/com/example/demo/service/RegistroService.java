package com.example.demo.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import javax.persistence.Entity;
import com.example.demo.enums.TipoOcorrencia;
import com.example.demo.model.anotacoes.Metadados;
import com.example.demo.model.anotacoes.PossuiDataPart;
import com.example.demo.util.ClassUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

	private static final Logger LOGGER = LoggerFactory.getLogger(RegistroService.class);
	private static final String PACOTE = "com.example.demo.model.registros";
	private final EntidadeRegistroFactory classFactory;

	public RegistroService(@Autowired EntidadeRegistroFactory classFactory) {
		this.classFactory = classFactory;
	}

	public List<?> listaRegistros() {
		List<Object> registros = new ArrayList<>();

		BufferedReader conteudoArquivo = new BufferedReader(new StringReader(
				"|0000|015|0|01082017|31082017|POSTO CARCARA LTDA|07659546000106||PI|194579760|2204204|12||B|1|\n"
						+ "|0005|SCHULZ S.A|89219600|RUA DONA FRANCISCA|6901||DISTRITO INDUSTRIAL|4734516120||SCHULZ@SCHULZ.COM.BR|\n"
						+ "|0150|3483|SCHULZ S.A.|1058|84693183000168||250338815|4209102||RUA DONA FRANCISCA|6901||DISTRITO INDUSTRIAL|\n"));
		// +
		// "|C113|1|0|3483|55|003||643332|07102019|42191084693183000168550030006433321986642250|\n"
		// + "|E200|PI|01032021|31032021|\n" + "\n"));

		conteudoArquivo.lines().filter(linha -> !linha.isBlank()).forEach(linha -> {
			String[] campos = linha.split("\\|");

			if (Objects.isNull(ClassUtils.obterClassePorCaminho(PACOTE + "." + campos[1]))) {
				throw new IllegalStateException(String
						.format("A classe para o registro %s não foi encontrada.", campos[1]));
			}
			Object obj = classFactory.criaInstanciaDeRegistro("Registro" + campos[1], linha);

			if (Objects.isNull(obj)) {
				throw new IllegalStateException("Registro " + campos[1] + " não encontrado!");
			}
			registros.add(obj);
		});

		return registros;
	}

	public List<Entity> processaArquivoEfd(Long teaId, Date teaDataCarga, BufferedReader arquivoEfd)
			throws IOException {
		Map<String, Long> cacheDeRegistrosPai = new HashMap<>();
		List<Entity> registrosProcessados = new ArrayList<>();

		AtomicInteger contadorDeLinha = new AtomicInteger(0);

		for (String linha = arquivoEfd.readLine(); linha != null; linha = arquivoEfd.readLine()) {
			var numeroLinhaAtual = contadorDeLinha.incrementAndGet();
			var colunas = linha.split("\\|");
			var nomeRegistroAtual = colunas[1];
			var caminhoClasse = PACOTE + "." + nomeRegistroAtual;
			Class<?> classeRegistro = ClassUtils.obterClassePorCaminho(caminhoClasse);

			if (Objects.isNull(classeRegistro)) {
				throw new IllegalStateException(String.format(
						"A classe para o registro %s não foi encontrada.", nomeRegistroAtual));
			}

			if (nomeRegistroAtual.equals("0000")) {
				LOGGER.info("Processando registro 0000");

				registrosProcessados.add((Entity) classFactory.criaInstanciaDeRegistro(
						"Registro" + nomeRegistroAtual, linha, teaId, teaDataCarga));
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
			registrosProcessados.add((Entity) instanciaClasseRegistro);
			cacheDeRegistrosPai.put(nomeRegistroAtual, idRegistroAtual);
		}

		return registrosProcessados;
	}

	private Object obterInstanciaDeRegistro(Date teaDataCarga, String linha,
			Class<?> classeRegistro, TipoOcorrencia ocorrencia, boolean possuiDataPart,
			Long idRegistroPai, Long idRegistroAtual) {
		Object instanciaClasseRegistro = null;
		if (ocorrencia.equals(TipoOcorrencia.UNICA) && possuiDataPart) {
			try {
				instanciaClasseRegistro =
						classeRegistro.getConstructor(String.class, Long.class, Date.class)
								.newInstance(linha, idRegistroPai, teaDataCarga);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}

		if (ocorrencia.equals(TipoOcorrencia.UNICA) && !possuiDataPart) {
			try {
				instanciaClasseRegistro = classeRegistro.getConstructor(String.class, Long.class)
						.newInstance(linha, idRegistroPai);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}

		if (ocorrencia.equals(TipoOcorrencia.MULTIPLA) && possuiDataPart) {
			try {
				instanciaClasseRegistro = classeRegistro
						.getConstructor(String.class, Long.class, Long.class, Date.class)
						.newInstance(linha, idRegistroAtual, idRegistroPai, teaDataCarga);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}

		if (ocorrencia.equals(TipoOcorrencia.MULTIPLA) && !possuiDataPart) {
			try {
				instanciaClasseRegistro =
						classeRegistro.getConstructor(String.class, Long.class, Long.class)
								.newInstance(linha, idRegistroAtual, idRegistroPai);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}
		return instanciaClasseRegistro;
	}

	private static Long gerarIdAtual(Long teaId, int andIncrement) {
		var incrementoFormatado = String.format("%09d", andIncrement);
		return Long.parseLong(
				String.valueOf(teaId.intValue()).concat(String.valueOf(incrementoFormatado)));
	}
}

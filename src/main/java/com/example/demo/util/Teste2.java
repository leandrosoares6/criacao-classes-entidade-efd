package com.example.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class Teste2 {
	public static void main(String[] args) throws IOException {
		List<Entity> resultadoProcessamento = processaArquivoEfd(1L, arquivoEfdExemplo());
		System.out.println("Total de itens processados: " + resultadoProcessamento.size());
		resultadoProcessamento.forEach(System.out::println);
	}

	static List<Entity> processaArquivoEfd(Long teaId, BufferedReader arquivoEfd)
			throws IOException {
		Map<String, Long> cacheDeRegistrosPai = new HashMap<>();
		List<Entity> registrosProcessados = new ArrayList<>();

		AtomicInteger contadorDeLinha = new AtomicInteger(0);

		for (String linha = arquivoEfd.readLine(); linha != null; linha = arquivoEfd.readLine()) {
			var numeroLinhaAtual = contadorDeLinha.incrementAndGet();
			var colunas = linha.split("\\|");
			var nomeRegistroAtual = colunas[1];

			if (nomeRegistroAtual.equals("0000")) {
				System.out.println("Processando registro 0000");

				registrosProcessados.add(
						new Entity(teaId, nomeRegistroAtual, colunas[2], colunas[3], colunas[4]));
				cacheDeRegistrosPai.put(nomeRegistroAtual, teaId);
				continue;
			}

			Tuple<String, String> metadadosRegistroAtual = obterMetadadosRegistro(nomeRegistroAtual);
			String nomeRegistroPai = metadadosRegistroAtual.getLeft();
			String ocorrencia = metadadosRegistroAtual.getRight();

			System.out.println("Nome registro atual: " + nomeRegistroAtual);
			System.out.println("Nome registro pai: " + nomeRegistroPai);
			System.out.println("Ocorrência: " + ocorrencia);

			Optional<Long> idRegistroPai = Optional.ofNullable(cacheDeRegistrosPai.get(nomeRegistroPai));
			if (!idRegistroPai.isPresent()) {
				throw new IllegalStateException(
						"Não foi encontrado última referência para o registro pai informado: "
								+ nomeRegistroPai);
			}
			Long idRegistroAtual = ocorrencia.equals("1:1") ? idRegistroPai.get()
					: gerarIdAtual(teaId, numeroLinhaAtual);

			System.out.println("idRegistroPai: " + idRegistroPai.get());
			System.out.println("idRegistroAtual: " + idRegistroAtual);

			registrosProcessados.add(new Entity(idRegistroAtual, nomeRegistroAtual, colunas[2],
					colunas[3], colunas[4], idRegistroPai.get()));
			cacheDeRegistrosPai.put(nomeRegistroAtual, idRegistroAtual);
		}

		return registrosProcessados;
	}

	private static Long gerarIdAtual(Long teaId, int andIncrement) {
		var incrementoFormatado = String.format("%09d", andIncrement);
		return Long.parseLong(
				String.valueOf(teaId.intValue()).concat(String.valueOf(incrementoFormatado)));
	}

	static BufferedReader arquivoEfdExemplo() throws IOException {

		String dados = new String(Files.readAllBytes(Path.of(("0002 - C191.txt"))));
		return new BufferedReader(new java.io.StringReader(dados));

		// StringBuilder sb = new StringBuilder();
		// sb.append("|0000|0000|0000|0000|" + "\n");
		// sb.append("|0002|0000|0000|0000|" + "\n");
		// sb.append("|0005|0000|0000|0000|" + "\n");
		// sb.append("|0015|0000|0000|0000|" + "\n");
		// sb.append("|0100|0000|0000|0000|" + "\n");
		// sb.append("|0150|0000|0000|0000|" + "\n");
		// sb.append("|0175|0000|0000|0000|" + "\n");
		// sb.append("|0190|0000|0000|0000|" + "\n");
		// sb.append("|0200|0000|0000|0000|" + "\n");
		// sb.append("|0205|0000|0000|0000|" + "\n");
		// sb.append("|0206|0000|0000|0000|" + "\n");
		// sb.append("|0220|0000|0000|0000|" + "\n");
		// sb.append("|0300|0000|0000|0000|" + "\n");
		// sb.append("|0305|0000|0000|0000|" + "\n");
		// sb.append("|0400|0000|0000|0000|" + "\n");
		// sb.append("|0450|0000|0000|0000|" + "\n");
		// sb.append("|0460|0000|0000|0000|" + "\n");
		// sb.append("|0500|0000|0000|0000|" + "\n");
		// sb.append("|0600|0000|0000|0000|" + "\n");
		// sb.append("|C100|0000|0000|0000|" + "\n");
		// sb.append("|C101|0000|0000|0000|" + "\n");
		// sb.append("|C105|0000|0000|0000|" + "\n");
		// sb.append("|C110|0000|0000|0000|" + "\n");
		// sb.append("|C111|0000|0000|0000|" + "\n");
		// sb.append("|C112|0000|0000|0000|" + "\n");
		// sb.append("|C113|0000|0000|0000|" + "\n");
		// sb.append("|C114|0000|0000|0000|" + "\n");
		// sb.append("|C115|0000|0000|0000|" + "\n");
		// sb.append("|C116|0000|0000|0000|" + "\n");
		// sb.append("|C120|0000|0000|0000|" + "\n");
		// sb.append("|C130|0000|0000|0000|" + "\n");
		// sb.append("|C140|0000|0000|0000|" + "\n");
		// sb.append("|C141|0000|0000|0000|" + "\n");
		// sb.append("|C160|0000|0000|0000|" + "\n");
		// sb.append("|C165|0000|0000|0000|" + "\n");
		// sb.append("|C170|0000|0000|0000|" + "\n");
		// sb.append("|C171|0000|0000|0000|" + "\n");
		// sb.append("|C172|0000|0000|0000|" + "\n");
		// sb.append("|C173|0000|0000|0000|" + "\n");
		// sb.append("|C174|0000|0000|0000|" + "\n");
		// sb.append("|C175|0000|0000|0000|" + "\n");
		// sb.append("|C176|0000|0000|0000|" + "\n");
		// sb.append("|C177|0000|0000|0000|" + "\n");
		// sb.append("|C178|0000|0000|0000|" + "\n");
		// sb.append("|C179|0000|0000|0000|" + "\n");
		// sb.append("|C180|0000|0000|0000|" + "\n");
		// sb.append("|C181|0000|0000|0000|" + "\n");
		// sb.append("|C185|0000|0000|0000|" + "\n");
		// sb.append("|C186|0000|0000|0000|" + "\n");
		// sb.append("|C190|0000|0000|0000|" + "\n");
		// sb.append("|C191|0000|0000|0000|" + "\n");
		// sb.append("|C195|0000|0000|0000|" + "\n");
		// sb.append("|C197|0000|0000|0000|" + "\n");
		// sb.append("|C300|0000|0000|0000|" + "\n");
		// sb.append("|C310|0000|0000|0000|" + "\n");
		// sb.append("|C320|0000|0000|0000|" + "\n");
		// sb.append("|C321|0000|0000|0000|" + "\n");
		// sb.append("|C330|0000|0000|0000|" + "\n");
		// sb.append("|C350|0000|0000|0000|" + "\n");
		// sb.append("|C370|0000|0000|0000|" + "\n");
		// sb.append("|C380|0000|0000|0000|" + "\n");
		// sb.append("|C390|0000|0000|0000|" + "\n");
		// sb.append("|C400|0000|0000|0000|" + "\n");
		// sb.append("|C405|0000|0000|0000|" + "\n");
		// sb.append("|C410|0000|0000|0000|" + "\n");
		// sb.append("|C420|0000|0000|0000|" + "\n");
		// sb.append("|C425|0000|0000|0000|" + "\n");
		// sb.append("|C430|0000|0000|0000|" + "\n");
		// sb.append("|C460|0000|0000|0000|" + "\n");
		// sb.append("|C465|0000|0000|0000|" + "\n");
		// sb.append("|C470|0000|0000|0000|" + "\n");
		// sb.append("|C480|0000|0000|0000|" + "\n");
		// sb.append("|C490|0000|0000|0000|" + "\n");
		// sb.append("|C495|0000|0000|0000|" + "\n");
		// sb.append("|C500|0000|0000|0000|" + "\n");
		// sb.append("|C510|0000|0000|0000|" + "\n");
		// sb.append("|C590|0000|0000|0000|" + "\n");
		// sb.append("|C591|0000|0000|0000|" + "\n");
		// sb.append("|C595|0000|0000|0000|" + "\n");
		// sb.append("|C597|0000|0000|0000|" + "\n");
		// sb.append("|C600|0000|0000|0000|" + "\n");
		// sb.append("|C601|0000|0000|0000|" + "\n");
		// sb.append("|C610|0000|0000|0000|" + "\n");
		// sb.append("|C690|0000|0000|0000|" + "\n");
		// sb.append("|C700|0000|0000|0000|" + "\n");
		// sb.append("|C790|0000|0000|0000|" + "\n");
		// sb.append("|C791|0000|0000|0000|" + "\n");
		// sb.append("|C800|0000|0000|0000|" + "\n");
		// sb.append("|C810|0000|0000|0000|" + "\n");
		// sb.append("|C815|0000|0000|0000|" + "\n");
		// sb.append("|C850|0000|0000|0000|" + "\n");
		// sb.append("|C860|0000|0000|0000|" + "\n");
		// sb.append("|C870|0000|0000|0000|" + "\n");
		// sb.append("|C880|0000|0000|0000|" + "\n");
		// sb.append("|C890|0000|0000|0000|" + "\n");
		// sb.append("|D100|0000|0000|0000|" + "\n");
		// sb.append("|D101|0000|0000|0000|" + "\n");
		// sb.append("|D110|0000|0000|0000|" + "\n");
		// sb.append("|D120|0000|0000|0000|" + "\n");
		// sb.append("|D130|0000|0000|0000|" + "\n");
		// sb.append("|D140|0000|0000|0000|" + "\n");
		// sb.append("|D150|0000|0000|0000|" + "\n");
		// sb.append("|D160|0000|0000|0000|" + "\n");
		// sb.append("|D161|0000|0000|0000|" + "\n");
		// sb.append("|D162|0000|0000|0000|" + "\n");
		// sb.append("|D170|0000|0000|0000|" + "\n");
		// sb.append("|D180|0000|0000|0000|" + "\n");
		// sb.append("|D190|0000|0000|0000|" + "\n");
		// sb.append("|D195|0000|0000|0000|" + "\n");
		// sb.append("|D197|0000|0000|0000|" + "\n");
		// sb.append("|D300|0000|0000|0000|" + "\n");
		// sb.append("|D301|0000|0000|0000|" + "\n");
		// sb.append("|D310|0000|0000|0000|" + "\n");
		// sb.append("|D350|0000|0000|0000|" + "\n");
		// sb.append("|D355|0000|0000|0000|" + "\n");
		// sb.append("|D360|0000|0000|0000|" + "\n");
		// sb.append("|D365|0000|0000|0000|" + "\n");
		// sb.append("|D370|0000|0000|0000|" + "\n");
		// sb.append("|D390|0000|0000|0000|" + "\n");
		// sb.append("|D400|0000|0000|0000|" + "\n");
		// sb.append("|D410|0000|0000|0000|" + "\n");
		// sb.append("|D411|0000|0000|0000|" + "\n");
		// sb.append("|D420|0000|0000|0000|" + "\n");
		// sb.append("|D500|0000|0000|0000|" + "\n");
		// sb.append("|D510|0000|0000|0000|" + "\n");
		// sb.append("|D530|0000|0000|0000|" + "\n");
		// sb.append("|D590|0000|0000|0000|" + "\n");
		// sb.append("|D600|0000|0000|0000|" + "\n");
		// sb.append("|D610|0000|0000|0000|" + "\n");
		// sb.append("|D690|0000|0000|0000|" + "\n");
		// sb.append("|D695|0000|0000|0000|" + "\n");
		// sb.append("|D696|0000|0000|0000|" + "\n");
		// sb.append("|D697|0000|0000|0000|" + "\n");
		// sb.append("|E100|0000|0000|0000|" + "\n");
		// sb.append("|E110|0000|0000|0000|" + "\n");
		// sb.append("|E111|0000|0000|0000|" + "\n");
		// sb.append("|E112|0000|0000|0000|" + "\n");
		// sb.append("|E113|0000|0000|0000|" + "\n");
		// sb.append("|E115|0000|0000|0000|" + "\n");
		// sb.append("|E116|0000|0000|0000|" + "\n");
		// sb.append("|E200|0000|0000|0000|" + "\n");
		// sb.append("|E210|0000|0000|0000|" + "\n");
		// sb.append("|E220|0000|0000|0000|" + "\n");
		// sb.append("|E230|0000|0000|0000|" + "\n");
		// sb.append("|E240|0000|0000|0000|" + "\n");
		// sb.append("|E250|0000|0000|0000|" + "\n");
		// sb.append("|E300|0000|0000|0000|" + "\n");
		// sb.append("|E310|0000|0000|0000|" + "\n");
		// sb.append("|E311|0000|0000|0000|" + "\n");
		// sb.append("|E312|0000|0000|0000|" + "\n");
		// sb.append("|E313|0000|0000|0000|" + "\n");
		// sb.append("|E316|0000|0000|0000|" + "\n");
		// sb.append("|E500|0000|0000|0000|" + "\n");
		// sb.append("|E510|0000|0000|0000|" + "\n");
		// sb.append("|E520|0000|0000|0000|" + "\n");
		// sb.append("|E530|0000|0000|0000|" + "\n");
		// sb.append("|E531|0000|0000|0000|" + "\n");
		// sb.append("|G110|0000|0000|0000|" + "\n");
		// sb.append("|G125|0000|0000|0000|" + "\n");
		// sb.append("|G130|0000|0000|0000|" + "\n");
		// sb.append("|G140|0000|0000|0000|" + "\n");
		// sb.append("|H005|0000|0000|0000|" + "\n");
		// sb.append("|H010|0000|0000|0000|" + "\n");
		// sb.append("|H020|0000|0000|0000|" + "\n");
		// sb.append("|H030|0000|0000|0000|" + "\n");
		// sb.append("|K100|0000|0000|0000|" + "\n");
		// sb.append("|K200|0000|0000|0000|" + "\n");
		// sb.append("|K210|0000|0000|0000|" + "\n");
		// sb.append("|K215|0000|0000|0000|" + "\n");
		// sb.append("|K220|0000|0000|0000|" + "\n");
		// sb.append("|K230|0000|0000|0000|" + "\n");
		// sb.append("|K235|0000|0000|0000|" + "\n");
		// sb.append("|K250|0000|0000|0000|" + "\n");
		// sb.append("|K255|0000|0000|0000|" + "\n");
		// sb.append("|K260|0000|0000|0000|" + "\n");
		// sb.append("|K265|0000|0000|0000|" + "\n");
		// sb.append("|K270|0000|0000|0000|" + "\n");
		// sb.append("|K275|0000|0000|0000|" + "\n");
		// sb.append("|K280|0000|0000|0000|" + "\n");
		// sb.append("|K290|0000|0000|0000|" + "\n");
		// sb.append("|K291|0000|0000|0000|" + "\n");
		// sb.append("|K292|0000|0000|0000|" + "\n");
		// sb.append("|K300|0000|0000|0000|" + "\n");
		// sb.append("|K301|0000|0000|0000|" + "\n");
		// sb.append("|K302|0000|0000|0000|" + "\n");
		// sb.append("|1010|0000|0000|0000|" + "\n");
		// sb.append("|1100|0000|0000|0000|" + "\n");
		// sb.append("|1105|0000|0000|0000|" + "\n");
		// sb.append("|1110|0000|0000|0000|" + "\n");
		// sb.append("|1200|0000|0000|0000|" + "\n");
		// sb.append("|1210|0000|0000|0000|" + "\n");
		// sb.append("|1300|0000|0000|0000|" + "\n");
		// sb.append("|1310|0000|0000|0000|" + "\n");
		// sb.append("|1320|0000|0000|0000|" + "\n");
		// sb.append("|1350|0000|0000|0000|" + "\n");
		// sb.append("|1360|0000|0000|0000|" + "\n");
		// sb.append("|1370|0000|0000|0000|" + "\n");
		// sb.append("|1390|0000|0000|0000|" + "\n");
		// sb.append("|1391|0000|0000|0000|" + "\n");
		// sb.append("|1400|0000|0000|0000|" + "\n");
		// sb.append("|1500|0000|0000|0000|" + "\n");
		// sb.append("|1510|0000|0000|0000|" + "\n");
		// sb.append("|1600|0000|0000|0000|" + "\n");
		// sb.append("|1601|0000|0000|0000|" + "\n");
		// sb.append("|1700|0000|0000|0000|" + "\n");
		// sb.append("|1710|0000|0000|0000|" + "\n");
		// sb.append("|1800|0000|0000|0000|" + "\n");
		// sb.append("|1900|0000|0000|0000|" + "\n");
		// sb.append("|1910|0000|0000|0000|" + "\n");
		// sb.append("|1920|0000|0000|0000|" + "\n");
		// sb.append("|1921|0000|0000|0000|" + "\n");
		// sb.append("|1922|0000|0000|0000|" + "\n");
		// sb.append("|1923|0000|0000|0000|" + "\n");
		// sb.append("|1925|0000|0000|0000|" + "\n");
		// sb.append("|1926|0000|0000|0000|" + "\n");
		// sb.append("|1960|0000|0000|0000|" + "\n");
		// sb.append("|1970|0000|0000|0000|" + "\n");
		// sb.append("|1975|0000|0000|0000|" + "\n");
		// sb.append("|1980|0000|0000|0000|" + "\n");
		// sb.append("|9900|0000|0000|0000|" + "\n");
		// sb.append("|9999|0000|0000|0000|" + "\n");

		// return new BufferedReader(new StringReader(sb.toString()));
	}

	static Map<String, Tuple<String, String>> obterRelacionamentos() {
		Map<String, Tuple<String, String>> mapaDeRegistros = new HashMap<>();
		mapaDeRegistros.put("0002", new Tuple<>("0000", "1:1"));
		mapaDeRegistros.put("0005", new Tuple<>("0000", "1:1"));
		mapaDeRegistros.put("0015", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0100", new Tuple<>("0000", "1:1"));
		mapaDeRegistros.put("0150", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0175", new Tuple<>("0150", "1:*"));
		mapaDeRegistros.put("0190", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0200", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0205", new Tuple<>("0200", "1:*"));
		mapaDeRegistros.put("0206", new Tuple<>("0200", "1:*"));
		mapaDeRegistros.put("0210", new Tuple<>("0200", "1:*"));
		mapaDeRegistros.put("0220", new Tuple<>("0200", "1:*"));
		mapaDeRegistros.put("0300", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0305", new Tuple<>("0300", "1:1"));
		mapaDeRegistros.put("0400", new Tuple<>("0000", "1:1"));
		mapaDeRegistros.put("0450", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0460", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0500", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("0600", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C100", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C101", new Tuple<>("C100", "1:1"));
		mapaDeRegistros.put("C105", new Tuple<>("C100", "1:1"));
		mapaDeRegistros.put("C110", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C111", new Tuple<>("C110", "1:*"));
		mapaDeRegistros.put("C112", new Tuple<>("C110", "1:*"));
		mapaDeRegistros.put("C113", new Tuple<>("C110", "1:*"));
		mapaDeRegistros.put("C114", new Tuple<>("C110", "1:*"));
		mapaDeRegistros.put("C115", new Tuple<>("C110", "1:*"));
		mapaDeRegistros.put("C116", new Tuple<>("C110", "1:*"));
		mapaDeRegistros.put("C120", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C130", new Tuple<>("C100", "1:1"));
		mapaDeRegistros.put("C140", new Tuple<>("C100", "1:1"));
		mapaDeRegistros.put("C141", new Tuple<>("C140", "1:*"));
		mapaDeRegistros.put("C160", new Tuple<>("C100", "1:1"));
		mapaDeRegistros.put("C165", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C170", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C171", new Tuple<>("C170", "1:*"));
		mapaDeRegistros.put("C172", new Tuple<>("C170", "1:1"));
		mapaDeRegistros.put("C173", new Tuple<>("C170", "1:*"));
		mapaDeRegistros.put("C174", new Tuple<>("C170", "1:*"));
		mapaDeRegistros.put("C175", new Tuple<>("C170", "1:*"));
		mapaDeRegistros.put("C176", new Tuple<>("C170", "1:*"));
		mapaDeRegistros.put("C177", new Tuple<>("C170", "1:1"));
		mapaDeRegistros.put("C178", new Tuple<>("C170", "1:1"));
		mapaDeRegistros.put("C179", new Tuple<>("C170", "1:1"));
		mapaDeRegistros.put("C180", new Tuple<>("C170", "1:1"));
		mapaDeRegistros.put("C181", new Tuple<>("C170", "1:*"));
		mapaDeRegistros.put("C185", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C186", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C190", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C191", new Tuple<>("C190", "1:1"));
		mapaDeRegistros.put("C195", new Tuple<>("C100", "1:*"));
		mapaDeRegistros.put("C197", new Tuple<>("C195", "1:*"));
		mapaDeRegistros.put("C300", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C310", new Tuple<>("C300", "1:*"));
		mapaDeRegistros.put("C320", new Tuple<>("C300", "1:*"));
		mapaDeRegistros.put("C321", new Tuple<>("C320", "1:*"));
		mapaDeRegistros.put("C330", new Tuple<>("C321", "1:1"));
		mapaDeRegistros.put("C350", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C370", new Tuple<>("C350", "1:*"));
		mapaDeRegistros.put("C380", new Tuple<>("C370", "1:1"));
		mapaDeRegistros.put("C390", new Tuple<>("C350", "1:*"));
		mapaDeRegistros.put("C400", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C405", new Tuple<>("C400", "1:*"));
		mapaDeRegistros.put("C410", new Tuple<>("C405", "1:1"));
		mapaDeRegistros.put("C420", new Tuple<>("C405", "1:*"));
		mapaDeRegistros.put("C425", new Tuple<>("C420", "1:*"));
		mapaDeRegistros.put("C430", new Tuple<>("C425", "1:*"));
		mapaDeRegistros.put("C460", new Tuple<>("C405", "1:*"));
		mapaDeRegistros.put("C465", new Tuple<>("C460", "1:1"));
		mapaDeRegistros.put("C470", new Tuple<>("C460", "1:*"));
		mapaDeRegistros.put("C480", new Tuple<>("C470", "1:1"));
		mapaDeRegistros.put("C490", new Tuple<>("C405", "1:*"));
		mapaDeRegistros.put("C495", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C500", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C510", new Tuple<>("C500", "1:*"));
		mapaDeRegistros.put("C590", new Tuple<>("C500", "1:*"));
		mapaDeRegistros.put("C591", new Tuple<>("C590", "1:*"));
		mapaDeRegistros.put("C595", new Tuple<>("C500", "1:*"));
		mapaDeRegistros.put("C597", new Tuple<>("C595", "1:*"));
		mapaDeRegistros.put("C600", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C601", new Tuple<>("C600", "1:*"));
		mapaDeRegistros.put("C610", new Tuple<>("C600", "1:*"));
		mapaDeRegistros.put("C690", new Tuple<>("C600", "1:*"));
		mapaDeRegistros.put("C700", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C790", new Tuple<>("C700", "1:*"));
		mapaDeRegistros.put("C791", new Tuple<>("C790", "1:*"));
		mapaDeRegistros.put("C800", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C810", new Tuple<>("C800", "1:*"));
		mapaDeRegistros.put("C815", new Tuple<>("C810", "1:1"));
		mapaDeRegistros.put("C850", new Tuple<>("C800", "1:*"));
		mapaDeRegistros.put("C860", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("C870", new Tuple<>("C860", "1:*"));
		mapaDeRegistros.put("C880", new Tuple<>("C870", "1:1"));
		mapaDeRegistros.put("C890", new Tuple<>("C860", "1:*"));
		mapaDeRegistros.put("D100", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D101", new Tuple<>("D100", "1:*"));
		mapaDeRegistros.put("D110", new Tuple<>("D100", "1:*"));
		mapaDeRegistros.put("D120", new Tuple<>("D110", "1:*"));
		mapaDeRegistros.put("D130", new Tuple<>("D100", "1:*"));
		mapaDeRegistros.put("D140", new Tuple<>("D100", "1:1"));
		mapaDeRegistros.put("D150", new Tuple<>("D100", "1:1"));
		mapaDeRegistros.put("D160", new Tuple<>("D100", "1:*"));
		mapaDeRegistros.put("D161", new Tuple<>("D160", "1:1"));
		mapaDeRegistros.put("D162", new Tuple<>("D160", "1:*"));
		mapaDeRegistros.put("D170", new Tuple<>("D100", "1:1"));
		mapaDeRegistros.put("D180", new Tuple<>("D100", "1:*"));
		mapaDeRegistros.put("D190", new Tuple<>("D100", "1:*"));
		mapaDeRegistros.put("D195", new Tuple<>("D190", "1:*"));
		mapaDeRegistros.put("D197", new Tuple<>("D195", "1:*"));
		mapaDeRegistros.put("D300", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D301", new Tuple<>("D300", "1:*"));
		mapaDeRegistros.put("D310", new Tuple<>("D300", "1:*"));
		mapaDeRegistros.put("D350", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D355", new Tuple<>("D350", "1:*"));
		mapaDeRegistros.put("D360", new Tuple<>("D355", "1:1"));
		mapaDeRegistros.put("D365", new Tuple<>("D355", "1:*"));
		mapaDeRegistros.put("D370", new Tuple<>("D365", "1:*"));
		mapaDeRegistros.put("D390", new Tuple<>("D355", "1:*"));
		mapaDeRegistros.put("D400", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D410", new Tuple<>("D400", "1:*"));
		mapaDeRegistros.put("D411", new Tuple<>("D410", "1:*"));
		mapaDeRegistros.put("D420", new Tuple<>("D400", "1:*"));
		mapaDeRegistros.put("D500", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D510", new Tuple<>("D500", "1:*"));
		mapaDeRegistros.put("D530", new Tuple<>("D500", "1:*"));
		mapaDeRegistros.put("D590", new Tuple<>("D500", "1:*"));
		mapaDeRegistros.put("D600", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D610", new Tuple<>("D600", "1:*"));
		mapaDeRegistros.put("D690", new Tuple<>("D600", "1:*"));
		mapaDeRegistros.put("D695", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("D696", new Tuple<>("D695", "1:*"));
		mapaDeRegistros.put("D697", new Tuple<>("D696", "1:*"));
		mapaDeRegistros.put("E100", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("E110", new Tuple<>("E100", "1:*"));
		mapaDeRegistros.put("E111", new Tuple<>("E110", "1:*"));
		mapaDeRegistros.put("E112", new Tuple<>("E111", "1:*"));
		mapaDeRegistros.put("E113", new Tuple<>("E111", "1:*"));
		mapaDeRegistros.put("E115", new Tuple<>("E110", "1:*"));
		mapaDeRegistros.put("E116", new Tuple<>("E110", "1:*"));
		mapaDeRegistros.put("E200", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("E210", new Tuple<>("E200", "1:*"));
		mapaDeRegistros.put("E220", new Tuple<>("E210", "1:*"));
		mapaDeRegistros.put("E230", new Tuple<>("E220", "1:*"));
		mapaDeRegistros.put("E240", new Tuple<>("E220", "1:*"));
		mapaDeRegistros.put("E250", new Tuple<>("E210", "1:*"));
		mapaDeRegistros.put("E300", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("E310", new Tuple<>("E300", "1:*"));
		mapaDeRegistros.put("E311", new Tuple<>("E310", "1:*"));
		mapaDeRegistros.put("E312", new Tuple<>("E311", "1:*"));
		mapaDeRegistros.put("E313", new Tuple<>("E311", "1:*"));
		mapaDeRegistros.put("E316", new Tuple<>("E310", "1:*"));
		mapaDeRegistros.put("E500", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("E510", new Tuple<>("E500", "1:*"));
		mapaDeRegistros.put("E520", new Tuple<>("E500", "1:*"));
		mapaDeRegistros.put("E530", new Tuple<>("E520", "1:*"));
		mapaDeRegistros.put("E531", new Tuple<>("E530", "1:*"));
		mapaDeRegistros.put("G110", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("G125", new Tuple<>("G110", "1:*"));
		mapaDeRegistros.put("G126", new Tuple<>("G125", "1:*"));
		mapaDeRegistros.put("G130", new Tuple<>("G125", "1:*"));
		mapaDeRegistros.put("G140", new Tuple<>("G130", "1:*"));
		mapaDeRegistros.put("H005", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("H010", new Tuple<>("H005", "1:*"));
		mapaDeRegistros.put("H020", new Tuple<>("H010", "1:1"));
		mapaDeRegistros.put("H030", new Tuple<>("H010", "1:1"));
		mapaDeRegistros.put("K100", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("K200", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K210", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K215", new Tuple<>("K210", "1:*"));
		mapaDeRegistros.put("K220", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K230", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K235", new Tuple<>("K230", "1:*"));
		mapaDeRegistros.put("K250", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K255", new Tuple<>("K250", "1:*"));
		mapaDeRegistros.put("K260", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K265", new Tuple<>("K260", "1:*"));
		mapaDeRegistros.put("K270", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K275", new Tuple<>("K270", "1:*"));// fazer correção de FK no banco
																// para K265
		mapaDeRegistros.put("K280", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K290", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K291", new Tuple<>("K290", "1:*"));
		mapaDeRegistros.put("K292", new Tuple<>("K290", "1:*"));
		mapaDeRegistros.put("K300", new Tuple<>("K100", "1:*"));
		mapaDeRegistros.put("K301", new Tuple<>("K300", "1:*"));
		mapaDeRegistros.put("K302", new Tuple<>("K300", "1:*"));
		mapaDeRegistros.put("1010", new Tuple<>("0000", "1:1"));
		mapaDeRegistros.put("1100", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1105", new Tuple<>("1100", "1:*"));
		mapaDeRegistros.put("1110", new Tuple<>("1105", "1:*"));
		mapaDeRegistros.put("1200", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1210", new Tuple<>("1200", "1:*"));
		mapaDeRegistros.put("1300", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1310", new Tuple<>("1300", "1:*"));
		mapaDeRegistros.put("1320", new Tuple<>("1310", "1:*"));
		mapaDeRegistros.put("1350", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1360", new Tuple<>("1350", "1:*"));
		mapaDeRegistros.put("1370", new Tuple<>("1350", "1:*"));
		mapaDeRegistros.put("1390", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1391", new Tuple<>("1390", "1:1"));
		mapaDeRegistros.put("1400", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1500", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1510", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1600", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1601", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1700", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1710", new Tuple<>("1700", "1:*"));
		mapaDeRegistros.put("1800", new Tuple<>("0000", "1:1"));
		mapaDeRegistros.put("1900", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1910", new Tuple<>("1900", "1:*"));
		mapaDeRegistros.put("1920", new Tuple<>("1910", "1:1"));
		mapaDeRegistros.put("1921", new Tuple<>("1920", "1:*"));
		mapaDeRegistros.put("1922", new Tuple<>("1921", "1:*"));
		mapaDeRegistros.put("1923", new Tuple<>("1921", "1:*"));
		mapaDeRegistros.put("1925", new Tuple<>("1920", "1:*"));
		mapaDeRegistros.put("1926", new Tuple<>("1920", "1:*"));
		mapaDeRegistros.put("1960", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1970", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("1975", new Tuple<>("1970", "1:*"));
		mapaDeRegistros.put("1980", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("9900", new Tuple<>("0000", "1:*"));
		mapaDeRegistros.put("9999", new Tuple<>("0000", "1:*"));

		return Collections.unmodifiableMap(mapaDeRegistros);
	}

	private static Tuple<String, String> obterMetadadosRegistro(String nomeRegistroAtual) {
		Map<String, Tuple<String, String>> mapaDeRegistros = obterRelacionamentos();
		Tuple<String, String> tupla = mapaDeRegistros.get(nomeRegistroAtual);

		if (tupla == null) {
			throw new RuntimeException(
					"Não foi possível encontrar metadados para o registro " + nomeRegistroAtual);
		}

		return tupla;
	}

}

class Entity {
	private Long id;
	private String nome;
	private String coluna1;
	private String coluna2;
	private String coluna3;
	private Long idRegistroPai;

	public Entity(Long id, String nome, String coluna1, String coluna2, String coluna3) {
		this.id = id;
		this.nome = nome;
		this.coluna1 = coluna1;
		this.coluna2 = coluna2;
		this.coluna3 = coluna3;
	}

	@Override
	public String toString() {
		return "Entity [coluna1=" + coluna1 + ", coluna2=" + coluna2 + ", coluna3=" + coluna3
				+ ", id=" + id + ", idRegistroPai=" + idRegistroPai + ", nome=" + nome + "]";
	}

	public Entity(Long id, String nome, String coluna1, String coluna2, String coluna3,
			Long idRegistroPai) {
		this.id = id;
		this.nome = nome;
		this.coluna1 = coluna1;
		this.coluna2 = coluna2;
		this.coluna3 = coluna3;
		this.idRegistroPai = idRegistroPai;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getColuna1() {
		return coluna1;
	}

	public void setColuna1(String coluna1) {
		this.coluna1 = coluna1;
	}

	public String getColuna2() {
		return coluna2;
	}

	public void setColuna2(String coluna2) {
		this.coluna2 = coluna2;
	}

	public String getColuna3() {
		return coluna3;
	}

	public void setColuna3(String coluna3) {
		this.coluna3 = coluna3;
	}

	public Long getIdRegistroPai() {
		return idRegistroPai;
	}

	public void setIdRegistroPai(Long idRegistroPai) {
		this.idRegistroPai = idRegistroPai;
	}

}

class Tuple<L, R> {
	private final L l;
	private final R r;

	public Tuple(L l, R r) {
		this.l = l;
		this.r = r;
	}

	public L getLeft() {
		return l;
	}

	public R getRight() {
		return r;
	}
}

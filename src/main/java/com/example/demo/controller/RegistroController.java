package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.File;
import java.util.Date;
import java.util.List;
import com.example.demo.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.SneakyThrows;

@RestController
@RequestMapping("/registros")
public class RegistroController {

	private static final String CONTEUDO_ARQUIVO =
			"|0000|015|0|01082017|31082017|POSTO CARCARA LTDA|07659546000106||PI|194579760|2204204|12||B|1|\n"
					+ "|0005|SCHULZ S.A|89219600|RUA DONA FRANCISCA|6901||DISTRITO INDUSTRIAL|4734516120||SCHULZ@SCHULZ.COM.BR|\n"
					+ "|0015|PI|194579760|\n"
					+ "|0150|3483|SCHULZ S.A.|1058|84693183000168||250338815|4209102||RUA DONA FRANCISCA|6901||DISTRITO INDUSTRIAL|\n";

	@Autowired
	private RegistroService service;

	@GetMapping("/processar")
	public ResponseEntity<List<?>> processarRegistros() {
		var arquivo = obterArquivo("files/arquivo_v15_exemplo2.txt");
		// var arquivo = new BufferedReader(new StringReader(CONTEUDO_ARQUIVO));
		return ResponseEntity.ok(service.processarRegistros(1L, new Date(), arquivo));
	}

	@SneakyThrows
	private BufferedReader obterArquivo(String caminhoArquivo) {
		File arquivo = new ClassPathResource(caminhoArquivo).getFile();
		return new BufferedReader(new java.io.FileReader(arquivo));
	}

}

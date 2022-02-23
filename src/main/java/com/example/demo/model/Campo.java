package com.example.demo.model;

import com.example.demo.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Campo {

	private String nome;
	private String tipoDeDado;
	private int sequencial;

	public String getNomeAtributo() {
		return StringUtils.upperSnackCaseToCamelCase(nome);
	}
}

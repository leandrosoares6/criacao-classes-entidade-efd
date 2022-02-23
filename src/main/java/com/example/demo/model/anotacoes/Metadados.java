package com.example.demo.model.anotacoes;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Metadados {
	String nomeRegistroPai();

	String ocorrencia();
}

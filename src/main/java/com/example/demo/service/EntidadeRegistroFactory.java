package com.example.demo.service;

public interface EntidadeRegistroFactory {

	public Object criaInstanciaDeRegistro(String nomeClasseRegistro, Object... args);

}

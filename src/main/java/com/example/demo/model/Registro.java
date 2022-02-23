package com.example.demo.model;

import java.util.List;
import java.util.Objects;
import com.example.demo.enums.TipoOcorrencia;
import lombok.Getter;


@Getter
public class Registro {

	private String nome;
	private String nomeRegistroPai;
	private TipoOcorrencia ocorrencia;
	private List<Campo> campos;
	private boolean possuiDataPart;

	private static final String PADRAO_NOME_REGISTRO = "[A-Z0-9]\\d{3}";

	public Registro(String nome, String nomeRegistroPai, TipoOcorrencia ocorrencia,
			List<Campo> campos, boolean possuiDataPart) {

		setNome(nome);
		setNomeRegistroPai(nomeRegistroPai);
		this.ocorrencia = ocorrencia;
		setCampos(campos);
		this.possuiDataPart = possuiDataPart;
	}

	public void setNome(String nome) {
		validaNomeRegistro(nome);
		this.nome = nome;
	}

	public void setNomeRegistroPai(String nomeRegistroPai) {
		validaNomeRegistro(nomeRegistroPai);
		this.nomeRegistroPai = nomeRegistroPai;
	}

	public void setCampos(List<Campo> campos) {
		if (Objects.isNull(campos) || campos.isEmpty()) {
			throw new IllegalArgumentException("Lista de campos não pode ser nula ou vazia.");
		}
		this.campos = campos;
	}

	private void validaNomeRegistro(String nome) {
		if (Objects.isNull(nome) || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome do registro não pode ser nulo ou vazio.");
		}

		if (!nome.matches(PADRAO_NOME_REGISTRO)) {
			throw new IllegalArgumentException("Nome do registro no padrão incorreto.");
		}
	}

}

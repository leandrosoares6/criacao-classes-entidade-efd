package com.example.demo.model;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.persistence.Id;
import com.example.demo.model.anotacoes.Indice;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistroBase {

	private static final String CAMPO_ID_REG = "id";
	private static final String CAMPO_ID_REG_PAI = "idRegistroPai";
	private static final String CAMPO_DATA_PART = "dataPart";
	private static final String FORMATO_DATA_ARQUIVO = "ddMMyyyy";

	protected RegistroBase(String linha) {
		String[] linhaArray = linha.split("\\|");
		var indiceInicialCampos = 2;

		List<Field> fieldsSorted =
				Stream.of(getClass().getDeclaredFields()).filter(filtros())
						.sorted((f1, f2) -> f1.getAnnotation(Indice.class).valor()
								- f2.getAnnotation(Indice.class).valor())
						.collect(Collectors.toList());

		IntStream.range(0, linhaArray.length - indiceInicialCampos).forEach(i -> {
			if (i < fieldsSorted.size()) {
				fieldsSorted.get(i).setAccessible(true);
				try {
					var campo = linhaArray[i + indiceInicialCampos];
					var campoNaoVazio = campo != null && !campo.isEmpty();
					if (fieldsSorted.get(i).getType().isAssignableFrom(String.class)) {
						fieldsSorted.get(i).set(this, campo);
					} else if (fieldsSorted.get(i).getType().isAssignableFrom(Long.class)
							&& campoNaoVazio) {
						fieldsSorted.get(i).set(this, Long.valueOf(campo));
					} else if (fieldsSorted.get(i).getType().isAssignableFrom(Date.class)
							&& campoNaoVazio) {
						fieldsSorted.get(i).set(this,
								new SimpleDateFormat(FORMATO_DATA_ARQUIVO).parse(campo));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	protected RegistroBase(String linha, Long id) {
		this(linha);
		setIdRegistro(id, CAMPO_ID_REG);
	}

	protected RegistroBase(String linha, Long id, Date dataPart) {
		this(linha);
		setIdRegistro(id, CAMPO_ID_REG);
		setDataPart(dataPart);
	}

	protected RegistroBase(String linha, Long id, Long idRegistroPai) {
		this(linha);
		setIdRegistro(id, CAMPO_ID_REG);
		setIdRegistro(idRegistroPai, CAMPO_ID_REG_PAI);
	}

	protected RegistroBase(String linha, Long id, Long idRegistroPai, Date dataPart) {
		this(linha);
		setIdRegistro(id, CAMPO_ID_REG);
		setIdRegistro(idRegistroPai, CAMPO_ID_REG_PAI);
		setDataPart(dataPart);
	}

	private void setIdRegistro(Long id, String nomeCampo) {
		Field idRegistro = null;
		try {
			idRegistro = getClass().getField(nomeCampo);
			idRegistro.set(this, id);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private void setDataPart(Date dataPart) {
		Field campoDataPart = null;
		try {
			campoDataPart = getClass().getField(CAMPO_DATA_PART);
			campoDataPart.set(this, dataPart);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private static Predicate<Field> filtros() {
		return f -> !f.isAnnotationPresent(Id.class) && !f.getName().equals(CAMPO_DATA_PART)
				&& !f.getName().equals(CAMPO_ID_REG_PAI);
	}

}

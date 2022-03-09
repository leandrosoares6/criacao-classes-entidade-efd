package com.example.demo.model;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.persistence.Id;
import com.example.demo.model.anotacoes.Indice;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RegistroBase {

	private static final String REGISTRO_0000 = "Registro0000";
	private static final String CAMPO_ID_REG = "id";
	private static final String CAMPO_REG_PAI = "registroPai";
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

	protected RegistroBase(String linha, Object registroPai, Date dataPart) {
		this(linha);
		if (!Objects.isNull(dataPart))
			setFieldObjectValue(dataPart, CAMPO_DATA_PART);
		if (getClass().getSimpleName().equals(REGISTRO_0000)) {
			setFieldObjectValue(registroPai, CAMPO_ID_REG);
			return;
		}

		setFieldObjectValue(registroPai, CAMPO_REG_PAI);
	}

	protected RegistroBase(String linha, Long id, Object registroPai, Date dataPart) {
		this(linha);
		setFieldObjectValue(id, CAMPO_ID_REG);
		setFieldObjectValue(registroPai, CAMPO_REG_PAI);
		if (!Objects.isNull(dataPart))
			setFieldObjectValue(dataPart, CAMPO_DATA_PART);
	}

	private void setFieldObjectValue(Object value, String nomeCampo) {
		Field idRegistro = null;
		try {
			idRegistro = getClass().getDeclaredField(nomeCampo);
			idRegistro.setAccessible(true);
			idRegistro.set(this, value);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	private static Predicate<Field> filtros() {
		return f -> !f.isAnnotationPresent(Id.class) && !f.getName().equals(CAMPO_DATA_PART)
				&& !f.getName().equals(CAMPO_REG_PAI);
	}

}

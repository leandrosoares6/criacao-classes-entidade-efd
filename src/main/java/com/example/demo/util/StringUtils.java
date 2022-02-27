package com.example.demo.util;

import java.util.Date;
import java.util.stream.IntStream;

public class StringUtils {

	private StringUtils() {}

	public static String upperSnackCaseToCamelCase(String upperSnackCase) {
		StringBuilder sb = new StringBuilder();
		String[] words = upperSnackCase.split("_");
		IntStream.range(0, words.length).forEach(i -> {
			if (i == 0) {
				sb.append(words[i].toLowerCase());
			} else {
				sb.append(words[i].substring(0, 1).toUpperCase())
						.append(words[i].substring(1).toLowerCase());
			}
		});

		return sb.toString();
	}

	public static Class<?> obterTipoDoCampo(String tipoDeDado) {
		if (tipoDeDado.startsWith("NUMBER")) {
			return Long.class;
		}

		if (tipoDeDado.startsWith("VARCHAR2")) {
			return String.class;
		}

		return Date.class;
	}
}

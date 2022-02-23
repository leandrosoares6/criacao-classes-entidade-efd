package com.example.demo.util;

public class ClassUtils {

	private ClassUtils() {}

	public static Class<?> obterClassePorCaminho(String pathClass) {
		try {
			return Class.forName(pathClass, false, ClassUtils.class.getClassLoader());
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
}

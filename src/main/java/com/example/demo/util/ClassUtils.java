package com.example.demo.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassUtils {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtils.class);

	private ClassUtils() {}

	public static Class<?> obterClassePorCaminho(String pathClass) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(pathClass, false, ClassUtils.class.getClassLoader());
		} catch (ClassNotFoundException e) {
			LOGGER.error("Classe não encontrada: {}", pathClass);
			e.printStackTrace();
		}

		return clazz;
	}

	public static Object obterInstancia(Class<?> classe, Object... args) {
		Object instancia = null;
		Class<?>[] classes = new Class<?>[args.length];
		for (int i = 0; i < args.length; i++) {
			classes[i] = args[i].getClass();
		}

		try {
			Constructor<?> construtor = classe.getConstructor(classes);
			construtor.setAccessible(true);
			instancia = construtor.newInstance(args);
		} catch (NoSuchMethodException | SecurityException | InstantiationException
				| IllegalAccessException | InvocationTargetException e) {
			LOGGER.error("Erro ao instanciar classe: {}", classe.getName());
			e.printStackTrace();
		}

		return instancia;
	}
}

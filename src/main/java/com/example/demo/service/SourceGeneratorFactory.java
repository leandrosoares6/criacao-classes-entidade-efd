package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;
import org.burningwave.core.classes.UnitSourceGenerator;

public class SourceGeneratorFactory {

	private static final String DEFAULT_PACKAGE = "com.example.demo.model.registros";
	private static Map<String, UnitSourceGenerator> unitSourceGenerators = new HashMap<>();

	private SourceGeneratorFactory() {}

	public static UnitSourceGenerator get(String className, String packageName) {
		unitSourceGenerators.computeIfAbsent(className,
				k -> UnitSourceGenerator.create(packageName));
		return unitSourceGenerators.get(className);
	}

	public static UnitSourceGenerator get(String className) {
		return get(className, DEFAULT_PACKAGE);
	}

	public static void set(String className, UnitSourceGenerator unitSourceGenerator) {
		unitSourceGenerators.put(className, unitSourceGenerator);
	}

}

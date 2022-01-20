package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;
import org.burningwave.core.classes.UnitSourceGenerator;

public class SourceGeneratorFactory {

    private final static String DEFAULT_PACKAGE = "com.example.demo.model.registros";
    private static Map<String, UnitSourceGenerator> unitSourceGenerators = new HashMap<>();

    private SourceGeneratorFactory() {}

    public static UnitSourceGenerator get(String className, String packageName) {
        if (!unitSourceGenerators.containsKey(className)) {
            unitSourceGenerators.put(className, UnitSourceGenerator.create(packageName));
        }
        return unitSourceGenerators.get(className);
    }

    public static UnitSourceGenerator get(String className) {
        return get(className, DEFAULT_PACKAGE);
    }

    public static void set(String className, UnitSourceGenerator unitSourceGenerator) {
        unitSourceGenerators.put(className, unitSourceGenerator);
    }

}

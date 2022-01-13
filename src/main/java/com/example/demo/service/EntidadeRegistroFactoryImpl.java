package com.example.demo.service;

import static org.burningwave.core.assembler.StaticComponentContainer.Constructors;
import org.burningwave.core.assembler.ComponentContainer;
import org.burningwave.core.assembler.ComponentSupplier;
import org.burningwave.core.classes.ClassFactory;
import org.burningwave.core.classes.UnitSourceGenerator;
import org.springframework.stereotype.Component;

@Component
public class EntidadeRegistroFactoryImpl implements EntidadeRegistroFactory {

    private static final String PACOTE = "com.example.demo.model.registros";

    @Override
    public Object criaInstanciaDeRegistro(String nomeClasseRegistro, String linha) {
        UnitSourceGenerator gerador = UnitSourceGenerator.create(PACOTE);
        ComponentSupplier componentSupplier = ComponentContainer.getInstance();
        ClassFactory classFactory = componentSupplier.getClassFactory();
        ClassFactory.ClassRetriever classRetriever = classFactory.loadOrBuildAndDefine(gerador);
        Class<?> classeGerada = classRetriever.get(PACOTE + "." + nomeClasseRegistro);
        return Constructors.newInstanceOf(classeGerada, linha);
    }

}

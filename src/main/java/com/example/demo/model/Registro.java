package com.example.demo.model;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.persistence.Id;
import com.example.demo.util.Indice;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Registro {

    public Registro(String linha) {
        String[] linhaArray = linha.split("\\|");
        var indiceInicialCampos = 2;

        var fieldsSorted =
                Stream.of(getClass().getDeclaredFields())
                        .filter(f -> !f.isAnnotationPresent(Id.class))
                        .sorted((f1, f2) -> f1.getAnnotation(Indice.class).valor()
                                - f2.getAnnotation(Indice.class).valor())
                        .collect(Collectors.toList());

        IntStream.range(0, linhaArray.length - indiceInicialCampos).forEach(i -> {
            if (i < fieldsSorted.size()) {
                fieldsSorted.get(i).setAccessible(true);
                try {
                    fieldsSorted.get(i).set(this, linhaArray[i + indiceInicialCampos]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}

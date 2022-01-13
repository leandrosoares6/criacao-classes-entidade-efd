package com.example.demo.model;

import com.example.demo.util.Utils;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Campo {

    private String nome;
    private String funcaoBd;
    private Boolean eId;
    private Boolean eData;
    private Boolean eDataPart;
    private Integer sequencial;

    public String getNomeAtributo() {
        return Utils.upperSnackCaseToCamelCase(nome);
    }
}

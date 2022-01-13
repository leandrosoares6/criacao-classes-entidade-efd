package com.example.demo.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class RegistroTest {

    private String nome;
    private String nomeTabelaBd;
    private List<Campo> campos;

}

package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroService {

    private final EntidadeRegistroFactory classFactory;

    public RegistroService(@Autowired EntidadeRegistroFactory classFactory) {
        this.classFactory = classFactory;
    }

    public List<?> listaRegistros() {
        Object obj = classFactory.criaInstanciaDeRegistro("Registro0000",
                "|0000|015|0|01082017|31082017|POSTO CARCARA LTDA|07659546000106||PI|194579760|2204204|12||B|1|");
        return List.of(obj);

    }

}

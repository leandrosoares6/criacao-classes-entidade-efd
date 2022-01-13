package com.example.demo.controller;

import java.util.List;
import com.example.demo.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registros")
public class RegistroController {

    @Autowired
    private RegistroService service;

    @GetMapping
    public ResponseEntity<List<?>> listaRegistros() {
        return ResponseEntity.ok(service.listaRegistros());
    }

}

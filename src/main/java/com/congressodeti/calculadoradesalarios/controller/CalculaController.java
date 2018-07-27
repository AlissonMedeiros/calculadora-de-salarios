package com.congressodeti.calculadoradesalarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.congressodeti.calculadoradesalarios.service.CalculaRendaReal;
import com.congressodeti.calculadoradesalarios.service.CalculaSalarioRealCLT;

@RestController
public class CalculaController {

    private CalculaRendaReal real = new CalculaRendaReal();

    @PostMapping(value = "/calcula", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity calcula(@RequestBody Double renda) {
        return ResponseEntity.ok(real.calcula(renda));
    }
}

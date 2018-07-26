package com.congressodeti.calculadoradesalarios.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculaController {

    @PostMapping(value = "/calcula", produces = MediaType.APPLICATION_JSON_UTF8_VALUE
            , consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity calcula(@RequestBody Double renda) {
        return ResponseEntity.ok("{ \"pj\" : \"250\", \"clt\" : \"200\"}");
    }
}

package com.congressodeti.calculadoradesalarios.service.passos;

import org.assertj.core.api.Assertions;

import com.tngtech.jgiven.Stage;

public class EntaoVerificaValor extends Stage<EntaoVerificaValor> {

    private Double salario;

    public EntaoVerificaValor validaSalario(Double esperado) {
        Assertions.assertThat(salario).isEqualTo(esperado);
        return self();
    }
}

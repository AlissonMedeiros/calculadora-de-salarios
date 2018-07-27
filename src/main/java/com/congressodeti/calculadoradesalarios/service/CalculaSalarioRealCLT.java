package com.congressodeti.calculadoradesalarios.service;

import org.jetbrains.annotations.NotNull;


public class CalculaSalarioRealCLT {

    public static final double IR_FAIXA_INICIAL = 1903.99;
    public static final double FAIXA_INIAL_INSS = 1693.72;
    public static final double ALICUTA_INIAL_INSS = 0.08D;
    public static final double ALICOTA_SECUNDARIA_INSS = 0.09D;
    public static final double FIM_SEGUNDA_FAIXA_INSS = 2822.90;
    public static final double ALICOTA_FINAL_INSS = 0.11;

    public Double calcula(Double salarioCLT) {
        Double valorSemFGTS = salarioCLT - (salarioCLT * 0.074074);
        if(valorSemFGTS < IR_FAIXA_INICIAL) {
            return calculaINSSSemIR(valorSemFGTS);
        }
        if(valorSemFGTS < FIM_SEGUNDA_FAIXA_INSS) {
            return (valorSemFGTS * 0.075) + (valorSemFGTS * ALICOTA_SECUNDARIA_INSS);
        }
        return (valorSemFGTS * ALICOTA_FINAL_INSS) + (valorSemFGTS * 0.15);
    }

    @NotNull
    private Double calculaINSSSemIR(Double salarioCLT) {
        if(salarioCLT < FAIXA_INIAL_INSS) {
            return salarioCLT * ALICUTA_INIAL_INSS;
        }
        return salarioCLT * ALICOTA_SECUNDARIA_INSS;
    }

}

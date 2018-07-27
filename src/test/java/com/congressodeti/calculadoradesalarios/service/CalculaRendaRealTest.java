package com.congressodeti.calculadoradesalarios.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CalculaRendaRealTest {

    private CalculaRendaReal calculaRendaReal = new CalculaRendaReal();

    @Test
    public void quandoTenhoRenda2000EntaoRetornaSalarioRealCLTePJ() {
        Double rendaBrutal = 2000D;
        ResultadoSalarios resultado = calculaRendaReal.calcula(2000D);
        MatcherAssert.assertThat(resultado.clt, Matchers.closeTo(1833.33, 0.1D));
        MatcherAssert.assertThat(resultado.pj, Matchers.closeTo(1880.00, 0.1D));
    }

    @Test
    public void quandoTenhoRenda1500EntaoRetornaSalarioRealCLTePJ() {
        Double rendaBrutal = 1500D;
        ResultadoSalarios resultado = calculaRendaReal.calcula(1500);
        MatcherAssert.assertThat(resultado.clt, Matchers.closeTo(1388.89, 0.1D));
        MatcherAssert.assertThat(resultado.pj, Matchers.closeTo(1410D, 0.1D));
    }
}

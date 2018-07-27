package com.congressodeti.calculadoradesalarios.service;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CalculaDescontoPJTest {

    private CalculaDescontoPJ calculaDescontoPJ = new CalculaDescontoPJ();

    @Test
    public void quandoTenhoSalarioJP2000EntaoDescontaSimpes() {
        Double rendaBruta = 2000D;
        Double totalDeDescontos = calculaDescontoPJ.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(120, 0.0001D));
    }

    @Test
    public void quandoTenhoSalarioJP1500EntaoDescontaSimpes() {
        Double rendaBruta = 1500D;
        Double totalDeDescontos = calculaDescontoPJ.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(90, 0.0001D));
    }

    @Test
    public void quandoTenhoSalarioJP3000EntaoDescontaSimpes() {
        Double rendaBruta = 3000D;
        Double totalDeDescontos = calculaDescontoPJ.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(180, 0.0001D));
    }

    //TODO adicionar outros cenários
}

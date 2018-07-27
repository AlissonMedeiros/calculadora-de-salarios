package com.congressodeti.calculadoradesalarios.service;

import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

public class CalculaDescontoCLTTest {

    private CalculaSalarioRealCLT servico =  new CalculaSalarioRealCLT();

    @Test
    public void quandoEuTEnhoUmSalario2000EntaoTenhoDesconteIReINSS() {
        Double rendaBruta = 2000D;
        Double totalDeDescontos = servico.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(166.67D, 0.01D));
    }

    @Test
    public void quandoEuTEnhoUmSalario1500EntaoTenhoDesconteIReINSS() {
        Double rendaBruta = 1500D;
        Double totalDeDescontos = servico.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(111.11D, 0.01D));
    }

    @Test
    public void quandoEuTEnhoUmSalario1903_99EntaoTenhoDesconteIReINSS() {
        Double salarioCLT = 1903.99D;
        Double totalDeDescontos = servico.calcula(salarioCLT);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(158.67, 0.1D));
    }

    @Test
    public void quandoEuTEnhoUmSalario1903_98EntaoTenhoDesconteIReINSS() {
        Double rendaBruta = 1903.98D;
        Double totalDeDescontos = servico.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(158.66, 0.1D));
    }

    @Test
    public void quandoEuTEnhoUmSalario1904EntaoTenhoDesconteIReINSS() {
        Double rendaBruta = 1904D;
        Double totalDeDescontos = servico.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(158.66, 0.1D));
    }

    @Test
    public void quandoEuTEnhoUmSalario3000EntaoTenhoDesconteIReINSS() {
        Double rendaBruta = 3000D;
        Double totalDeDescontos = servico.calcula(rendaBruta);
        MatcherAssert.assertThat(totalDeDescontos, Matchers.closeTo(458.33, 0.1D));
    }

    //TODO adicionar outros cenários
}

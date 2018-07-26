package com.congressodeti.calculadoradesalarios.service;

import org.junit.Ignore;
import org.junit.Test;

import com.congressodeti.calculadoradesalarios.service.passos.DadoBeneficio;
import com.congressodeti.calculadoradesalarios.service.passos.EntaoVerificaValor;
import com.congressodeti.calculadoradesalarios.service.passos.QuandoConverteParaCLT;

public class CalculoPJSimplesTest {

	private DadoBeneficio dadoBeneficio;
	private QuandoConverteParaCLT quandoConverteParaCLT;
	private EntaoVerificaValor entaoVerificaValor;

	//TODO ver na proxima semana
	@Test
	@Ignore
	public void testeComBeneficios() {
		dadoBeneficio.temBeneficioMensalDe(350D); //Alimentação
		dadoBeneficio.temBeneficioMensalDe(150D); //Transporte
		quandoConverteParaCLT.calculoSalarioCLT(1500);
		entaoVerificaValor.validaSalario(2500D);
	}

}

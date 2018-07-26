package com.congressodeti.calculadoradesalarios.service.passos;

import com.congressodeti.calculadoradesalarios.service.CalculoPJSimples;
import com.tngtech.jgiven.Stage;

public class QuandoConverteParaCLT extends Stage<QuandoConverteParaCLT> {

	private CalculoPJSimples calculoPJSimples = new CalculoPJSimples();

	private double beneficios;

	public QuandoConverteParaCLT calculoSalarioCLT(double salarioClt) {
		calculoPJSimples.calcula(salarioClt, beneficios);
		return self();
	}

}

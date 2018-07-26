package com.congressodeti.calculadoradesalarios.service.passos;

import com.tngtech.jgiven.Stage;


public class DadoBeneficio extends Stage<DadoBeneficio> {

	private double beneficios = 0D;

	public DadoBeneficio temBeneficioMensalDe(double beneficio) {
		beneficios =+ beneficio;
		return self();
	}

}

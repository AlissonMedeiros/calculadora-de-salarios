package com.congressodeti.calculadoradesalarios.service;

import org.springframework.stereotype.Service;

@Service
public class CalculoPJSimples {

	//PJ é mais ou menos o dobro que CLT
	public double calcula(Double clt, Double beneficiosMensaisClt) {
		return (clt + beneficiosMensaisClt) * 2;
	}
}

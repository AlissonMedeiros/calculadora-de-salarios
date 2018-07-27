package com.congressodeti.calculadoradesalarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculaRendaReal {

    private CalculaDescontoPJ calculaDescontoPJ = new CalculaDescontoPJ();
    private CalculaSalarioRealCLT calculaSalarioRealCLT = new CalculaSalarioRealCLT();

    public ResultadoSalarios calcula(double rendaBruta) {
        ResultadoSalarios salarios = new ResultadoSalarios();
        salarios.clt = rendaBruta - calculaSalarioRealCLT.calcula(rendaBruta);
        salarios.pj = rendaBruta - calculaDescontoPJ.calcula(rendaBruta);
        return salarios;
    }

}

package com.congressodeti.calculadoradesalarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String bruto;
    public String clt;
    public String pj;
}

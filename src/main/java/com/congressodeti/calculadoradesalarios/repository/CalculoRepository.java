package com.congressodeti.calculadoradesalarios.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.congressodeti.calculadoradesalarios.model.Calculo;

@Repository
public interface CalculoRepository extends PagingAndSortingRepository<Calculo, Long> {
}

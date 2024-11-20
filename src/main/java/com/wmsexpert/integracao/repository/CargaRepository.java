package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Carga;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CargaRepository extends JpaRepository<Carga, String> {

}
package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Nota;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NotaRepository extends JpaRepository<Nota, String> {

    @Query("SELECT n FROM Nota n WHERE n.carga=:codigo")
    List<Nota> buscarPorCarga(String codigo);

}
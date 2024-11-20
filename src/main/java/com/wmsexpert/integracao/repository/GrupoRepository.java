package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Grupo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GrupoRepository extends JpaRepository<Grupo, String> {

    @Query("SELECT g FROM Grupo g WHERE g.codigo=:codigo")
    Optional<Grupo> buscarPorCodigo(String codigo);

}
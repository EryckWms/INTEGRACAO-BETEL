package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Fornecedor;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {

    @Query("SELECT f FROM Fornecedor f WHERE f.codigo=:codigo")
    Optional<Fornecedor> buscarPorCodigo(String codigo);

}
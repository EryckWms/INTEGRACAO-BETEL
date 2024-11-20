package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Produto;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    @Query("SELECT p FROM Produto p WHERE p.codigo=:codigo")
    Optional<Produto> buscarPorCodigo(String codigo);

}
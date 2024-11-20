package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Embalagem;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmbalagemRepository extends JpaRepository<Embalagem, String> {

    @Query("SELECT e FROM Embalagem e WHERE e.codigoproduto=:codigoproduto")
    List<Embalagem> buscarPorCodProduto(String codigoproduto);

}
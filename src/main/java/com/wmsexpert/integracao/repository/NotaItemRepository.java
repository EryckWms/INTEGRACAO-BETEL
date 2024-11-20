package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.NotaItem;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NotaItemRepository extends JpaRepository<NotaItem, Long> {

    @Query("SELECT n FROM NotaItem n WHERE n.codigonota=:codigonota")
    List<NotaItem> buscarPorCodNota(String codigonota);

}
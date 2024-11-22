package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.PedidoItem;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Integer> {

    @Query(value = "SELECT * FROM wmsexpert.EXPERT_PEDIDOSITEM ep WHERE CODIGOPEDIDO=:codigopedido", nativeQuery = true)
    List<PedidoItem> buscarPorCodPedido(String codigopedido);

}
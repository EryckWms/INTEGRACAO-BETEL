package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Pedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PedidoRepository extends JpaRepository<Pedido, String> {

//    @Query(value = "CALL EXPERT_IMPORTA_PEDIDO (:codigo)", nativeQuery = true)
//    void procedureImportarPedido(String codigo);

}
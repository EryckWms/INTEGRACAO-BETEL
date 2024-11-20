package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Carregamento;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarregamentoRepository extends JpaRepository<Carregamento, String> {

    @Query(value = "SELECT CODIGO FROM EXPERT_CARREGAMENTO ec GROUP BY ec.CODIGO", nativeQuery = true)
    List<String> listarCodigos();

    @Query(value = "SELECT * FROM EXPERT_CARREGAMENTO ec WHERE CODIGO =:codigo AND ROWNUM <= 1", nativeQuery = true)
    Carregamento buscarCarregamentoPorCodigo(String codigo);

    @Query(value = "SELECT ec.CODIGOPEDIDO FROM EXPERT_CARREGAMENTO ec WHERE CODIGO =:codigo", nativeQuery = true)
    List<String> buscarPedidosCarregamento(String codigo);

}
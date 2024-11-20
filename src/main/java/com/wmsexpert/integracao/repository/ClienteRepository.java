package com.wmsexpert.integracao.repository;

import com.wmsexpert.integracao.model.Cliente;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, String> {

    @Query("SELECT c FROM Cliente c WHERE c.codigo=:codigo")
    Optional<Cliente> buscarPorCodigo(String codigo);

}
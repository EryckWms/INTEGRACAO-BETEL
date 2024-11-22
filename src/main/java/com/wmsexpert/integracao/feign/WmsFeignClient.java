package com.wmsexpert.integracao.feign;

import com.wmsexpert.integracao.dto.wms.request.CredenciaisResquestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.CargaIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.CarregamentoIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.NotaIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.PedidoIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.response.IntegracaoDadoResponseDTO;
import com.wmsexpert.integracao.dto.wms.response.TokenResponseDTO;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@Service
@FeignClient(url = "${wms.api}" ,name = "wmsexpert")
public interface WmsFeignClient {

    //AUTENTICAÇÃO

    @PostMapping("/auth")
    TokenResponseDTO auth(@RequestHeader("Authorization") String token, @RequestBody CredenciaisResquestDTO dto);

    //VALIDAR DADOS POR CODIGO

    @GetMapping("/validar/{tipo}/{codigo}")
    ResponseEntity<IntegracaoDadoResponseDTO> validarDados(@RequestHeader("Authorization") String token, @PathVariable("tipo") String tipo ,@PathVariable("codigo") String codigoCarga, @RequestParam("codfilial") String codfilial);

    //CONTRUIR CHAMADA DE END POINT REFERENTE AO ENTRADA

    @PostMapping("/nota")
    ResponseEntity<String> cadastrarEntrada(@RequestHeader("Authorization") String token, @RequestBody NotaIntegraExternoRequestDTO dto);

    //CONTRUIR CHAMADA DE END POINT REFERENTE A CARGAS

    @PostMapping("/nota/carga")
    ResponseEntity<String> cadastrarCarga(@RequestHeader("Authorization") String token, @RequestBody CargaIntegraExternoRequestDTO dto);

    //CONTRUIR CHAMADA DE END POINT REFERENTE AO PEDIDO

    @PostMapping("/pedido")
    ResponseEntity<String> cadastrarSaida(@RequestHeader("Authorization") String token, @RequestBody PedidoIntegraExternoRequestDTO dto);

    //CONTRUIR CHAMADA DE END POINT REFERENTE A CARGAS

    @PostMapping("/pedido/carregamento")
    ResponseEntity<String> cadastrarCarregamento(@RequestHeader("Authorization") String token, @RequestBody CarregamentoIntegraExternoRequestDTO dto);

    //EXCLUSIVOS DO INTEGRA
    @PutMapping("/relacionar/carregamento")
    ResponseEntity<Void> relacionarCarregametnoPedido(@RequestHeader("Authorization") String token, @RequestParam("codcarregamento") String codcarregamento, @RequestParam("codpedido") String codpedido, @RequestParam("codfilial") String codfilial);

}

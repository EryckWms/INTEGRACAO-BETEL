package com.wmsexpert.integracao.controller;

import com.wmsexpert.integracao.service.exportacao.db.ExportacaoNotaService;
import com.wmsexpert.integracao.service.exportacao.db.ExportacaoPedidoService;
import com.wmsexpert.integracao.service.importacao.db.ImportacaoNotaDBService;
import com.wmsexpert.integracao.service.importacao.db.ImportacaoPedidoDBService;

import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile({"db_dev", "db_prod"})
@RestController
@RequestMapping("/integracao")
public class IntegracaoDbController {

    @Autowired
    private ImportacaoNotaDBService notaImportaDBService;
    @Autowired
    private ImportacaoPedidoDBService pedidoImportaDBService;
    @Autowired
    private ExportacaoNotaService notaExportaDBService;
    @Autowired
    private ExportacaoPedidoService pedidoExportaDBService;

    public IntegracaoDbController() {
    }

    @PostMapping("/nota")
    public ResponseEntity<String> importarNota(){
        notaImportaDBService.importarNota();
        return ResponseEntity.status(HttpStatus.OK).body("Importação de Notas finalizada!");
    }

    @PostMapping("/nota/carga")
    public ResponseEntity<String> importarCarga(){
        notaImportaDBService.importarCarga();
        return ResponseEntity.status(HttpStatus.OK).body("Importação de Cargas finalizadas!");
    }

    @PostMapping("/pedido")
    public ResponseEntity<String> importarPedido(){
        pedidoImportaDBService.importarPedido();
        return ResponseEntity.status(HttpStatus.OK).body("Importação de Pedidos finalizada!");
    }

    @PostMapping("/pedido/carregamento")
    public ResponseEntity<String> importarCarregamento(){
        pedidoImportaDBService.importarCarregamento();
        return ResponseEntity.status(HttpStatus.OK).body("Importação de Carregamentos finalizada!");
    }


    @Async
    @Scheduled(initialDelay = 1, fixedDelay = 5, timeUnit = TimeUnit.MINUTES)
    public void agendadorPedidoImporta(){

    }

    @Async
    @Scheduled(initialDelay = 1, fixedDelay = 5, timeUnit = TimeUnit.MINUTES)
    public void agendadorNotaImporta(){

    }

    @Async
    @Scheduled(initialDelay = 1, fixedDelay = 5, timeUnit = TimeUnit.MINUTES)
    public void agendadorNotaExporta(){

    }

    @Async
    @Scheduled(initialDelay = 1, fixedDelay = 5, timeUnit = TimeUnit.MINUTES)
    public void agendadorPedidoExporta(){

    }

}

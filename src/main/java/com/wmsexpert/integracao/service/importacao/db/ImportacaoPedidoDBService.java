package com.wmsexpert.integracao.service.importacao.db;

import com.wmsexpert.integracao.dto.wms.request.integraexterno.CarregamentoIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.PedidoIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.PedidoItemIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.response.IntegracaoDadoResponseDTO;
import com.wmsexpert.integracao.feign.WmsFeignClient;
import com.wmsexpert.integracao.model.Carregamento;
import com.wmsexpert.integracao.model.Pedido;
import com.wmsexpert.integracao.model.PedidoItem;
import com.wmsexpert.integracao.repository.CarregamentoRepository;
import com.wmsexpert.integracao.repository.PedidoItemRepository;
import com.wmsexpert.integracao.repository.PedidoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"db_dev", "db_prod"})
public class ImportacaoPedidoDBService extends ImportacaoDBService{

    @Autowired
    private WmsFeignClient wmsFeign;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private PedidoItemRepository pedidoItemRepository;
    @Autowired
    private CarregamentoRepository carregamentoRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(ImportacaoNotaDBService.class);

    public void importarCarregamento(){
        LOGGER.info("--------------------------------------------------------------------");
        LOGGER.info("                    IMPORTAÇÃO DE CARREGAMENTOS                     ");
        LOGGER.info("--------------------------------------------------------------------");
        List<String> codigosCarregamentoVw = carregamentoRepository.listarCodigos();
        for(String codigoCarregamentoVw : codigosCarregamentoVw){
            Carregamento carregamentoVw = carregamentoRepository.buscarCarregamentoPorCodigo(codigoCarregamentoVw);
            try {
                IntegracaoDadoResponseDTO carregamentoIsPresent = wmsFeign.validarDados(autenticarWMS(), "carregamento" , carregamentoVw.getCodigo(), carregamentoVw.getCodfilial()).getBody();
                if (!carregamentoIsPresent.getExist()) {
                    //SALVAR CARREGAMENTO
                    CarregamentoIntegraExternoRequestDTO dtoCarregamento = new CarregamentoIntegraExternoRequestDTO();
                    converterCarregamento(dtoCarregamento, carregamentoVw, null);
                    wmsFeign.cadastrarCarregamento(autenticarWMS(), dtoCarregamento);
                    //RELACIONAR PEDIDOS AO CARREGAMETNO
                    List<String> codigosPedidosVw = carregamentoRepository.buscarPedidosCarregamento(carregamentoVw.getCodigo());
                    for (String codigoPedidoVw : codigosPedidosVw){
                        wmsFeign.relacionarCarregametnoPedido(autenticarWMS(), codigoCarregamentoVw, codigoPedidoVw, carregamentoVw.getCodfilial());
                    }
                    LOGGER.info("--------------------------------------------------------------------");
                    LOGGER.info("CodCarregamento : " + carregamentoVw.getCodigo() + " gravada!");
                    LOGGER.info("--------------------------------------------------------------------");
                }
            }catch (Exception e){
                LOGGER.info("--------------------------------------------------------------------");
                LOGGER.info("CodCarregamento : " + carregamentoVw.getCodigo() + ", Error : " + e.getMessage());
                LOGGER.info("--------------------------------------------------------------------");
            }
        }
    }

    private void converterCarregamento(CarregamentoIntegraExternoRequestDTO dtoCarregamento, Carregamento carregamentoVw, List<PedidoIntegraExternoRequestDTO> dtoPedidos) {
        dtoCarregamento.setCodigo(carregamentoVw.getCodigo());
        dtoCarregamento.setMotorista(carregamentoVw.getMotorista());
        dtoCarregamento.setAjudante1(carregamentoVw.getAjudante1());
        dtoCarregamento.setAjudante2(carregamentoVw.getAjudante2());
        dtoCarregamento.setAjudante3(carregamentoVw.getAjudante3());
        dtoCarregamento.setDatageracao(carregamentoVw.getDatageracao());
        dtoCarregamento.setDatasaida(carregamentoVw.getDatasaida());
        dtoCarregamento.setDatachegada(carregamentoVw.getDatageracao());
        dtoCarregamento.setDestino(carregamentoVw.getDestino());
        dtoCarregamento.setKminicial(carregamentoVw.getKminicial());
        dtoCarregamento.setKmfinal(carregamentoVw.getKmfinal());
        dtoCarregamento.setStatus(1);
        dtoCarregamento.setCodfilial(carregamentoVw.getCodfilial());
        dtoCarregamento.setPedidos(dtoPedidos);
    }

    public void importarPedido(){
        LOGGER.info("--------------------------------------------------------------------");
        LOGGER.info("                       IMPORTAÇÃO DE PEDIDOS                        ");
        LOGGER.info("--------------------------------------------------------------------");
        List<Pedido> pedidosVw = pedidoRepository.findAll();
        for (Pedido pedidoVw : pedidosVw){
            try {
                IntegracaoDadoResponseDTO pedidoIsPresent = wmsFeign.validarDados(autenticarWMS(), "pedido", pedidoVw.getCodigo(), pedidoVw.getCodfilial()).getBody();
                if (!pedidoIsPresent.getExist()) {
                    PedidoIntegraExternoRequestDTO dtoPedido = new PedidoIntegraExternoRequestDTO();
                    List<PedidoItem> pedidoItensVw = pedidoItemRepository.buscarPorCodPedido(pedidoVw.getCodigo());
                    List<PedidoItemIntegraExternoRequestDTO> dtoPedidoItens = new ArrayList<>();
                    for (PedidoItem pedidoItemVw : pedidoItensVw) {
                        PedidoItemIntegraExternoRequestDTO dtoPedidoItem = new PedidoItemIntegraExternoRequestDTO();
                        converterPedidoItem(dtoPedidoItem, pedidoItemVw);
                        dtoPedidoItens.add(dtoPedidoItem);
                    }
                    converterPedido(dtoPedido, pedidoVw, dtoPedidoItens);
                    wmsFeign.cadastrarSaida(autenticarWMS(), dtoPedido);
                    LOGGER.info("--------------------------------------------------------------------");
                    LOGGER.info("CodPedido : " + pedidoVw.getCodigo() + " gravada!");
                    LOGGER.info("--------------------------------------------------------------------");
//                    pedidoRepository.procedureImportarPedido(pedidoVw.getCodigo());
                }
            }catch (Exception e){
                LOGGER.info("--------------------------------------------------------------------");
                LOGGER.info("Codpedido : " + pedidoVw.getCodigo() + ", Error : " + e.getMessage());
                LOGGER.info("--------------------------------------------------------------------");
            }
        }
    }

    private void converterPedido(PedidoIntegraExternoRequestDTO dtoPedido, Pedido pedidoVw, List<PedidoItemIntegraExternoRequestDTO> dtoPedidoItens) {
        dtoPedido.setCodigo(pedidoVw.getCodigo());
        dtoPedido.setCliente(importarCliente(pedidoVw.getCodigocliente()));
        dtoPedido.setVendedor(pedidoVw.getVendedor());
        dtoPedido.setTipo(Long.valueOf(pedidoVw.getTipo()));
        dtoPedido.setDataimportacao(LocalDateTime.now());
        dtoPedido.setTotalpedido(pedidoVw.getTotalpedido());
        dtoPedido.setOrdempedido(pedidoVw.getOrdempedido());
        dtoPedido.setQtditens(pedidoVw.getQtditens());
        dtoPedido.setStatus(pedidoVw.getStatus());
        dtoPedido.setCodfilial(pedidoVw.getCodfilial());
        dtoPedido.setDtexportacao(pedidoVw.getDtexportacao());
        dtoPedido.setItens(dtoPedidoItens);
    }

    private void converterPedidoItem(PedidoItemIntegraExternoRequestDTO dtopedidoItem, PedidoItem pedidoItemVw) {
        dtopedidoItem.setProduto(importarProduto(pedidoItemVw.getCodigoproduto()));
        dtopedidoItem.setQuantidade(pedidoItemVw.getQuantidade());
        dtopedidoItem.setQtdseparada(pedidoItemVw.getQtdseparada());
        dtopedidoItem.setQtdconferida(pedidoItemVw.getQtdconferida());
        dtopedidoItem.setQtdcortada(pedidoItemVw.getQtdcortada());
        dtopedidoItem.setItempedido(pedidoItemVw.getItempedido());
    }

}

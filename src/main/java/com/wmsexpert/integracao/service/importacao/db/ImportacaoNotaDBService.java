package com.wmsexpert.integracao.service.importacao.db;

import com.wmsexpert.integracao.dto.wms.request.integraexterno.CargaIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.NotaIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.request.integraexterno.NotaItemIntegraExternoRequestDTO;
import com.wmsexpert.integracao.dto.wms.response.IntegracaoDadoResponseDTO;
import com.wmsexpert.integracao.feign.WmsFeignClient;
import com.wmsexpert.integracao.model.Carga;
import com.wmsexpert.integracao.model.Nota;
import com.wmsexpert.integracao.model.NotaItem;
import com.wmsexpert.integracao.repository.CargaRepository;
import com.wmsexpert.integracao.repository.NotaItemRepository;
import com.wmsexpert.integracao.repository.NotaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"db_dev", "db_prod"})
public class ImportacaoNotaDBService extends ImportacaoDBService {

    @Autowired
    private NotaRepository notaRepository;
    @Autowired
    private WmsFeignClient wmsFeign;
    @Autowired
    private NotaItemRepository notaItemRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(ImportacaoNotaDBService.class);
    @Autowired
    private CargaRepository cargaRepository;

    public void importarCarga(){
        LOGGER.info("--------------------------------------------------------------------");
        LOGGER.info("                         IMPORTAÇÃO DE CARGAS                       ");
        LOGGER.info("--------------------------------------------------------------------");
        List<Carga> cargasVw = cargaRepository.findAll();
        for(Carga cargaVw : cargasVw){
            try {
                IntegracaoDadoResponseDTO cargaIsPresent = wmsFeign.validarDados(autenticarWMS(), "carga" , cargaVw.getCodigocarga(), cargaVw.getCodigofilial()).getBody();
                if (!cargaIsPresent.getExist()) {
                    CargaIntegraExternoRequestDTO dtoCarga = new CargaIntegraExternoRequestDTO();
                    List<Nota> notasVw = notaRepository.buscarPorCarga(cargaVw.getCodigocarga());
                    List<NotaIntegraExternoRequestDTO> dtoNotas = new ArrayList<>();
                    for (Nota notaVw : notasVw) {
                        NotaIntegraExternoRequestDTO dtoNota = new NotaIntegraExternoRequestDTO();
                        List<NotaItem> notaItensVw = notaItemRepository.buscarPorCodNota(notaVw.getCodigo());
                        List<NotaItemIntegraExternoRequestDTO> dtoEntradaItens = new ArrayList<>();
                        for (NotaItem notaItemVw : notaItensVw) {
                            NotaItemIntegraExternoRequestDTO dtoNotaItem = new NotaItemIntegraExternoRequestDTO();
                            converterNotaItem(dtoNotaItem, notaItemVw);
                            dtoEntradaItens.add(dtoNotaItem);
                        }
                        converterNota(dtoNota, notaVw, dtoEntradaItens);
                        dtoNotas.add(dtoNota);
                    }
                    converterCarga(dtoCarga, cargaVw, dtoNotas);
                    wmsFeign.cadastrarCarga(autenticarWMS(), dtoCarga);
                    LOGGER.info("--------------------------------------------------------------------");
                    LOGGER.info("CodCarga : " + cargaVw.getCodigocarga() + " gravada!");
                    LOGGER.info("--------------------------------------------------------------------");
                }
            }catch (Exception e){
                LOGGER.info("--------------------------------------------------------------------");
                LOGGER.info("CodCarga : " + cargaVw.getCodigocarga() + ", Error : " + e.getMessage());
                LOGGER.info("--------------------------------------------------------------------");
            }
        }
    }

    private void converterCarga(CargaIntegraExternoRequestDTO dtoCarga, Carga cargasVw, List<NotaIntegraExternoRequestDTO> dtoNotas) {
        dtoCarga.setCodigo(cargasVw.getCodigocarga());
        dtoCarga.setCodfilial(cargasVw.getCodigofilial());
        dtoCarga.setDatainicioconf(cargasVw.getDatainicioconf());
        dtoCarga.setDatafimconf(cargasVw.getDatafimconf());
        dtoCarga.setDataexportacaoerp(cargasVw.getDataexportacaoerp());
        dtoCarga.setQtdvolumes(cargasVw.getQtdvolumes());
        dtoCarga.setSituacao(1);
        dtoCarga.setNotas(dtoNotas);
    }

    public void importarNota(){
        LOGGER.info("--------------------------------------------------------------------");
        LOGGER.info("                         IMPORTAÇÃO DE NOTAS                        ");
        LOGGER.info("--------------------------------------------------------------------");
        List<Nota> notasVw = notaRepository.findAll();
        for (Nota notaVw : notasVw) {
            try{
                IntegracaoDadoResponseDTO notaIsPresent = wmsFeign.validarDados(autenticarWMS(), "nota", notaVw.getCodigo(), notaVw.getCodfilial()).getBody();
                if (!notaIsPresent.getExist()) {
                    NotaIntegraExternoRequestDTO dtoNota = new NotaIntegraExternoRequestDTO();
                    List<NotaItem> notaItensVw = notaItemRepository.buscarPorCodNota(notaVw.getCodigo());
                    List<NotaItemIntegraExternoRequestDTO> dtoNotaItens = new ArrayList<>();
                    for (NotaItem entradaItemVw : notaItensVw) {
                        NotaItemIntegraExternoRequestDTO dtoNotaItem = new NotaItemIntegraExternoRequestDTO();
                        converterNotaItem(dtoNotaItem, entradaItemVw);
                        dtoNotaItens.add(dtoNotaItem);
                    }
                    converterNota(dtoNota, notaVw, dtoNotaItens);
                    wmsFeign.cadastrarEntrada(autenticarWMS(), dtoNota);
                    LOGGER.info("--------------------------------------------------------------------");
                    LOGGER.info("CodNota : " + notaVw.getCodigo() + " gravada!");
                    LOGGER.info("--------------------------------------------------------------------");
                }
            }catch (Exception e){
                LOGGER.info("--------------------------------------------------------------------");
                LOGGER.info("CodNota : " + notaVw.getCodigo() + ", Error : " + e.getMessage());
                LOGGER.info("--------------------------------------------------------------------");
            }
        }
    }

    private void converterNota(NotaIntegraExternoRequestDTO dtoNota, Nota entradasVw, List<NotaItemIntegraExternoRequestDTO> dtoNotaItens) {
        dtoNota.setCodigo(entradasVw.getCodigo());
        dtoNota.setFornecedor(importarFornecedor(entradasVw.getCodigofornecedor()));
        dtoNota.setTipo(Long.valueOf(entradasVw.getTipo()));
        dtoNota.setDataemissao(entradasVw.getDataemissao());
        dtoNota.setQuantidade(entradasVw.getQuantidade());
        dtoNota.setNumeronotafiscal(entradasVw.getNumeronotafiscal());
        dtoNota.setSerie(entradasVw.getSerie());
        dtoNota.setQuantidadevolume(entradasVw.getQuantidadevolume());
        dtoNota.setValtotalproduto(entradasVw.getValtotalproduto());
        dtoNota.setValtotalnota(entradasVw.getValtotalnota());
        dtoNota.setPesobruto(entradasVw.getPesobruto());
        dtoNota.setPesoliquido(entradasVw.getPesoliquido());
        dtoNota.setSituacao(1);
        dtoNota.setCodfilial(entradasVw.getCodfilial());
        dtoNota.setItens(dtoNotaItens);
    }

    private void converterNotaItem(NotaItemIntegraExternoRequestDTO dtoNotaItem, NotaItem notaItemVw) {
        dtoNotaItem.setProduto(importarProduto(notaItemVw.getCodigoproduto()));
        dtoNotaItem.setQuantidade(notaItemVw.getQuantidade());
        dtoNotaItem.setValunitario(notaItemVw.getValunitario());
        dtoNotaItem.setItem(notaItemVw.getItem());
        dtoNotaItem.setValidade(notaItemVw.getValidade());
        dtoNotaItem.setFabricacao(notaItemVw.getFabricacao());
        dtoNotaItem.setLote(notaItemVw.getLote());
        dtoNotaItem.setNumserie(notaItemVw.getNumserie());
        dtoNotaItem.setEmbalagem(notaItemVw.getEmbalagem());
    }

}

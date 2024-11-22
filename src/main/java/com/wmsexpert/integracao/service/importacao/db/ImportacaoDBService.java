package com.wmsexpert.integracao.service.importacao.db;

import com.wmsexpert.integracao.dto.wms.request.integraexterno.*;
import com.wmsexpert.integracao.exception.function.EntityNotFoundException;
import com.wmsexpert.integracao.feign.WmsFeignClient;
import com.wmsexpert.integracao.model.*;
import com.wmsexpert.integracao.repository.*;
import com.wmsexpert.integracao.util.AuthUtil;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"db_dev", "db_prod"})
public class ImportacaoDBService extends AuthUtil {

    @Autowired
    private WmsFeignClient wmsFeign;
    @Autowired
    private FornecedorRepository fornecedorRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private GrupoRepository grupoRepository;
    @Autowired
    private EmbalagemRepository embalagemRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    public ProdutoIntegraExternoRequestDTO importarProduto(String codproduto) {
        Produto produtoVw = produtoRepository.buscarPorCodigo(codproduto)
                .orElseThrow(() -> new EntityNotFoundException("Produto não encontrado na View"));
        List<Embalagem> embalagemsView = embalagemRepository.buscarPorCodProduto(produtoVw.getCodigo());
        List<EmbalagemIntegraExternoRequestDTO> dtoEmbalagens = new ArrayList<>();
        for (Embalagem embalagemView : embalagemsView){
            EmbalagemIntegraExternoRequestDTO dtoEmbalagem = new EmbalagemIntegraExternoRequestDTO();
            converterEmbalagem(dtoEmbalagem, embalagemView);
            dtoEmbalagens.add(dtoEmbalagem);
        }
        ProdutoIntegraExternoRequestDTO dtoProduto = new ProdutoIntegraExternoRequestDTO();
        converterProduto(dtoProduto, produtoVw, dtoEmbalagens);
        return dtoProduto;
    }

    private void converterProduto(ProdutoIntegraExternoRequestDTO dtoProduto, Produto produtoVw, List<EmbalagemIntegraExternoRequestDTO> dtoEmbalagens) {
        dtoProduto.setCodigo(produtoVw.getCodigo());
        dtoProduto.setFornecedor(importarFornecedor(produtoVw.getCodigofornecedor()));
        dtoProduto.setCodigoref(produtoVw.getCodigoref());
        dtoProduto.setGrupo(importarGrupo(produtoVw.getCodigogrupo()));
        dtoProduto.setNome(produtoVw.getNome());
        dtoProduto.setEstoqueminimo(produtoVw.getEstoqueminimo());
        dtoProduto.setEstoquemaximo(produtoVw.getEstoquemaximo());
        dtoProduto.setControlavalidade(produtoVw.getControlavalidade());
        dtoProduto.setControlalote(produtoVw.getControlalote());
        dtoProduto.setControlanumserie(produtoVw.getControlanumserie());
        dtoProduto.setPesobruto(produtoVw.getPesobruto());
        dtoProduto.setPesoliquido(produtoVw.getPesoliquido());
        dtoProduto.setShelflife(produtoVw.getShelflife());
        dtoProduto.setLastro(produtoVw.getLastro());
        dtoProduto.setQtdcx(produtoVw.getQtdcx());
        dtoProduto.setQtdpl(produtoVw.getQtdpl());
        dtoProduto.setEmbalagens(dtoEmbalagens);
    }

    private void converterEmbalagem(EmbalagemIntegraExternoRequestDTO dtoEmbalagem, Embalagem embalagemView) {
        dtoEmbalagem.setCodigo(embalagemView.getCodigo());
        dtoEmbalagem.setCodbarra(embalagemView.getCodbarra());
        dtoEmbalagem.setQuantidade(embalagemView.getQuantidade());
        dtoEmbalagem.setTipo(Long.valueOf(embalagemView.getTipo()));
        dtoEmbalagem.setAtivo(embalagemView.getAtivo());
        dtoEmbalagem.setLargura(embalagemView.getLargura());
        dtoEmbalagem.setAltura(embalagemView.getAltura());
        dtoEmbalagem.setProfundidade(embalagemView.getProfundidade());
        dtoEmbalagem.setM3(embalagemView.getM3());
        dtoEmbalagem.setPesobruto(embalagemView.getPesobruto());
        dtoEmbalagem.setPesoliquido(embalagemView.getPesoliquido());
    }


    private GrupoIntegraExternoRequestDTO importarGrupo(String codgrupoerp) {
        Grupo grupoVw = grupoRepository.buscarPorCodigo(codgrupoerp)
                .orElseThrow(() -> new EntityNotFoundException("Grupo não encontrado na View!"));
        GrupoIntegraExternoRequestDTO dtoGrupo = new GrupoIntegraExternoRequestDTO();
        converterGrupo(dtoGrupo, grupoVw);
        return dtoGrupo;
    }

    private void converterGrupo(GrupoIntegraExternoRequestDTO dtoGrupo, Grupo grupoVw) {
        dtoGrupo.setCodigo(grupoVw.getCodigo());
        dtoGrupo.setNome(grupoVw.getNome());
        dtoGrupo.setAtivo(grupoVw.getAtivo());
    }

    public FornecedorIntegraExternoRequestDTO importarFornecedor(String codfornecedorerp){
        Fornecedor fornecedorVw = fornecedorRepository.buscarPorCodigo(codfornecedorerp)
                .orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado em View!"));
        FornecedorIntegraExternoRequestDTO dtoFornecedor = new FornecedorIntegraExternoRequestDTO();
        converterFornecedor(dtoFornecedor, fornecedorVw);
        return dtoFornecedor;
    }

    private void converterFornecedor(FornecedorIntegraExternoRequestDTO dtoFornecedor, Fornecedor fornecedorVw) {
        dtoFornecedor.setCodigo(fornecedorVw.getCodigo());
        dtoFornecedor.setNome(fornecedorVw.getNome());
        dtoFornecedor.setNomefantasia(fornecedorVw.getNomefantasia());
        dtoFornecedor.setCpf(fornecedorVw.getCpf());
        dtoFornecedor.setIe(fornecedorVw.getIe());
        dtoFornecedor.setEstado(fornecedorVw.getEstado());
        dtoFornecedor.setCodcidade(String.valueOf(fornecedorVw.getCodcidade()).replace("(", "").replace(")", "").replace(" ", "").replace("-", ""));
        dtoFornecedor.setBairro(fornecedorVw.getBairro());
        dtoFornecedor.setEndereco(fornecedorVw.getEndereco());
        dtoFornecedor.setNumero(fornecedorVw.getNumero());
        dtoFornecedor.setTelefone(fornecedorVw.getTelefone());
    }

    public ClienteIntegraExternoRequestDTO importarCliente(String codclienteerp) {
        Cliente clienteVw = clienteRepository.buscarPorCodigo(codclienteerp)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado na view!"));
        ClienteIntegraExternoRequestDTO dtoCliente = new ClienteIntegraExternoRequestDTO();
        converterCliente(dtoCliente, clienteVw);
        return dtoCliente;
    }

    private void converterCliente(ClienteIntegraExternoRequestDTO dtoCliente, Cliente clienteVw) {
        dtoCliente.setCodigo(clienteVw.getCodigo());
        dtoCliente.setCpfcnpj(clienteVw.getCpfcnpj().replace(".", "").replace("/", "").replace("-", ""));
        dtoCliente.setNome(clienteVw.getNome());
//        dtoCliente.setIe(clienteVw.getIe());
        dtoCliente.setCodcidade(Long.valueOf(clienteVw.getCodcidade()));
        dtoCliente.setNomecidade(clienteVw.getNomecidade());
        dtoCliente.setEndereco(clienteVw.getEndereco());
        dtoCliente.setComplemento(clienteVw.getComplemento());
        dtoCliente.setNumero(String.valueOf(clienteVw.getNumero()));
        dtoCliente.setBairro(clienteVw.getBairro());
        dtoCliente.setCep(clienteVw.getCep());
        dtoCliente.setTelefone(clienteVw.getTelefone());
        dtoCliente.setEmail(clienteVw.getEmail());
        dtoCliente.setAtivo(clienteVw.getAtivo());
        dtoCliente.setLatitude(clienteVw.getLatitude());
        dtoCliente.setLongetude(clienteVw.getLongitude());
    }

}

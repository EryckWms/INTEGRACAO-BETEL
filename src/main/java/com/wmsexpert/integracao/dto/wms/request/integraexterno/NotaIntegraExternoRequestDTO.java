package com.wmsexpert.integracao.dto.wms.request.integraexterno;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public class NotaIntegraExternoRequestDTO {

    private String codigo;
    private FornecedorIntegraExternoRequestDTO fornecedor;
    private Long tipo;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataemissao;
    private Double quantidade;
    private String numeronotafiscal;
    private String serie;
    private Integer quantidadevolume;
    private Double valtotalproduto;
    private Double valtotalnota;
    private Double pesobruto;
    private Double pesoliquido;
    private Integer situacao;
    private Integer qtdvolumeconf;
    private String codfilial;
    private List<NotaItemIntegraExternoRequestDTO> itens;

    public NotaIntegraExternoRequestDTO() {
    }

    public NotaIntegraExternoRequestDTO(String codigo, FornecedorIntegraExternoRequestDTO fornecedor, Long tipo, LocalDate dataemissao, Double quantidade, String numeronotafiscal, String serie, Integer quantidadevolume, Double valtotalproduto, Double valtotalnota, Double pesobruto, Double pesoliquido, Integer situacao, Integer qtdvolumeconf, String codfilial, List<NotaItemIntegraExternoRequestDTO> itens) {
        this.codigo = codigo;
        this.fornecedor = fornecedor;
        this.tipo = tipo;
        this.dataemissao = dataemissao;
        this.quantidade = quantidade;
        this.numeronotafiscal = numeronotafiscal;
        this.serie = serie;
        this.quantidadevolume = quantidadevolume;
        this.valtotalproduto = valtotalproduto;
        this.valtotalnota = valtotalnota;
        this.pesobruto = pesobruto;
        this.pesoliquido = pesoliquido;
        this.situacao = situacao;
        this.qtdvolumeconf = qtdvolumeconf;
        this.codfilial = codfilial;
        this.itens = itens;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public FornecedorIntegraExternoRequestDTO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorIntegraExternoRequestDTO fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(LocalDate dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getNumeronotafiscal() {
        return numeronotafiscal;
    }

    public void setNumeronotafiscal(String numeronotafiscal) {
        this.numeronotafiscal = numeronotafiscal;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getQuantidadevolume() {
        return quantidadevolume;
    }

    public void setQuantidadevolume(Integer quantidadevolume) {
        this.quantidadevolume = quantidadevolume;
    }

    public Double getValtotalproduto() {
        return valtotalproduto;
    }

    public void setValtotalproduto(Double valtotalproduto) {
        this.valtotalproduto = valtotalproduto;
    }

    public Double getValtotalnota() {
        return valtotalnota;
    }

    public void setValtotalnota(Double valtotalnota) {
        this.valtotalnota = valtotalnota;
    }

    public Double getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Double pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Double getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(Double pesoliquido) {
        this.pesoliquido = pesoliquido;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public Integer getQtdvolumeconf() {
        return qtdvolumeconf;
    }

    public void setQtdvolumeconf(Integer qtdvolumeconf) {
        this.qtdvolumeconf = qtdvolumeconf;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public List<NotaItemIntegraExternoRequestDTO> getItens() {
        return itens;
    }

    public void setItens(List<NotaItemIntegraExternoRequestDTO> itens) {
        this.itens = itens;
    }
}

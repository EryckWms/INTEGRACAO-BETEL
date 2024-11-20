package com.wmsexpert.integracao.dto.wms.request.integraexterno;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class NotaItemIntegraExternoRequestDTO {

    private ProdutoIntegraExternoRequestDTO produto;
    private Double quantidade;
    private Double valunitario;
    private String item;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate validade;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate fabricacao;
    private String lote;
    private String numserie;
    private String embalagem;

    public NotaItemIntegraExternoRequestDTO() {
    }

    public NotaItemIntegraExternoRequestDTO(ProdutoIntegraExternoRequestDTO produto, Double quantidade, Double valunitario, String item, LocalDate validade, LocalDate fabricacao, String lote, String numserie, String embalagem) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valunitario = valunitario;
        this.item = item;
        this.validade = validade;
        this.fabricacao = fabricacao;
        this.lote = lote;
        this.numserie = numserie;
        this.embalagem = embalagem;
    }

    public ProdutoIntegraExternoRequestDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutoIntegraExternoRequestDTO produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValunitario() {
        return valunitario;
    }

    public void setValunitario(Double valunitario) {
        this.valunitario = valunitario;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public LocalDate getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(LocalDate fabricacao) {
        this.fabricacao = fabricacao;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
}

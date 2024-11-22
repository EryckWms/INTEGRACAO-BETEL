package com.wmsexpert.integracao.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_notaitem", schema = "wmsexpert")
public class NotaItem {

    @Id
    private Long id;
    private String codigonota;
    private String item;
    private String codigoproduto;
    private String codigofilial;
    private Integer tipo;
    private String codigofornecedor;
    private Double quantidade;
    private Double valunitario;
    private LocalDate validade;
    private LocalDate fabricacao;
    private String lote;
    private String numserie;
    private String embalagem;

    public NotaItem() {
    }

    public NotaItem(Long id, String codigonota, String item, String codigoproduto, String codigofilial, Integer tipo, String codigofornecedor, Double quantidade, Double valunitario, LocalDate validade, LocalDate fabricacao, String lote, String numserie, String embalagem) {
        this.id = id;
        this.codigonota = codigonota;
        this.item = item;
        this.codigoproduto = codigoproduto;
        this.codigofilial = codigofilial;
        this.tipo = tipo;
        this.codigofornecedor = codigofornecedor;
        this.quantidade = quantidade;
        this.valunitario = valunitario;
        this.validade = validade;
        this.fabricacao = fabricacao;
        this.lote = lote;
        this.numserie = numserie;
        this.embalagem = embalagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigonota() {
        return codigonota;
    }

    public void setCodigonota(String codigonota) {
        this.codigonota = codigonota;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public String getCodigofilial() {
        return codigofilial;
    }

    public void setCodigofilial(String codigofilial) {
        this.codigofilial = codigofilial;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getCodigofornecedor() {
        return codigofornecedor;
    }

    public void setCodigofornecedor(String codigofornecedor) {
        this.codigofornecedor = codigofornecedor;
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

package com.wmsexpert.integracao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_embalagem", schema = "wmsexpert")
public class Embalagem {

    @Id
    private Long id;
    private String codigo;
    private String codigoproduto;
    private String codbarra;
    private Double quantidade;
    @Column(columnDefinition = "INTEGER")
    private Boolean ativo;
    private Integer tipo;
    private Double largura;
    private Double altura;
    private Double profundidade;
    private Double m3;
    private Double pesobruto;
    private Double pesoliquido;

    public Embalagem() {
    }

    public Embalagem(Long id, String codigo, String codigoproduto, String codbarra, Double quantidade, Boolean ativo, Integer tipo, Double largura, Double altura, Double profundidade, Double m3, Double pesobruto, Double pesoliquido) {
        this.id = id;
        this.codigo = codigo;
        this.codigoproduto = codigoproduto;
        this.codbarra = codbarra;
        this.quantidade = quantidade;
        this.ativo = ativo;
        this.tipo = tipo;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
        this.m3 = m3;
        this.pesobruto = pesobruto;
        this.pesoliquido = pesoliquido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public String getCodbarra() {
        return codbarra;
    }

    public void setCodbarra(String codbarra) {
        this.codbarra = codbarra;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public Double getM3() {
        return m3;
    }

    public void setM3(Double m3) {
        this.m3 = m3;
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
}

package com.wmsexpert.integracao.dto.wms.request.integraexterno;


public class EmbalagemIntegraExternoRequestDTO {

    private String codigo;
    private String codbarra;
    private String embalagem;
    private Double quantidade;
    private Boolean ativo;
    private Long tipo;
    private Double largura;
    private Double altura;
    private Double profundidade;
    private Double m3;
    private Double pesobruto;
    private Double pesoliquido;

    public EmbalagemIntegraExternoRequestDTO() {
    }

    public EmbalagemIntegraExternoRequestDTO(String codigo, String codbarra, String embalagem, Double quantidade, Boolean ativo, Long tipo, Double largura, Double altura, Double profundidade, Double m3, Double pesobruto, Double pesoliquido) {
        this.codigo = codigo;
        this.codbarra = codbarra;
        this.embalagem = embalagem;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodbarra() {
        return codbarra;
    }

    public void setCodbarra(String codbarra) {
        this.codbarra = codbarra;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
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

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
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

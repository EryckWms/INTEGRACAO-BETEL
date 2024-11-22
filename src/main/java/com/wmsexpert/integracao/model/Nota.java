package com.wmsexpert.integracao.model;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_nota", schema = "wmsexpert")
public class Nota {

    @Id
    private String id;
    private String codigo;
    private String codfilial;
    private Integer tipo;
    private String carga;
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
    private Double qtdvolumeconf;
    private String codigofornecedor;

    public Nota() {
    }

    public Nota(String id, String codigo, String codfilial, Integer tipo, String carga, LocalDate dataemissao, Double quantidade, String numeronotafiscal, String serie, Integer quantidadevolume, Double valtotalproduto, Double valtotalnota, Double pesobruto, Double pesoliquido, Integer situacao, Double qtdvolumeconf, String codigofornecedor) {
        this.id = id;
        this.codigo = codigo;
        this.codfilial = codfilial;
        this.tipo = tipo;
        this.carga = carga;
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
        this.codigofornecedor = codigofornecedor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
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

    public Double getQtdvolumeconf() {
        return qtdvolumeconf;
    }

    public void setQtdvolumeconf(Double qtdvolumeconf) {
        this.qtdvolumeconf = qtdvolumeconf;
    }

    public String getCodigofornecedor() {
        return codigofornecedor;
    }

    public void setCodigofornecedor(String codigofornecedor) {
        this.codigofornecedor = codigofornecedor;
    }
}

package com.wmsexpert.integracao.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_pedido")
public class Pedido {

    @Id
    private Long id;
    private String codigo;
    private String vendedor;
    private Integer tipo;
    private LocalDateTime dataimportacao;
    private String codigocliente;
    private String codfilial;
    private Double totalpedido;
    private Double qtditens;
    private Integer ordempedido;
    private Integer status;
    private LocalDateTime dtexportacao;
    private String codigoref;
    private String obs;
    private String codigocarregamento;

    public Pedido() {
    }

    public Pedido(Long id, String codigo, String vendedor, Integer tipo, LocalDateTime dataimportacao, String codigocliente, String codfilial, Double totalpedido, Double qtditens, Integer ordempedido, Integer status, LocalDateTime dtexportacao, String codigoref, String obs, String codigocarregamento) {
        this.id = id;
        this.codigo = codigo;
        this.vendedor = vendedor;
        this.tipo = tipo;
        this.dataimportacao = dataimportacao;
        this.codigocliente = codigocliente;
        this.codfilial = codfilial;
        this.totalpedido = totalpedido;
        this.qtditens = qtditens;
        this.ordempedido = ordempedido;
        this.status = status;
        this.dtexportacao = dtexportacao;
        this.codigoref = codigoref;
        this.obs = obs;
        this.codigocarregamento = codigocarregamento;
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

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataimportacao() {
        return dataimportacao;
    }

    public void setDataimportacao(LocalDateTime dataimportacao) {
        this.dataimportacao = dataimportacao;
    }

    public String getCodigocliente() {
        return codigocliente;
    }

    public void setCodigocliente(String codigocliente) {
        this.codigocliente = codigocliente;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public Double getTotalpedido() {
        return totalpedido;
    }

    public void setTotalpedido(Double totalpedido) {
        this.totalpedido = totalpedido;
    }

    public Double getQtditens() {
        return qtditens;
    }

    public void setQtditens(Double qtditens) {
        this.qtditens = qtditens;
    }

    public Integer getOrdempedido() {
        return ordempedido;
    }

    public void setOrdempedido(Integer ordempedido) {
        this.ordempedido = ordempedido;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getDtexportacao() {
        return dtexportacao;
    }

    public void setDtexportacao(LocalDateTime dtexportacao) {
        this.dtexportacao = dtexportacao;
    }

    public String getCodigoref() {
        return codigoref;
    }

    public void setCodigoref(String codigoref) {
        this.codigoref = codigoref;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCodigocarregamento() {
        return codigocarregamento;
    }

    public void setCodigocarregamento(String codigocarregamento) {
        this.codigocarregamento = codigocarregamento;
    }
}

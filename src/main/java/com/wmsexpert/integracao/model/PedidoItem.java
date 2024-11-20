package com.wmsexpert.integracao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_pedidositem")
public class PedidoItem {

    @Id
    private Long id;
    private String codigopedido;
    private String itempedido;
    private String codigofilial;
    private String codigoproduto;
    private Double quantidade;
    private Double qtdseparada;
    private Double qtdconferida;
    private Double qtdcortada;

    public PedidoItem() {
    }

    public PedidoItem(Long id, String codigopedido, String itempedido, String codigofilial, String codigoproduto, Double quantidade, Double qtdseparada, Double qtdconferida, Double qtdcortada) {
        this.id = id;
        this.codigopedido = codigopedido;
        this.itempedido = itempedido;
        this.codigofilial = codigofilial;
        this.codigoproduto = codigoproduto;
        this.quantidade = quantidade;
        this.qtdseparada = qtdseparada;
        this.qtdconferida = qtdconferida;
        this.qtdcortada = qtdcortada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigopedido() {
        return codigopedido;
    }

    public void setCodigopedido(String codigopedido) {
        this.codigopedido = codigopedido;
    }

    public String getItempedido() {
        return itempedido;
    }

    public void setItempedido(String itempedido) {
        this.itempedido = itempedido;
    }

    public String getCodigofilial() {
        return codigofilial;
    }

    public void setCodigofilial(String codigofilial) {
        this.codigofilial = codigofilial;
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getQtdseparada() {
        return qtdseparada;
    }

    public void setQtdseparada(Double qtdseparada) {
        this.qtdseparada = qtdseparada;
    }

    public Double getQtdconferida() {
        return qtdconferida;
    }

    public void setQtdconferida(Double qtdconferida) {
        this.qtdconferida = qtdconferida;
    }

    public Double getQtdcortada() {
        return qtdcortada;
    }

    public void setQtdcortada(Double qtdcortada) {
        this.qtdcortada = qtdcortada;
    }
}

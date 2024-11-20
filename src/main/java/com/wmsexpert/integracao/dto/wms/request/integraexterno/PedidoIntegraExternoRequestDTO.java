package com.wmsexpert.integracao.dto.wms.request.integraexterno;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoIntegraExternoRequestDTO {

    private String codigo;
    private ClienteIntegraExternoRequestDTO cliente;
    private String vendedor;
    private Long tipo;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataimportacao;
    private Double totalpedido;
    private Double qtditens;
    private Integer ordempedido;
    private Integer status;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dtexportacao;
    private String codigoref;
    private String codfilial;
    private List<PedidoItemIntegraExternoRequestDTO> itens;

    public PedidoIntegraExternoRequestDTO() {
    }

    public PedidoIntegraExternoRequestDTO(String codigo, ClienteIntegraExternoRequestDTO cliente, String vendedor, Long tipo, LocalDateTime dataimportacao, Double totalpedido, Double qtditens, Integer ordempedido, Integer status, LocalDateTime dtexportacao, String codigoref, String codfilial, List<PedidoItemIntegraExternoRequestDTO> itens) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.tipo = tipo;
        this.dataimportacao = dataimportacao;
        this.totalpedido = totalpedido;
        this.qtditens = qtditens;
        this.ordempedido = ordempedido;
        this.status = status;
        this.dtexportacao = dtexportacao;
        this.codigoref = codigoref;
        this.codfilial = codfilial;
        this.itens = itens;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ClienteIntegraExternoRequestDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteIntegraExternoRequestDTO cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Long getTipo() {
        return tipo;
    }

    public void setTipo(Long tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataimportacao() {
        return dataimportacao;
    }

    public void setDataimportacao(LocalDateTime dataimportacao) {
        this.dataimportacao = dataimportacao;
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

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public List<PedidoItemIntegraExternoRequestDTO> getItens() {
        return itens;
    }

    public void setItens(List<PedidoItemIntegraExternoRequestDTO> itens) {
        this.itens = itens;
    }
}

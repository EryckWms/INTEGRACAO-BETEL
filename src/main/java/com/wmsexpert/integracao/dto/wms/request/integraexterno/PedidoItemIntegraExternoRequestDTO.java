package com.wmsexpert.integracao.dto.wms.request.integraexterno;

public class PedidoItemIntegraExternoRequestDTO {

    private ProdutoIntegraExternoRequestDTO produto;
    private Double quantidade;
    private Double qtdseparada;
    private Double qtdconferida;
    private Double qtdcortada;
    private String itempedido;

    public PedidoItemIntegraExternoRequestDTO() {
    }

    public PedidoItemIntegraExternoRequestDTO(ProdutoIntegraExternoRequestDTO produto, Double quantidade, Double qtdseparada, Double qtdconferida, Double qtdcortada, String itempedido) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.qtdseparada = qtdseparada;
        this.qtdconferida = qtdconferida;
        this.qtdcortada = qtdcortada;
        this.itempedido = itempedido;
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

    public String getItempedido() {
        return itempedido;
    }

    public void setItempedido(String itempedido) {
        this.itempedido = itempedido;
    }
}

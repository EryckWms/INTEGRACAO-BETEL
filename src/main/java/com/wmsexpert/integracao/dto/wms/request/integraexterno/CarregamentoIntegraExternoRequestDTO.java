package com.wmsexpert.integracao.dto.wms.request.integraexterno;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public class CarregamentoIntegraExternoRequestDTO {

    private String codigo;
    private String motorista;
    private String ajudante1;
    private String ajudante2;
    private String ajudante3;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate datageracao;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate datasaida;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate datachegada;
    private String destino;
    private String kminicial;
    private String kmfinal;
    private Integer status;
    private String codfilial;
    private List<PedidoIntegraExternoRequestDTO> pedidos;

    public CarregamentoIntegraExternoRequestDTO() {
    }

    public CarregamentoIntegraExternoRequestDTO(String codigo, String motorista, String ajudante1, String ajudante2, String ajudante3, LocalDate datageracao, LocalDate datasaida, LocalDate datachegada, String destino, String kminicial, String kmfinal, Integer status, String codfilial, List<PedidoIntegraExternoRequestDTO> pedidos) {
        this.codigo = codigo;
        this.motorista = motorista;
        this.ajudante1 = ajudante1;
        this.ajudante2 = ajudante2;
        this.ajudante3 = ajudante3;
        this.datageracao = datageracao;
        this.datasaida = datasaida;
        this.datachegada = datachegada;
        this.destino = destino;
        this.kminicial = kminicial;
        this.kmfinal = kmfinal;
        this.status = status;
        this.codfilial = codfilial;
        this.pedidos = pedidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getAjudante1() {
        return ajudante1;
    }

    public void setAjudante1(String ajudante1) {
        this.ajudante1 = ajudante1;
    }

    public String getAjudante2() {
        return ajudante2;
    }

    public void setAjudante2(String ajudante2) {
        this.ajudante2 = ajudante2;
    }

    public String getAjudante3() {
        return ajudante3;
    }

    public void setAjudante3(String ajudante3) {
        this.ajudante3 = ajudante3;
    }

    public LocalDate getDatageracao() {
        return datageracao;
    }

    public void setDatageracao(LocalDate datageracao) {
        this.datageracao = datageracao;
    }

    public LocalDate getDatasaida() {
        return datasaida;
    }

    public void setDatasaida(LocalDate datasaida) {
        this.datasaida = datasaida;
    }

    public LocalDate getDatachegada() {
        return datachegada;
    }

    public void setDatachegada(LocalDate datachegada) {
        this.datachegada = datachegada;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getKminicial() {
        return kminicial;
    }

    public void setKminicial(String kminicial) {
        this.kminicial = kminicial;
    }

    public String getKmfinal() {
        return kmfinal;
    }

    public void setKmfinal(String kmfinal) {
        this.kmfinal = kmfinal;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public List<PedidoIntegraExternoRequestDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoIntegraExternoRequestDTO> pedidos) {
        this.pedidos = pedidos;
    }
}

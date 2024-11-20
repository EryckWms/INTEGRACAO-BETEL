package com.wmsexpert.integracao.dto.wms.request.integraexterno;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
import java.util.List;

public class CargaIntegraExternoRequestDTO {

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime datainicioconf;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataexportacaoerp;
    private Integer qtdvolumes;
    private String nome;
    private String codigo;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime datafimconf;
    private Integer situacao;
    private String codfilial;
    private List<NotaIntegraExternoRequestDTO> notas;

    public CargaIntegraExternoRequestDTO() {
    }

    public CargaIntegraExternoRequestDTO(LocalDateTime datainicioconf, LocalDateTime dataexportacaoerp, Integer qtdvolumes, String nome, String codigo, LocalDateTime datafimconf, Integer situacao, String codfilial, List<NotaIntegraExternoRequestDTO> notas) {
        this.datainicioconf = datainicioconf;
        this.dataexportacaoerp = dataexportacaoerp;
        this.qtdvolumes = qtdvolumes;
        this.nome = nome;
        this.codigo = codigo;
        this.datafimconf = datafimconf;
        this.situacao = situacao;
        this.codfilial = codfilial;
        this.notas = notas;
    }

    public LocalDateTime getDatainicioconf() {
        return datainicioconf;
    }

    public void setDatainicioconf(LocalDateTime datainicioconf) {
        this.datainicioconf = datainicioconf;
    }

    public LocalDateTime getDataexportacaoerp() {
        return dataexportacaoerp;
    }

    public void setDataexportacaoerp(LocalDateTime dataexportacaoerp) {
        this.dataexportacaoerp = dataexportacaoerp;
    }

    public Integer getQtdvolumes() {
        return qtdvolumes;
    }

    public void setQtdvolumes(Integer qtdvolumes) {
        this.qtdvolumes = qtdvolumes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDatafimconf() {
        return datafimconf;
    }

    public void setDatafimconf(LocalDateTime datafimconf) {
        this.datafimconf = datafimconf;
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public List<NotaIntegraExternoRequestDTO> getNotas() {
        return notas;
    }

    public void setNotas(List<NotaIntegraExternoRequestDTO> notas) {
        this.notas = notas;
    }
}

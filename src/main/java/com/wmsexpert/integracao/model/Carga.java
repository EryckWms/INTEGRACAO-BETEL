package com.wmsexpert.integracao.model;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_carga", schema = "wmsexpert")
public class Carga {

    @Id
    private String codigocarga;
    private String codigofilial;
    private LocalDateTime datainicioconf;
    private LocalDateTime datafimconf;
    private LocalDateTime dataexportacaoerp;
    private Integer qtdvolumes;

    public Carga() {
    }

    public Carga(String codigo, String codigofilial, LocalDateTime datainicioconf, LocalDateTime datafimconf, LocalDateTime dataexportacaoerp, Integer qtdvolumes) {
        this.codigocarga = codigo;
        this.codigofilial = codigofilial;
        this.datainicioconf = datainicioconf;
        this.datafimconf = datafimconf;
        this.dataexportacaoerp = dataexportacaoerp;
        this.qtdvolumes = qtdvolumes;
    }

    public String getCodigocarga() {
        return codigocarga;
    }

    public void setCodigocarga(String codigocarga) {
        this.codigocarga = codigocarga;
    }

    public String getCodigofilial() {
        return codigofilial;
    }

    public void setCodigofilial(String codigofilial) {
        this.codigofilial = codigofilial;
    }

    public LocalDateTime getDatainicioconf() {
        return datainicioconf;
    }

    public void setDatainicioconf(LocalDateTime datainicioconf) {
        this.datainicioconf = datainicioconf;
    }

    public LocalDateTime getDatafimconf() {
        return datafimconf;
    }

    public void setDatafimconf(LocalDateTime datafimconf) {
        this.datafimconf = datafimconf;
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
}

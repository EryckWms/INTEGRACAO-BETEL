package com.wmsexpert.integracao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_grupo")
public class Grupo {

    @Id
    private String codigo;
    private String nome;
    @Column(columnDefinition = "INTEGER")
    private Boolean ativo;

    public Grupo() {
    }

    public Grupo(String codigo, String nome, Boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.ativo = ativo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}

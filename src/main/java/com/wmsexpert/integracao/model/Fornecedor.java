package com.wmsexpert.integracao.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_fornecedor")
public class Fornecedor {

    @Id
    private String codigo;
    private String nome;
    private String nomefantasia;
    private String cpf;
    private String ie;
    private String estado;
    private Integer codcidade;
    private String bairro;
    private String endereco;
    private String numero;
    private String telefone;

    public Fornecedor() {
    }

    public Fornecedor(String codigo, String nome, String nomefantasia, String cpf, String ie, String estado, Integer codcidade, String bairro, String endereco, String numero, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.nomefantasia = nomefantasia;
        this.cpf = cpf;
        this.ie = ie;
        this.estado = estado;
        this.codcidade = codcidade;
        this.bairro = bairro;
        this.endereco = endereco;
        this.numero = numero;
        this.telefone = telefone;
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

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
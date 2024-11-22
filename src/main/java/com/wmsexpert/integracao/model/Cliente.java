package com.wmsexpert.integracao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "expert_cliente", schema = "wmsexpert")
public class Cliente {

    @Id
    private String codigo;
    private String cpfcnpj;
    private String nome;
    private Integer codcidade;
    private String nomecidade;
    private String endereco;
    private String complemento;
    private String numero;
    private String bairro;
    private String cep;
    private String telefone;
    private String email;
    @Column(columnDefinition = "INTEGER")
    private Boolean ativo;
    private String latitude;
    private String longitude;
    private Integer shelflife;
    private Integer codrota;
    private String nomerota;

    public Cliente() {
    }

    public Cliente(String codigo, String cpfcnpj, String nome, Integer codcidade, String nomecidade, String endereco, String complemento, String numero, String bairro, String cep, String telefone, String email, Boolean ativo, String latitude, String longetude, Integer shelflife, Integer codrota, String nomerota) {
        this.codigo = codigo;
        this.cpfcnpj = cpfcnpj;
        this.nome = nome;
        this.codcidade = codcidade;
        this.nomecidade = nomecidade;
        this.endereco = endereco;
        this.complemento = complemento;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.ativo = ativo;
        this.latitude = latitude;
        this.longitude = longetude;
        this.shelflife = shelflife;
        this.codrota = codrota;
        this.nomerota = nomerota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public void setCpfcnpj(String cpfcnpj) {
        this.cpfcnpj = cpfcnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Integer codcidade) {
        this.codcidade = codcidade;
    }

    public String getNomecidade() {
        return nomecidade;
    }

    public void setNomecidade(String nomecidade) {
        this.nomecidade = nomecidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Integer getShelflife() {
        return shelflife;
    }

    public void setShelflife(Integer shelflife) {
        this.shelflife = shelflife;
    }

    public Integer getCodrota() {
        return codrota;
    }

    public void setCodrota(Integer codrota) {
        this.codrota = codrota;
    }

    public String getNomerota() {
        return nomerota;
    }

    public void setNomerota(String nomerota) {
        this.nomerota = nomerota;
    }
}

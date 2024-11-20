package com.wmsexpert.integracao.dto.wms.request.integraexterno;

public class ClienteIntegraExternoRequestDTO {

    private String codigo;
    private String cpfcnpj;
    private String nome;
    private String ie;
    private Long codcidade;
    private String nomecidade;
    private String endereco;
    private String complemento;
    private String numero;
    private String bairro;
    private String cep;
    private String telefone;
    private String email;
    private Boolean ativo;
    private String latitude;
    private String longetude;
    private String shelflife;

    public ClienteIntegraExternoRequestDTO() {
    }

    public ClienteIntegraExternoRequestDTO(String codigo, String cpfcnpj, String nome, String ie, Long codcidade, String nomecidade, String endereco, String complemento, String numero, String bairro, String cep, String telefone, String email, Boolean ativo, String latitude, String longetude, String shelflife) {
        this.codigo = codigo;
        this.cpfcnpj = cpfcnpj;
        this.nome = nome;
        this.ie = ie;
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
        this.longetude = longetude;
        this.shelflife = shelflife;
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

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Long getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(Long codcidade) {
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

    public String getLongetude() {
        return longetude;
    }

    public void setLongetude(String longetude) {
        this.longetude = longetude;
    }

    public String getShelflife() {
        return shelflife;
    }

    public void setShelflife(String shelflife) {
        this.shelflife = shelflife;
    }
}

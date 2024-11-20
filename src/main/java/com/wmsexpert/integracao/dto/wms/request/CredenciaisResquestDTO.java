package com.wmsexpert.integracao.dto.wms.request;

public class CredenciaisResquestDTO {

    private String login;
    private String senha;
    private String codfilial;
    private String cnpj;
    private Integer qtdusuarios;

    public CredenciaisResquestDTO() {
    }

    public CredenciaisResquestDTO(String login, String senha, String codfilial) {
        this.login = login;
        this.senha = senha;
        this.codfilial = codfilial;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCodfilial() {
        return codfilial;
    }

    public void setCodfilial(String codfilial) {
        this.codfilial = codfilial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getQtdusuarios() {
        return qtdusuarios;
    }

    public void setQtdusuarios(Integer qtdusuarios) {
        this.qtdusuarios = qtdusuarios;
    }
}

package com.wmsexpert.integracao.dto.wms.request.integraexterno;

public class GrupoIntegraExternoRequestDTO {

    private String codigo;
    private String nome;
    private Boolean ativo;

    public GrupoIntegraExternoRequestDTO() {
    }

    public GrupoIntegraExternoRequestDTO(String codigo, String nome, Boolean ativo) {
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

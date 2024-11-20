package com.wmsexpert.integracao.dto.wms.request.integraexterno;

import java.util.List;

public class ProdutoIntegraExternoRequestDTO {


    private String codigo;
    private FornecedorIntegraExternoRequestDTO fornecedor;
    private String codigoref;
    private GrupoIntegraExternoRequestDTO grupo;
    private String nome;
    private String unidadepadrao;
    private Double estoqueminimo;
    private Double estoquemaximo;
    private Boolean controlavalidade;
    private Boolean controlalote;
    private Boolean controlanumserie;
    private Double pesobruto;
    private Double pesoliquido;
    private Integer shelflife;
    private Double lastro;
    private Double altura;
    private Double qtdcx;
    private Double qtdpl;
    private Boolean checkout;
    private Boolean sepcx;
    private Boolean seppl;
    private List<EmbalagemIntegraExternoRequestDTO> embalagens;

    public ProdutoIntegraExternoRequestDTO() {
    }

    public ProdutoIntegraExternoRequestDTO(String codigo, FornecedorIntegraExternoRequestDTO fornecedor, String codigoref, GrupoIntegraExternoRequestDTO grupo, String nome, String unidadepadrao, Double estoqueminimo, Double estoquemaximo, Boolean controlavalidade, Boolean controlalote, Boolean controlanumserie, Double pesobruto, Double pesoliquido, Integer shelflife, Double lastro, Double altura, Double qtdcx, Double qtdpl, Boolean checkout, Boolean sepcx, Boolean seppl, List<EmbalagemIntegraExternoRequestDTO> embalagens) {
        this.codigo = codigo;
        this.fornecedor = fornecedor;
        this.codigoref = codigoref;
        this.grupo = grupo;
        this.nome = nome;
        this.unidadepadrao = unidadepadrao;
        this.estoqueminimo = estoqueminimo;
        this.estoquemaximo = estoquemaximo;
        this.controlavalidade = controlavalidade;
        this.controlalote = controlalote;
        this.controlanumserie = controlanumserie;
        this.pesobruto = pesobruto;
        this.pesoliquido = pesoliquido;
        this.shelflife = shelflife;
        this.lastro = lastro;
        this.altura = altura;
        this.qtdcx = qtdcx;
        this.qtdpl = qtdpl;
        this.checkout = checkout;
        this.sepcx = sepcx;
        this.seppl = seppl;
        this.embalagens = embalagens;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public FornecedorIntegraExternoRequestDTO getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(FornecedorIntegraExternoRequestDTO fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodigoref() {
        return codigoref;
    }

    public void setCodigoref(String codigoref) {
        this.codigoref = codigoref;
    }

    public GrupoIntegraExternoRequestDTO getGrupo() {
        return grupo;
    }

    public void setGrupo(GrupoIntegraExternoRequestDTO grupo) {
        this.grupo = grupo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidadepadrao() {
        return unidadepadrao;
    }

    public void setUnidadepadrao(String unidadepadrao) {
        this.unidadepadrao = unidadepadrao;
    }

    public Double getEstoqueminimo() {
        return estoqueminimo;
    }

    public void setEstoqueminimo(Double estoqueminimo) {
        this.estoqueminimo = estoqueminimo;
    }

    public Double getEstoquemaximo() {
        return estoquemaximo;
    }

    public void setEstoquemaximo(Double estoquemaximo) {
        this.estoquemaximo = estoquemaximo;
    }

    public Boolean getControlavalidade() {
        return controlavalidade;
    }

    public void setControlavalidade(Boolean controlavalidade) {
        this.controlavalidade = controlavalidade;
    }

    public Boolean getControlalote() {
        return controlalote;
    }

    public void setControlalote(Boolean controlalote) {
        this.controlalote = controlalote;
    }

    public Boolean getControlanumserie() {
        return controlanumserie;
    }

    public void setControlanumserie(Boolean controlanumserie) {
        this.controlanumserie = controlanumserie;
    }

    public Double getPesobruto() {
        return pesobruto;
    }

    public void setPesobruto(Double pesobruto) {
        this.pesobruto = pesobruto;
    }

    public Double getPesoliquido() {
        return pesoliquido;
    }

    public void setPesoliquido(Double pesoliquido) {
        this.pesoliquido = pesoliquido;
    }

    public Integer getShelflife() {
        return shelflife;
    }

    public void setShelflife(Integer shelflife) {
        this.shelflife = shelflife;
    }

    public Double getLastro() {
        return lastro;
    }

    public void setLastro(Double lastro) {
        this.lastro = lastro;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getQtdcx() {
        return qtdcx;
    }

    public void setQtdcx(Double qtdcx) {
        this.qtdcx = qtdcx;
    }

    public Double getQtdpl() {
        return qtdpl;
    }

    public void setQtdpl(Double qtdpl) {
        this.qtdpl = qtdpl;
    }

    public Boolean getCheckout() {
        return checkout;
    }

    public void setCheckout(Boolean checkout) {
        this.checkout = checkout;
    }

    public Boolean getSepcx() {
        return sepcx;
    }

    public void setSepcx(Boolean sepcx) {
        this.sepcx = sepcx;
    }

    public Boolean getSeppl() {
        return seppl;
    }

    public void setSeppl(Boolean seppl) {
        this.seppl = seppl;
    }

    public List<EmbalagemIntegraExternoRequestDTO> getEmbalagens() {
        return embalagens;
    }

    public void setEmbalagens(List<EmbalagemIntegraExternoRequestDTO> embalagens) {
        this.embalagens = embalagens;
    }
}

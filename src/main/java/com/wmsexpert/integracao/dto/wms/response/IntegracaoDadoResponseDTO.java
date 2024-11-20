package com.wmsexpert.integracao.dto.wms.response;

public class IntegracaoDadoResponseDTO {

    private Long id;
    private Boolean exist;

    public IntegracaoDadoResponseDTO() {
    }

    public IntegracaoDadoResponseDTO(Long id, Boolean exist) {
        this.id = id;
        this.exist = exist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getExist() {
        return exist;
    }

    public void setExist(Boolean exist) {
        this.exist = exist;
    }

}

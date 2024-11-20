package com.wmsexpert.integracao.dto.wms.response;

public class TokenResponseDTO {

    private String jwt;

    public TokenResponseDTO() {
    }

    public TokenResponseDTO(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}

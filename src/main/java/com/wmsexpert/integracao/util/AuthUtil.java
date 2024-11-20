package com.wmsexpert.integracao.util;

import com.wmsexpert.integracao.dto.wms.request.CredenciaisResquestDTO;
import com.wmsexpert.integracao.feign.WmsFeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthUtil {

    @Autowired
    private WmsFeignClient wmsFeignClient;

    @Value("${wms.login}")
    private String login;
    @Value("${wms.senha}")
    private String senha;
    @Value("${wms.codfilial}")
    private String codfilial;
    @Value("${wms.hashtoken}")
    private String hashurl;

    public String autenticarWMS(){
        return wmsFeignClient.auth(hashurl,new CredenciaisResquestDTO(login,senha,codfilial)).getJwt();
    }

}

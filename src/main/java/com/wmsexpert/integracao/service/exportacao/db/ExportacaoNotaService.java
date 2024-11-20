package com.wmsexpert.integracao.service.exportacao.db;

import com.wmsexpert.integracao.feign.WmsFeignClient;
import com.wmsexpert.integracao.util.AuthUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"db_dev", "db_prod"})
public class ExportacaoNotaService extends AuthUtil {

    @Autowired
    private WmsFeignClient wmsFeign;

}

package com.wmsexpert.integracao.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Profile({"api_dev", "api_prod"})
@RestController
@RequestMapping("/integracao")
public class IntegracaoApiController {


}

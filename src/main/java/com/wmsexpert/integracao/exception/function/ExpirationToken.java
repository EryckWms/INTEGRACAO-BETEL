package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExpirationToken extends RuntimeException{

    public ExpirationToken() {
    }

    public ExpirationToken(String message) {
        super(message);
    }

}

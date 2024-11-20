package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class AccessDeniedException extends RuntimeException{

    public AccessDeniedException() {
    }

    public AccessDeniedException(String message) {
        super(message);
    }
}

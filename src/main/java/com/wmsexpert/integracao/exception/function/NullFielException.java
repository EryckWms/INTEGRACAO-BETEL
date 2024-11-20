package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NullFielException extends RuntimeException{

    public NullFielException() {
    }

    public NullFielException(String message) {
        super(message);
    }
}

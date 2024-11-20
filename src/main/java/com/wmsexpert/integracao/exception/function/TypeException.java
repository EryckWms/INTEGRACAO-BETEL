package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class TypeException extends RuntimeException{

    public TypeException() {
    }

    public TypeException(String message) {
        super(message);
    }
}

package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ImportTypeException extends RuntimeException{

    public ImportTypeException() {
    }

    public ImportTypeException(String message) {
        super(message);
    }
}

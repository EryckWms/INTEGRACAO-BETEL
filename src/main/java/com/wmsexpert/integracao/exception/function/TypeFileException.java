package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class TypeFileException extends RuntimeException{

    public TypeFileException() {
    }

    public TypeFileException(String message) {
        super(message);
    }
}

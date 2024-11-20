package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EntityExistException extends RuntimeException{

    public EntityExistException() {
    }

    public EntityExistException(String message) {
        super(message);
    }
}

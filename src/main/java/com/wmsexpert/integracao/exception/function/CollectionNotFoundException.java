package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CollectionNotFoundException extends RuntimeException{

    public CollectionNotFoundException() {
    }

    public CollectionNotFoundException(String message) {
        super(message);
    }
}

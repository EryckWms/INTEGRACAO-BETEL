package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.PRECONDITION_FAILED)
public class OperationException extends RuntimeException{

    public OperationException() {
    }

    public OperationException(String message) {
        super(message);
    }
}

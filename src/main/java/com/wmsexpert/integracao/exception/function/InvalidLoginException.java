package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidLoginException extends RuntimeException{

    public InvalidLoginException(){

    }

    public InvalidLoginException(String ex){
        super(ex);
    }

}

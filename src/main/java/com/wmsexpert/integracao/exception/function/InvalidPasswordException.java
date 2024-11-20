package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class InvalidPasswordException extends RuntimeException{

    public InvalidPasswordException(){
        super();
    }

    public InvalidPasswordException(String ex){
        super(ex);
    }

}

package com.wmsexpert.integracao.exception.function;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class RelationshipException extends RuntimeException{

    public RelationshipException(){
    }

    public RelationshipException(String ex){
        super(ex);
    }

}

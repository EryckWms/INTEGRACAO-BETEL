package com.wmsexpert.integracao.exception.handler;

import com.wmsexpert.integracao.exception.entity.ErrorResponse;
import com.wmsexpert.integracao.exception.function.*;

import java.time.LocalDateTime;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHendler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleAllExceptions(Exception ex, WebRequest request){

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),
                request.getDescription(false)
        );
        ex.printStackTrace();
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @ExceptionHandler({EntityNotFoundException.class, CollectionNotFoundException.class})
    public final ResponseEntity<ErrorResponse> handleNotFoundExceptions(Exception ex, WebRequest request){

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                HttpStatus.NOT_FOUND.value(),
                HttpStatus.NOT_FOUND.getReasonPhrase(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler({RelationshipException.class, TypeException.class, OperationException.class})
    public final ResponseEntity<ErrorResponse> handlePreconditionFaliedExceptions(Exception ex, WebRequest request){

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                HttpStatus.PRECONDITION_FAILED.value(),
                HttpStatus.PRECONDITION_FAILED.getReasonPhrase(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(response, HttpStatus.PRECONDITION_FAILED);

    }

    @ExceptionHandler({EntityExistException.class, NullFielException.class, ExpirationToken.class, ImportTypeException.class, TypeFileException.class, InvalidScoreException.class})
    public final ResponseEntity<ErrorResponse> handleBadRequestExceptions(Exception ex, WebRequest request){

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler({InvalidPasswordException.class, InvalidLoginException.class, AccessDeniedException.class})
    public final ResponseEntity<ErrorResponse> handleUnauthorizedToken(Exception ex, WebRequest request){

        ErrorResponse response = new ErrorResponse(
                LocalDateTime.now(),
                ex.getMessage(),
                HttpStatus.UNAUTHORIZED.value(),
                HttpStatus.UNAUTHORIZED.getReasonPhrase(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);

    }

}

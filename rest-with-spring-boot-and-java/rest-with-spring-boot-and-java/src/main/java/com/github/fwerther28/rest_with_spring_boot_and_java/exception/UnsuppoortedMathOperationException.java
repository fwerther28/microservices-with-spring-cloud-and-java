package com.github.fwerther28.rest_with_spring_boot_and_java.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsuppoortedMathOperationException extends RuntimeException{

    public UnsuppoortedMathOperationException(String message) {
        super(message);
    }
}

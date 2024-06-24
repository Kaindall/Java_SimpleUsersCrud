package com.training.users.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmailRegisteredException extends RuntimeException{
    public EmailRegisteredException(String message) {super(message);}
}

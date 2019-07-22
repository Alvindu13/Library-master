package com.clientui.web.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class BookBadRequestException extends RuntimeException {
    public BookBadRequestException(String message) {
        super(message);
    }
}

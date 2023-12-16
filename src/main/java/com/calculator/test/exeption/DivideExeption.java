package com.calculator.test.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DivideExeption extends RuntimeException {
    public DivideExeption() {

    }

    public DivideExeption(String message) {
        super(message);
    }

    public DivideExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideExeption(Throwable cause) {
        super(cause);
    }

    public DivideExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.example.order.ms.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ImpossibleCreateOrderException extends RuntimeException {

	private static final long serialVersionUID = 1545194757722501621L;

	public ImpossibleCreateOrderException(String message) {
        super(message);
    }
}
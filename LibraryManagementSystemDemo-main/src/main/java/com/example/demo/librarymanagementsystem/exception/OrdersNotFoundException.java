package com.example.demo.librarymanagementsystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class OrdersNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

    public OrdersNotFoundException(String message){
        super(message);
    }
}
package com.julo.api.exception;

import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends DomainException {
    public ProductNotFoundException(Long id) {
        super("Product " + id + " not found", HttpStatus.NOT_FOUND);
    }
}


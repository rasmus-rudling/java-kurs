package com.julo.api.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.net.URI;
import java.time.Instant;
import java.util.List;

@RestControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(DomainException.class)
    ProblemDetail onDomain(DomainException domainException, HttpServletRequest req) {
        ProblemDetail pd = ProblemDetail.forStatusAndDetail(domainException.status(), domainException.getMessage());
        pd.setTitle(domainException.getClass().getSimpleName());
        pd.setType(URI.create("https://api.example.com/errors/" + domainException.getClass().getSimpleName()));
        pd.setInstance(URI.create(req.getRequestURI()));
        pd.setProperty("timestamp", Instant.now());
        return pd;
    }

    @ExceptionHandler(ValidationException.class)
    ProblemDetail onValidation(ValidationException ex, HttpServletRequest req) {
        List<String> messages = ex.errors().getFieldErrors().stream()
                .map(f -> f.getField() + ": " + f.getDefaultMessage())
                .toList();

        ProblemDetail pd = ProblemDetail.forStatus(HttpStatus.BAD_REQUEST);
        pd.setTitle("Validation Failed");
        pd.setType(URI.create("https://api.example.com/errors/validation"));
        pd.setDetail("One or more fields did not pass validation");
        pd.setInstance(URI.create(req.getRequestURI()));
        pd.setProperty("errors", messages);
        pd.setProperty("timestamp", Instant.now());
        return pd;
    }

    @ExceptionHandler(Exception.class)
    ProblemDetail onGeneric(Exception ex, HttpServletRequest req) {
        ProblemDetail pd = ProblemDetail.forStatusAndDetail(
                HttpStatus.INTERNAL_SERVER_ERROR,
                "Unexpected error – contact support if the problem persists"
        );
        pd.setTitle("Internal Server Error");
        pd.setType(URI.create("https://api.example.com/errors/internal"));
        pd.setInstance(URI.create(req.getRequestURI()));
        pd.setProperty("timestamp", Instant.now());
        return pd;
    }
}

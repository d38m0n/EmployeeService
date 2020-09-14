package EmployeeService.exception.handler;


import EmployeeService.exception.ClientNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class Except extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ClientNotFoundException.class)
    public final ResponseEntity handleUserNotFoundException(ClientNotFoundException ex, WebRequest req) {
        Error resp = new Error(new Date(), ex.getMessage(), req.getDescription(false));

        return new ResponseEntity(resp,ex.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Error resp = new Error(new Date(), ex.getMessage(), request.getDescription(false));
        return new ResponseEntity(resp, HttpStatus.CONFLICT);
    }
}

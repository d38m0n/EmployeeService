package EmployeeService.exception;

import org.springframework.http.HttpStatus;

public class ClientNotFoundException extends RuntimeException {
      private   final HttpStatus status = HttpStatus.BAD_REQUEST;
    public ClientNotFoundException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return status;
    }
}


package EmployeeService.exception;


import org.springframework.http.HttpStatus;

public class WorkerNotFoundException extends RuntimeException {
    private   final HttpStatus status = HttpStatus.BAD_REQUEST;
    public WorkerNotFoundException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return status;
    }
}


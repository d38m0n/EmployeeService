package EmployeeService.exception.handler;


import java.util.Date;

public class Error {
    private Date time;
    private String message;
    private String detail;


    public Error(Date time, String message, String detail) {
        this.time = time;
        this.message = message;
        this.detail = detail;

    }


    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}

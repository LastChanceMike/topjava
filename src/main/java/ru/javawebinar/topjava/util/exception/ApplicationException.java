package ru.javawebinar.topjava.util.exception;

import org.springframework.http.HttpStatus;

public class ApplicationException extends RuntimeException {
    private String msgCode;
    private HttpStatus httpStatus;

    public ApplicationException(String msgCode, HttpStatus httpStatus) {
        this.msgCode = msgCode;
        this.httpStatus = httpStatus;
    }

    public String getMsgCode() {
        return msgCode;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

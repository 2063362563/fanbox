package com.fan.fanbox.domain.dto;

import com.fan.fanbox.domain.enums.HttpStatus;

public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public Result() {
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(HttpStatus.OK.getCode(), message, data);
    }

    public static <T> Result<T> success(T data) {
        return new Result<>(HttpStatus.OK.getCode(), "Success", data);
    }

    public static Result<?> error(Integer code, String message) {
        return new Result<>(code, message);
    }
}


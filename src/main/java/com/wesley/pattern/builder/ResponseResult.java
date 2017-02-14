package com.wesley.pattern.builder;

/**
 * @author Created by Wesley on 2016/7/12.
 */
public class ResponseResult<T> {

    private boolean success;

    private String message;

    private Integer code;

    private T result;


    public ResponseResult() {
    }

    public ResponseResult(boolean success, String message, Integer code, T result) {
        this.success = success;
        this.message = message;
        this.code = code;
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}

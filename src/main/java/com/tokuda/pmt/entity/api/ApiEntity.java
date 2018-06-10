package com.tokuda.pmt.entity.api;

public class ApiEntity<T extends Object> {
    private String status;  //ok, error
    private String message;
    private T data;

    public ApiEntity(){

    }

    public ApiEntity(String status, T data) {
        this.status = status;
        this.data = data;
    }

    public ApiEntity(String status, String message) {

        this.status = status;
        this.message = message;
    }

    public ApiEntity(String status, String message, T data) {
        this.message = message;
        this.data = data;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
}

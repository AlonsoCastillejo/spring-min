package com.example.demo.common;

public abstract class DomainException extends RuntimeException {
    private final int code;
    protected DomainException(int code,String message){
        super(message);
        this.code = code;        
    }
    public int getCode(){
        return code;
    }
}

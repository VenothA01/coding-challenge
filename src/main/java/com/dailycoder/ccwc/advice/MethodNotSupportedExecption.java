package com.dailycoder.ccwc.advice;

public class MethodNotSupportedExecption extends Exception {

    private String message;

    public MethodNotSupportedExecption(){

    }

    public MethodNotSupportedExecption(String message){
        super(message);
        this.message  = message;
    }
}

package org.apiproject.boot.demo.exception;

public class DataCannotCreateException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    /* public DataCannotCreateException() {
    } */
    public DataCannotCreateException(String ex){
        super(ex);
    }
}

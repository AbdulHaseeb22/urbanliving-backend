package com.ahs.urbanliving.exception;

public class DuplicateEmailException extends RuntimeException{
    public DuplicateEmailException(String email){
        super("Email already exist:" + email);
    }
}

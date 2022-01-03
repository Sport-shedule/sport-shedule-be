package com.sportShedule;

public class AuthorizationException extends Exception {

    public String message;

    public AuthorizationException(String message) {
        super(message);
        this.message = message;
    }
}

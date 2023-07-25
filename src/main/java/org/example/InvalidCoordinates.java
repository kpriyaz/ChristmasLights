package org.example;

public class InvalidCoordinates extends RuntimeException{

    public InvalidCoordinates() {
        super();
    }

    public InvalidCoordinates(String message) {
        super(message);
    }

    public InvalidCoordinates(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidCoordinates(Throwable cause) {
        super(cause);
    }

    protected InvalidCoordinates(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

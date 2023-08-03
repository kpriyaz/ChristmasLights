package org.example;

public class InvalidGridCoordinates extends RuntimeException{
    public InvalidGridCoordinates() {
        super();
    }

    public InvalidGridCoordinates(String message) {
        super(message);
    }

    public InvalidGridCoordinates(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidGridCoordinates(Throwable cause) {
        super(cause);
    }

    protected InvalidGridCoordinates(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

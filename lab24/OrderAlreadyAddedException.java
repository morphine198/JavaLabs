package edu.lab24;

public class OrderAlreadyAddedException extends RuntimeException {
    public OrderAlreadyAddedException(String message) {
        super(message);
    }
}

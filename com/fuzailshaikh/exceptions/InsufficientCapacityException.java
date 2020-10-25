package com.fuzailshaikh.exceptions;

public class InsufficientCapacityException extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InsufficientCapacityException(String msg, int capacity) {
        super(msg);  
        System.err.println("Max Capacity is " + capacity);
    }
}
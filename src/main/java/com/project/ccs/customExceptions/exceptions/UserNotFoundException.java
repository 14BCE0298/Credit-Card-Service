package com.project.ccs.customExceptions.exceptions;

public class UserNotFoundException extends RuntimeException {
    private static final String MESSAGE = "User not found for queried CustId : %s";
    private String custId;

    public UserNotFoundException(String custId) {
        this.custId = custId;
    }

    @Override
    public String toString() {
        return String.format(MESSAGE, custId);
    }
}

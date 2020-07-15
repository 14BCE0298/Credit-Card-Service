package com.project.ccs.customExceptions.exceptions;

public class IncorrectCardTypeException extends RuntimeException{

    private static final String MESSAGE = "Queried card type %s does not exist";
    private String cardType;

    public IncorrectCardTypeException(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return String.format(MESSAGE, cardType);
    }

}

package com.project.ccs.models;

public class CreditCard {
    private Customer cardOwner;
    private int expiryMonth;
    private int expiryYear;
    private int cardMonthlyLimit;
    private int cardOneTimeLimit;
    private CardType type;

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public Customer getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(Customer cardOwner) {
        this.cardOwner = cardOwner;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(int expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(int expiryYear) {
        this.expiryYear = expiryYear;
    }

    public int getCardMonthlyLimit() {
        return cardMonthlyLimit;
    }

    public void setCardMonthlyLimit(int cardMonthlyLimit) {
        this.cardMonthlyLimit = cardMonthlyLimit;
    }

    public int getCardOneTimeLimit() {
        return cardOneTimeLimit;
    }

    public void setCardOneTimeLimit(int cardOneTimeLimit) {
        this.cardOneTimeLimit = cardOneTimeLimit;
    }
}
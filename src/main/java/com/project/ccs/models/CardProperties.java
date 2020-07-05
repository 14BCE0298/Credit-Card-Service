package com.project.ccs.models;

public class CardProperties {
    private int interestRate;
    private int oneTimeLimit;
    private int monthlyLimit;

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getOneTimeLimit() {
        return oneTimeLimit;
    }

    public void setOneTimeLimit(int oneTimeLimit) {
        this.oneTimeLimit = oneTimeLimit;
    }

    public int getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(int monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }
}

package com.project.ccs.models;

public class CardProperties {
    private float interestRate;
    private float oneTimeLimit;
    private float monthlyLimit;

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public float getOneTimeLimit() {
        return oneTimeLimit;
    }

    public void setOneTimeLimit(float oneTimeLimit) {
        this.oneTimeLimit = oneTimeLimit;
    }

    public float getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(float monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }
}

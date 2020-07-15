package com.project.ccs.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AllCardTypeDetails {

    @Value("${credit-card-type.platinum.interest-rate}")
    private float platinumInterestRate;
    @Value("${credit-card-type.platinum.one-time-limit}")
    private float platinumOneTimeLimit;
    @Value("${credit-card-type.platinum.monthly-limit}")
    private float platinumMonthlyLimit;

    @Value("${credit-card-type.gold.interest-rate}")
    private float goldInterestRate;
    @Value("${credit-card-type.gold.one-time-limit}")
    private float goldOneTimeLimit;
    @Value("${credit-card-type.gold.monthly-limit}")
    private float goldMonthlyLimit;

    @Value("${credit-card-type.silver.interest-rate}")
    private float silverInterestRate;
    @Value("${credit-card-type.silver.one-time-limit}")
    private float silverOneTimeLimit;
    @Value("${credit-card-type.silver.monthly-limit}")
    private float silverMonthlyLimit;

    public float getPlatinumInterestRate() {
        return platinumInterestRate;
    }

    public void setPlatinumInterestRate(float platinumInterestRate) {
        this.platinumInterestRate = platinumInterestRate;
    }

    public float getPlatinumOneTimeLimit() {
        return platinumOneTimeLimit;
    }

    public void setPlatinumOneTimeLimit(float platinumOneTimeLimit) {
        this.platinumOneTimeLimit = platinumOneTimeLimit;
    }

    public float getPlatinumMonthlyLimit() {
        return platinumMonthlyLimit;
    }

    public void setPlatinumMonthlyLimit(float platinumMonthlyLimit) {
        this.platinumMonthlyLimit = platinumMonthlyLimit;
    }

    public float getSilverInterestRate() {
        return silverInterestRate;
    }

    public void setSilverInterestRate(float silverInterestRate) {
        this.silverInterestRate = silverInterestRate;
    }

    public float getSilverOneTimeLimit() {
        return silverOneTimeLimit;
    }

    public void setSilverOneTimeLimit(float silverOneTimeLimit) {
        this.silverOneTimeLimit = silverOneTimeLimit;
    }

    public float getSilverMonthlyLimit() {
        return silverMonthlyLimit;
    }

    public void setSilverMonthlyLimit(float silverMonthlyLimit) {
        this.silverMonthlyLimit = silverMonthlyLimit;
    }

    public float getGoldInterestRate() {
        return goldInterestRate;
    }

    public void setGoldInterestRate(float goldInterestRate) {
        this.goldInterestRate = goldInterestRate;
    }

    public float getGoldOneTimeLimit() {
        return goldOneTimeLimit;
    }

    public void setGoldOneTimeLimit(float goldOneTimeLimit) {
        this.goldOneTimeLimit = goldOneTimeLimit;
    }

    public float getGoldMonthlyLimit() {
        return goldMonthlyLimit;
    }

    public void setGoldMonthlyLimit(float goldMonthlyLimit) {
        this.goldMonthlyLimit = goldMonthlyLimit;
    }

    public Map<String, CardProperties> mappingCardTypeDetails() {
        HashMap<String, CardProperties> cardDetailsMap =
                new HashMap<>();
        CardProperties platinumCardProperties = new CardProperties();
        platinumCardProperties.setInterestRate(platinumInterestRate);
        platinumCardProperties.setOneTimeLimit(platinumOneTimeLimit);
        platinumCardProperties.setMonthlyLimit(platinumMonthlyLimit);

        CardProperties goldCardProperties = new CardProperties();
        goldCardProperties.setInterestRate(goldInterestRate);
        goldCardProperties.setOneTimeLimit(goldOneTimeLimit);
        goldCardProperties.setMonthlyLimit(goldMonthlyLimit);

        CardProperties silverCardProperties = new CardProperties();
        silverCardProperties.setInterestRate(silverInterestRate);
        silverCardProperties.setOneTimeLimit(silverOneTimeLimit);
        silverCardProperties.setMonthlyLimit(silverMonthlyLimit);

        cardDetailsMap.put(CardTypeEnum.PLATINUM.type, platinumCardProperties);
        cardDetailsMap.put(CardTypeEnum.GOLD.type, goldCardProperties);
        cardDetailsMap.put(CardTypeEnum.SILVER.type, silverCardProperties);

        return cardDetailsMap;
    }
}

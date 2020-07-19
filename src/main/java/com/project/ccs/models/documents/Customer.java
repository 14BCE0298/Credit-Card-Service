package com.project.ccs.models.documents;

import com.project.ccs.models.CustomerDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private String customerId;
    private String name;
    private String email;
    private String phone;
    private int age;
    private String userId;
    private int annualIncome;
    private String flagged;
    private static final String NOT_FLAGGED = "N";

    public Customer(CustomerDto customerDto) {
        this.name = customerDto.getName();
        this.email = customerDto.getEmail();
        this.phone = customerDto.getPhone();
        this.age = customerDto.getAge();
        this.annualIncome = customerDto.getAnnualIncome();
        this.userId = createUserId();
        this.flagged = NOT_FLAGGED;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFlagged() {
        return flagged;
    }

    public void setFlagged(String flagged) {
        this.flagged = flagged;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    private String createUserId() {
        int indexTillEmailAddressStarts;
        for(indexTillEmailAddressStarts = 0; indexTillEmailAddressStarts < this.email.length(); indexTillEmailAddressStarts++) {
            if(this.email.charAt(indexTillEmailAddressStarts) == '@') {
                break;
            }
        }
        return this.email.substring(0, indexTillEmailAddressStarts);
    }
}

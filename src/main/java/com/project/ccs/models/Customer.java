package com.project.ccs.models;

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

    public String createUserId() {
        int indexTillEmailAddressStarts;
        for(indexTillEmailAddressStarts = 0; indexTillEmailAddressStarts < this.email.length(); indexTillEmailAddressStarts++) {
            if(this.email.charAt(indexTillEmailAddressStarts) == '@') {
                break;
            }
        }
        return this.email.substring(0, indexTillEmailAddressStarts);
    }
}

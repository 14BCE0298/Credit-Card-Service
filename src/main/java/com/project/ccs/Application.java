package com.project.ccs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//TODO : Add API to get customer details from CustID
//TODO : Add API to apply for credit card
//TODO : Add API to make purchase
//TODO : Add API to return current amount due
//TODO : Add API to deposit due amount
//TODO : Add API to get total due amount and date
//TODO : Add API to get all transactions
//TODO : Send purchase API data to a kafka broker
//TODO: About API using service details class
//TODO: Add constraints on user input

@SpringBootApplication
@ComponentScan(basePackages = "com.project.ccs")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

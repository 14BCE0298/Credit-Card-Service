package com.project.ccs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//TODO : Read file for setting users to flagged
//TODO : Send new User data to file using camel
//TODO : Add API to apply for credit card
//TODO : Add API to make purchase
//TODO : Add API to deposit due amount
//TODO : Add API to get total due amount and date
//TODO : Add API to get all transactions
//TODO: About API using service details class with git branch details
//TODO: Add constraints on user input

@SpringBootApplication
@ComponentScan(basePackages = "com.project.ccs")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

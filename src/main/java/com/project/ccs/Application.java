package com.project.ccs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//TODO : Read file using camel for setting users to flagged
//TODO : Send new User data to file using camel
//TODO : Add API to make purchase
//TODO : Add API to deposit due amount
//TODO : Add API to get all transactions and due amount
//TODO: About API using service details class with git branch details

@SpringBootApplication
@ComponentScan(basePackages = "com.project.ccs")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

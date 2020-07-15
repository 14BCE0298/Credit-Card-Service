package com.project.ccs.controllers;

import com.project.ccs.models.Customer;
import com.project.ccs.services.CustomerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/ccs/v1/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/new")
    public ResponseEntity<String> addNewUser(@RequestBody Customer customer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addNewUser(customer));
    }

    @GetMapping("/customer-details")
    public ResponseEntity<Customer> getCustomerFromCustId(String custId) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getUserFromCustId(custId));
    }
}

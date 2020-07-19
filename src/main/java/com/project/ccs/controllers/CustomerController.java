package com.project.ccs.controllers;

import com.project.ccs.models.CustomerDto;
import com.project.ccs.models.documents.Customer;
import com.project.ccs.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/ccs/v1/customer")
@Validated
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/new")
    public ResponseEntity<String> addNewUser (@Valid @RequestBody CustomerDto customerDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(customerService.addNewUser(customerDto));
    }

    @GetMapping("/customer-details")
    public ResponseEntity<Customer> getCustomerFromCustId(String custId) {
        return ResponseEntity.status(HttpStatus.OK).body(customerService.getUserFromCustId(custId));
    }
}

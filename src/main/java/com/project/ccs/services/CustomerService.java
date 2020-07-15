package com.project.ccs.services;

import com.project.ccs.models.Customer;
import com.project.ccs.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

    private CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String addNewUser(Customer customer) {
        return customerRepository.save(customer).getCustomerId();
    }
}

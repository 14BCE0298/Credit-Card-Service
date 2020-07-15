package com.project.ccs.services;

import com.project.ccs.customExceptions.exceptions.UserNotFoundException;
import com.project.ccs.models.Customer;
import com.project.ccs.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

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

    public Customer getUserFromCustId(String custId) {
        Optional<Customer> customer= customerRepository.findById(custId);

        if(customer.isPresent()) {
            return customer.get();
        } else {
            throw new UserNotFoundException(custId);
        }
    }
}

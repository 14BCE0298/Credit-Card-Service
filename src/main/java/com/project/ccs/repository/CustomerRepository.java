package com.project.ccs.repository;


import com.project.ccs.models.documents.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {

    @Override
    Optional<Customer> findById(String s);

}

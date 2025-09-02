package com.bruna.customer.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bruna.customer.entity.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer,ObjectId>{

}

package com.barbieri.newfeatures.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.barbieri.newfeatures.entity.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,ObjectId>{

}

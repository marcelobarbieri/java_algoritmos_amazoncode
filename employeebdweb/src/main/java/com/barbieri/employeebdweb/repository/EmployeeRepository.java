package com.barbieri.employeebdweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barbieri.employeebdweb.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
	
}

package com.barbieri.employeebdweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.barbieri.employeebdweb.entity.Employee;

@Service
public interface EmployeeService {

	List<Employee> listAll();
	Optional<Employee> listById(long id);
	void save(Employee employee);
	void update(Employee employee);
	void delete(long id);
	
}
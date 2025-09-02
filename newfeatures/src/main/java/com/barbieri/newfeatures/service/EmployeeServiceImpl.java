package com.barbieri.newfeatures.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbieri.newfeatures.entity.Employee;
import com.barbieri.newfeatures.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> listAll() {
		
		List<Employee> employees = new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		
		return employees;
	}

}

package com.barbieri.employeebdweb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbieri.employeebdweb.entity.Employee;
import com.barbieri.employeebdweb.repository.EmployeeRepository;

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

	@Override
	public Optional<Employee> listById(long id) {
		return employeeRepository.findById(id);
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);		
	}

	@Override
	public void update(Employee employee) {
		Optional<Employee> employeeFound =
				employeeRepository.findById(employee.getId());
		employeeFound.ifPresent(
			p -> {
				employeeRepository.save(employee);
			}
		);		
	}

	@Override
	public void delete(long id) {
		Optional<Employee> employeeFound = employeeRepository.findById(id);
		employeeFound.ifPresent(
			p -> {
				employeeRepository.delete(employeeFound.get());					
			}
		);		
	}
}

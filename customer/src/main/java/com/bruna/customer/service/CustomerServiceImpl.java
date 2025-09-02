package com.bruna.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.customer.entity.Customer;
import com.bruna.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;	
	
	@Override
	public List<Customer> listAll() {		
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);		
		return customers;
	}

}


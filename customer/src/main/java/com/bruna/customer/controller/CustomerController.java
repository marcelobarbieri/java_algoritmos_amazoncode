package com.bruna.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruna.customer.entity.Customer;
import com.bruna.customer.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/listCustomers")
	public ResponseEntity<List<Customer>> listCustomer()
	{
		List<Customer> customers = customerService.listAll();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}	
}

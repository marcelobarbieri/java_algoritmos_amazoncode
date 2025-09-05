package com.barbieri.employeebdweb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.barbieri.employeebdweb.entity.Employee;
import com.barbieri.employeebdweb.service.EmployeeService;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;
	
	@Autowired
	public void setEmployeeService(EmployeeService employeeService) 
	{
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees/list")
	public String listEmployees(Model model)
	{
		model.addAttribute("employees",employeeService.listAll());
		return "employees";
	}
	
	@GetMapping("/employees/list/{id}")
	public String listEmployee(@PathVariable long id, Model model)
	{
		model.addAttribute("employee",employeeService.listById(id).get());
		return "employee";
	}
	
	@GetMapping("/employees/delete/{id}")
	public String deleteEmployee(@PathVariable long id)
	{
		employeeService.delete(id);
		return "redirect:/employees/list";
	}
	
	@GetMapping("/employees/update/{id}/form")
	public String updateEmployeeForm(@PathVariable long id,Model model)
	{
		Optional<Employee> employeeFound = employeeService.listById(id);
		model.addAttribute("employee",employeeFound);
		return "editemployee";		
	}	
	
	@PostMapping("/employees/update/{id}")
	public String updateEmployee(@ModelAttribute Employee employee)
	{
		employeeService.update(employee);
		return "redirect:/employees/list";		
	}	
	
	@GetMapping("/employees/new/form")
	public String newEmployeeForm(Model model)
	{		
		model.addAttribute("employee",new Employee());
		return "newemployee";		
	}	
	
	@PostMapping("/employees/new")
	public String newEmployee(@ModelAttribute Employee employee)
	{		
		Optional<Employee> employeeFound = employeeService.listById(employee.getId());
		if (employeeFound.isPresent())
			return "redirect:/mensagem";
		
		employeeService.save(employee);
		return "redirect:/employees/list";		
	}
	
	@GetMapping("/mensagem")
	public String mensagem(Model model)
	{
		model.addAttribute("errorIdExists",true);
		return "erro/mensagem";
	}	
	
}	


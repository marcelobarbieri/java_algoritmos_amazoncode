package com.barbieri.newfeatures.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barbieri.newfeatures.entity.Employee;
import com.barbieri.newfeatures.service.EmployeeService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/")
	public ResponseEntity<String> start()
	{
		
		// region "response html"...
		String response = """
				
			<!doctype html>
			<html lang="pt-br" xmlns:th="http://www.thymeleaf.org">
			<head>
			  <meta charset="utf-8">
			  <title th:text="${appName} + ' | Início'">Início</title>
			  <meta name="viewport" content="width=device-width,initial-scale=1">
			  <style>
			    body{font-family:system-ui,-apple-system,Segoe UI,Roboto,Arial,sans-serif;margin:0;padding:0;background:#f6f7f9;color:#222}
			    header{background:#0f172a;color:#fff;padding:16px 24px}
			    main{max-width:960px;margin:24px auto;padding:0 16px}
			    .card{background:#fff;border:1px solid #e5e7eb;border-radius:14px;padding:20px;box-shadow:0 1px 2px rgba(0,0,0,.05)}
			    .actions a, .actions button{display:inline-block;margin-right:8px;padding:10px 14px;border-radius:10px;border:1px solid #e5e7eb;background:#fff;cursor:pointer;text-decoration:none;color:#111}
			    .actions a:hover, .actions button:hover{background:#f1f5f9}
			    footer{text-align:center;color:#6b7280;margin:32px 0;font-size:14px}
			  </style>
			</head>
			<body>
			<header>
			  <h1 th:text="${appName}">NewFeatures</h1>
			</header>
			
			<main>
			  <section class="card">
			    <h2>Página Inicial</h2>
			    <p>Bem-vindo. Escolha uma ação.</p>
			
			    <div class="actions">
			      <a href="/listEmployees">Listar Funcionários</a>
			    </div>
			  </section>
			</main>
			
			<footer>
			  &copy; <span th:text="${#dates.year(#dates.createNow())}">2025</span> - NewFeatures
			</footer>
			</body>
			</html>			
				
				""";
		// endregion	
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
	
	@GetMapping("/listEmployees")
	public ResponseEntity<List<Employee>> listEmployees()
	{
		List<Employee> employees = employeeService.listAll();
		return new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);		
	}
}

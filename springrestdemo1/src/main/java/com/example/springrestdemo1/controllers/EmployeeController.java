package com.example.springrestdemo1.controllers;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springrestdemo1.model.Employee;
import com.example.springrestdemo1.services.EmployeeService;


@RestController
@RequestMapping("/api/v1")

public class EmployeeController {

	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return employeeService.fetchAllEmployees();
	}
	@GetMapping("/employees/{id}")
	public Employee getEmployeeByID(@PathVariable("id") int id) {
		return employeeService.getEmployeeByID(id);
	}
	
	@PostMapping("/employees")
	public Employee insertEmployee(@RequestBody Employee employee) {
		System.out.println(employee);
		System.out.println("Hello controller");
		return employeeService.insertEmployee(employee);
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable("id") int id) {
		return employeeService.delteEmployeeById(id);
	}
}

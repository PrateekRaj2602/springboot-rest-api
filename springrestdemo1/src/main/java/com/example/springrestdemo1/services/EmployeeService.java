package com.example.springrestdemo1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.springrestdemo1.exceptions.EmployeeNotFoundException;
import com.example.springrestdemo1.model.Employee;
import com.example.springrestdemo1.repository.EmployeeRepository;

import java.util.*;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	

	public List<Employee> fetchAllEmployees(){
		//return employeeRepository.getAllEmployees();
		return employeeRepository.findAll();
	}

	public Employee getEmployeeByID(int id) {
		//return employeeRepository.getEmployeeById(id);
		Optional<Employee> op=employeeRepository.findById(id);
		if(op.isPresent())
			return op.get();
		else
			throw new EmployeeNotFoundException("No Employee found with Id:"+id);
	}
	

	public Employee insertEmployee(Employee employee) {
//		System.out.println(employee);
//		System.out.println("hello service");
//		return employeeRepository.insertEmployee(employee);
		
		return employeeRepository.save(employee);
	}
	

	public Employee updateEmployee(Employee employee) {
		//return employeeRepository.updateEmployee(employee);
		
		if(employeeRepository.existsById(employee.getEmployeeId()))
			return employeeRepository.save(employee);
		else
			throw new EmployeeNotFoundException("No Employee found with Id:"+employee.getEmployeeId());
	}

	public String delteEmployeeById(int id) {
		//return employeeRepository.deleteEmployeeById(id);
		
		if(employeeRepository.existsById(id))
		{
			employeeRepository.deleteById(id);
			return "Deleted Successfully!!!";
		}
		else
			throw new EmployeeNotFoundException("No Employee found with Id:"+id);
	}
}

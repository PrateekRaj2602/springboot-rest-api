package com.example.springrestdemo1.repository;

//import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.springrestdemo1.model.Employee;





//@Repository
//public class EmployeeRepository {
//	List<Employee> employeeList;
//		
//	public EmployeeRepository() {
//		employeeList = new ArrayList<Employee>();
//	}
//	
//
//	
//
//	public List<Employee> getAllEmployees(){
//		return employeeList;
//	}
//
//	public Employee getEmployeeById(int id) {
//		return employeeList.stream().filter(obj -> obj.getEmployeeId() == id).findAny().get();
//	}
//	
//
//	public Employee insertEmployee(Employee employee) {
//		System.out.println(employee);
//		employeeList.add(employee);
//		return employee;
//	}
//	
//
//	public Employee updateEmployee(Employee employee) {
//		
//		return employeeList.stream().filter(obj->obj.getEmployeeId()==employee.getEmployeeId())
//				.map(obj->
//				{
//				obj.setEmployeeName(employee.getEmployeeName());
//				obj.setEmployeeAge(employee.getEmployeeAge());
//				obj.setEmployeeDepartment(employee.getEmployeeDepartment());
//				obj.setEmployeeSalary(employee.getEmployeeSalary());
//				return obj;
//				}).findAny().get();
//
//	}
//
//	public Employee deleteEmployeeById(int id) {
//		Employee emp = employeeList.stream().filter(obj -> obj.getEmployeeId() == id).findAny().get();
//		employeeList.remove(emp);
//		return emp;
//	}
//}


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
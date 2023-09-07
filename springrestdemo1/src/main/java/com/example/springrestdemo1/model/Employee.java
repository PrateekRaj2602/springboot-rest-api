package com.example.springrestdemo1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Employee {
	@Id
	@Min(1)
	private int employeeId;
	@NotEmpty
	@NotNull
	private String employeeName;

	@NotNull
	private double employeeSalary;
	
	@Min(18)
	private int employeeAge;
	@NotEmpty
	@NotNull
	private String employeeDepartment;
	public int getEmployeeId() {
		return employeeId;
	}
	public Employee(int employeeId, String employeeName, double employeeSalary, int employeeAge,
			String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAge = employeeAge;
		this.employeeDepartment = employeeDepartment;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAge=" + employeeAge + ", employeeDepartment=" + employeeDepartment
				+ "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


}

package com.cts.service;

import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;

public interface EmployeeService 
{
	public boolean save(Employee emp);
	//save Employee
	public boolean delete(int id);
	//Delete
	public Employee get(int id);
	//Get Employee with the specific Id
	public List<Employee> get();
	//Get all the employees in the list
	public boolean update(Employee emp);
	//Update a particular employee 
	public List<Employee> getEmployees();
	//get all the employees in the list
	public void display(List<Employee> empList);
	
	public List<Employee> getEmployees( int min, int max);
	
	public void display(Employee e);
	
	public void display();

	
}

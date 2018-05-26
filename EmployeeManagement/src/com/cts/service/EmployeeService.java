package com.cts.service;

import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;

public interface EmployeeService 
{
	public boolean save(Employee emp) throws DuplicateUserException;
	
	public boolean delete(int id);
	
	public Employee get(int id);
	
	public List<Employee> get();

	public boolean update(Employee emp);

	public List<Employee> getEmployees();
	public void display(List<Employee> empList);
	public List<Employee> getEmployees( int min, int max);
	public void display(Employee e);
	public void display();

	
}

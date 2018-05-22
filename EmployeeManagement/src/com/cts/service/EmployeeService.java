package com.cts.service;

import java.util.List;

import com.cts.model.Employee;

public interface EmployeeService 
{
	public boolean save(Employee emp);
	
	public boolean update(Employee emp);
	
	public boolean delete(int id);
	
	public Employee get(int id);
	
	public List<Employee> get();
	
	public List<Employee> get(int min,int max);
	
}

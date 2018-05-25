package com.cts.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceHashMapImpl implements EmployeeService
{
	private Map<int , Employees> empList;
	public EmployeeServiceHashMapImpl()
	{
		empList=new Map<int,Employee>();
	}

	@Override
	public boolean save(Employee emp) throws DuplicateUserException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(List<Employee> empList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getEmployees(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}

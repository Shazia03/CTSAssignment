package com.cts.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceHashMapImpl implements EmployeeService
{
	private Map<Integer , Employee> empMap;
	
	public EmployeeServiceHashMapImpl()
	{
		empMap=new HashMap<Integer, Employee>();
	}
	Employee emp;
	@Override
	public boolean save(Employee emp) throws DuplicateUserException
	{
		if(get(emp.getId())!= null)
			return false;
		empMap.put(emp.getId(), emp);
		return true;
	}

	@Override
	public boolean delete(int id)
	{
		Employee emp;
		emp=get(id);
		if(emp!=null)
		{
			empMap.remove(id);
			return true;
		}
	return false;
	}

	@Override
	public Employee get(int id)
	{
		return empMap.get(id);	//get is the HashMap method
	}

	@Override
	public List<Employee> get() {
		
		return (List<Employee>) empMap;
	}

	@Override
	public boolean update(Employee emp) 
	{
		if(get(emp.getId())==null)
		return false;
		empMap.remove(get(emp.getId()));
		empMap.put(emp.getId(),emp);
		
		return false;
	}

	@Override
	public List<Employee> getEmployees()
	{
		
		return null;
		
	}

	@Override
	public void display(List<Employee> empList) {
		System.out.println();
		
	}


	@Override
	public List<Employee> getEmployees(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Employee emp) {
			System.out.println("Emp Id  :"+emp.getId());
			System.out.println("Emp Name  :"+emp.getName());
			System.out.println("Emp Salary  :"+emp.getSalary());
		
	}

	@Override
	public void display()
	{
		
  

	}

	
}

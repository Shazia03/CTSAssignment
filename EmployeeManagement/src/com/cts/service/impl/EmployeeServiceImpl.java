package com.cts.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService
{
	private List<Employee> empList;
	public EmployeeServiceImpl()
	{
		empList=new ArrayList<Employee>();
	}
	@Override
	public boolean save(Employee emp) 
	{
		if(get(emp.getId())!= null)
		{
			return false;
		}
		empList.add(emp);
		return true;
	}
	@Override
	public boolean update(Employee emp)
	{
		if(get(emp.getId())==null)
		{
			
			empList.add(emp);
			return true;
		}
		
		return false;
	}
	@Override
	public boolean delete(int id )
	{
		Employee emp=get(id);
		if(emp!=null)
		{
			empList.remove(emp);
			return true;
		}
		return false;
		
	}
	@Override
	public Employee get(int id)
	{
		for(Employee emp:empList)
		{
			if(emp.getId()==id)
				return emp;
		}
		return null;
	}
	@Override
	public List<Employee> get() {
		
		return empList;
	}
	public void display(Employee e)
	{
		System.out.println("Emp Id  :"+e.getId());
		System.out.println("Emp Name  :"+e.getName());
		System.out.println("Emp Salary  :"+e.getSalary());
	}
	public void display()
	{
		for(Employee e:empList)
		{
			display(e);
		}
	}
	@Override
	public List<Employee> get(int min, int max) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}

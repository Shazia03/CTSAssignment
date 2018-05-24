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
	public EmployeeServiceImpl(List<Employee> empList)
	{
		this.empList=empList;
	}
	@Override
	public boolean save(Employee emp) 
	{
		try {
			if(get(emp.getId())!= null)
			{
				return false;
			}
			empList.add(emp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			emp=null;
		}
		return true;
	}
	@Override
	public boolean update(Employee emp)
	{
		try {
			if(get(emp.getId())==null) //Checking if it exists
			{
				return false;
			}
			Employee temp=get(emp.getId()); //Assign what has to get updated
				empList.remove(temp);  //Remove the object which is existing
				empList.add(emp);  // Add which has to be passed
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			emp=null;
		}
		return true;
	}
	@Override
	public boolean delete(int id )
	{
		Employee emp;
		 try {
			emp=get(id);
			if(emp!=null)
			{
				empList.remove(emp);
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 finally {
			 emp=null;
		 }
		return false;
		
	}
	@Override
	public Employee get(int id)
	{
		try {
			for( Employee emp:empList)
			{
				if(emp.getId()==id)
					return emp;
			}
		} catch (Exception e) {
			e.printStackTrace();
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
	
	public void display(List<Employee> empList)
	{
		for(Employee e:empList)
		{
			display(e);
		}
	}
	@Override
	public List<Employee> getEmployees() 
	{
		
		return empList;
	}



}

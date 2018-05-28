package com.cts.service.impl;
import com.cts.exceptions.DuplicateUserException;

import java.util.ArrayList;
import java.util.List;

import com.cts.exceptions.DuplicateUserException;
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
	public boolean save(Employee emp) throws DuplicateUserException
	{
		try {
			if(get(emp.getId())!= null)
			{
				throw new DuplicateUserException();
			}
			empList.add(emp);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return true;
	}
	@Override
	public boolean update(Employee emp)
	{
			if(get(emp.getId())==null) //Checking if it exists
			{
				return false;
			}
			Employee temp=get(emp.getId()); //Assign what has to get updated
				empList.remove(temp);  //Remove the object which is existing
				empList.add(emp);  // Add which has to be passed
		return true;
	}
	@Override
	public boolean delete(int id )
	{
		Employee emp;
		 
			emp=get(id);
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
			for( Employee emp:empList)
				if(emp.getId()==id)
					return emp;
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
	@Override
	public void display()
	{
		for(Employee e:empList)
		{
			display(e);
		}
	}
	
	
	public void display(List<Employee> empList)
	{
//		if(empList==null)                 
//			return ;
//		for(Employee e:empList)
//		{
//			display(e);
//		}
		System.out.println(empList);
	}
	
	@Override
	public List<Employee> getEmployees() 
	{
		
		return empList;
	}

	@Override
	public List<Employee> getEmployees(int min, int max)
	{
		List<Employee> empList=getEmployees();
		List<Employee> newList=new ArrayList<Employee>();
		
			for(Employee e:empList)
			{
				if(e.getSalary()>=min&&e.getSalary()<=max) 
				 newList.add(e); 
			}
			
		return newList;
	}



}

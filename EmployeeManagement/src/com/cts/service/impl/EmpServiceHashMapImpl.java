package com.cts.service.impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmpServiceHashMapImpl implements EmployeeService
{
	private Map<Integer , Employee> empMap;
	
	public EmpServiceHashMapImpl()
	{
		empMap=new HashMap<Integer, Employee>();
	}
	Employee emp;
	@Override
	public boolean save(Employee emp)
	{
		if(!empMap.containsKey(emp.getId()))
		empMap.put(emp.getId(), emp);
		return true;
	}

	@Override
	public boolean delete(int id)
	{
		if(empMap.containsKey(id))
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
		
		return new ArrayList<Employee>((Collection<? extends Employee>) empMap.values());
	}

	@Override
	public boolean update(Employee emp) 
	{
		if(!empMap.containsKey(emp))
		return false;
		empMap.remove(empMap.containsKey(emp));
		empMap.put(emp.getId(),emp);
		
		return true;
	}

	@Override
	public List<Employee> getEmployees()
	{
		return new ArrayList<Employee>((Collection<? extends Employee>) empMap.values());
		
	}

	@Override
	public void display(List<Employee> empList)
	{
		System.out.println(empList);
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

	@Override
	public void display(Employee emp)
	{
			System.out.println(emp);
		
	}

	@Override
	public void display()
	{
		/*Set<Entry<Integer, Employee>> keys = empMap.entrySet();
		 for (Entry<Integer, Employee> entry : empMap.entrySet()) 
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());*/
		System.out.println(empMap);
	}

	
}

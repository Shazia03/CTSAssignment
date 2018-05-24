package com.cts.model;

import java.util.List;

import com.cts.service.EmployeeService;
import com.cts.service.impl.DepartmentServiceImpl;
import com.cts.service.impl.EmployeeServiceImpl;

public class DepartmentTest {
	
	private static DepartmentServiceImpl deptService;
	private static EmployeeService empService;
	
	public static void init()
	{
		empService =new EmployeeServiceImpl(); 
		deptService=new DepartmentServiceImpl(empService);
		
		Employee emp;
		emp=new Employee(101,"Ramya",97600);
		empService.save(emp);
	    emp=new Employee(102,"Ram",30600);
	    empService.save(emp);
		emp=new Employee(103,"Raghu",78600);
		empService.save(emp);
		
	
		//empService = new EmployeeServiceImpl();
		
		Department dept;
		dept=new Department(201,"Electronic");
		deptService.save(dept);
		dept=new Department(209,"CSE");
		deptService.save(dept);
		dept=new Department(210,"IT");
		deptService.save(dept);
		
		
	}

	public static void main(String[] args) 
	{
		init();
		deptService.save(101, 201);
		List<Employee> empList = deptService.getEmployees(201);
		empService.display(empList);
		//impl.display();
		//System.out.println(impl.save(101, 201));
		
		
		//System.out.println(impl.getEmployees(201));
		//impl.display();
		//impl.delete(210);
		//impl.display();

	}

}

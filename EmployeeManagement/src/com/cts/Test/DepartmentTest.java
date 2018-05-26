package com.cts.Test;

import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;
import com.cts.service.impl.DepartmentServiceImpl;
import com.cts.service.impl.EmployeeServiceImpl;

public class DepartmentTest {
	
	private static DepartmentService deptService;
	private static EmployeeService empService;
	
	public static void init()
	{
		empService =new EmployeeServiceImpl(); 
		deptService=new DepartmentServiceImpl(empService);
		//deptService=new DepartmentServiceImpl();
		
		Employee emp;
		emp=new Employee(101,"Ramya",90_000);
		try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    emp=new Employee(102,"Ram",30_000);
	    try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(103,"Raghu",70_000);
		try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		emp=new Employee(104,"Sharma",30_000);
		try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(105,"Shipra",24_000);
		try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(106,"Shami",45_000);
		try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(107,"Shiny",20_000);
		try {
			empService.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//empService = new EmployeeServiceImpl();
		
		Department dept;
		dept=new Department(201,"Electronics");
		deptService.save(dept);
		dept=new Department(202,"Software Development");
		deptService.save(dept);
		dept=new Department(203,"Testing");
		deptService.save(dept);	
	}

	public static void main(String[] args) 
	{
	
		init();
		
		deptService.addEmployeeToDept(101, 201);
		deptService.addEmployeeToDept(102, 201);
		deptService.addEmployeeToDept(103, 203);
		deptService.addEmployeeToDept(104, 202);
		deptService.addEmployeeToDept(105, 202);
		deptService.addEmployeeToDept(106, 203);
		
		//deptService.display();
		
		//deptService.removeEmployeeFromDept(103, 203);
		//deptService.display();
		
		//deptService.getEmployeesInTheDepartment(201);
		//deptService.display();
		
		//System.out.println(deptService.getEmployees(201));
		
		//List<Employee> employees=deptService.getEmployees(201, 90000);
		//empService.display(employees);
		
		List<Employee> empsorted=deptService.getEmployees(201, 30000, 80000);
		empService.display(empsorted);
		
		

	}

}

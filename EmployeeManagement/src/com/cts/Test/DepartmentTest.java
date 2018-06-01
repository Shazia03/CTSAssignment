package com.cts.Test;

import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;
import com.cts.service.impl.DepartmentServiceImpl;
import com.cts.service.impl.DeptServiceHashMapImpl;
import com.cts.service.impl.EmpServiceHashMapImpl;
import com.cts.service.impl.EmployeeServiceImpl;

public class DepartmentTest {
	
	private static DepartmentService deptService;
	private static EmployeeService empService;
	
	public static void init()
	{
		empService =new EmpServiceHashMapImpl(); 
		deptService=new DeptServiceHashMapImpl(empService);
		//deptService=new DepartmentServiceImpl();
		
		Employee emp;
		emp=new Employee(101,"Ramya",90_000);
		empService.save(emp);
		
	    emp=new Employee(102,"Ram",30_000);
	  	empService.save(emp);
	
		emp=new Employee(103,"Raghu",70_000);
		empService.save(emp);
		emp=new Employee(104,"Sharma",30_000);
		empService.save(emp);
		
		emp=new Employee(105,"Shipra",24_000);
		empService.save(emp);
		
		emp=new Employee(106,"Shami",45_000);
		empService.save(emp);
		
		emp=new Employee(107,"Shiny",20_000);
		empService.save(emp);
	
			
		//empService = new EmployeeServiceImpl();
		deptService=new DeptServiceHashMapImpl(empService);
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
		
		System.out.println("All Departments with Employees");
		deptService.display();
		
		System.out.println("Removing employee 103 from department 203");
		deptService.removeEmployeeFromDept(103, 203);
		System.out.println(deptService.getEmployees(203));
	
		
		System.out.println("get info of 203 department");
		Department dept=deptService.get(203);
		deptService.display(dept);
	
		System.out.println("Get Employees of 201 department");
		System.out.println(deptService.getEmployees(201));
		
		System.out.println("List of employees with salary 90000");
		List<Employee> employees=deptService.getEmployees(201, 90000);
		empService.display(employees);
		
		System.out.println("List of employees with salary range 30000 and 80000");
		List<Employee> empsorted=deptService.getEmployees(201, 30000, 80000);
		empService.display(empsorted);
		
		

	}

}

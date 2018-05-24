package com.cts.model;

import com.cts.service.impl.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		EmployeeServiceImpl imp =new EmployeeServiceImpl(); 
		Employee emp;
		emp=new Employee(101,"Ramya",97600);
		imp.save(emp);
	    emp=new Employee(102,"Ram",30600);
		imp.save(emp);
		emp=new Employee(103,"Raghu",78600);
		imp.save(emp);
		//imp.delete(101);
		//System.out.println(imp.get(103));
		
		//imp.display(emp);
		imp.display();
		
		emp=new Employee(101,"Reshma",97600);
		System.out.println(imp.update(emp));
		imp.display();

	}

}

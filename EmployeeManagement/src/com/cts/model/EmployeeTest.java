package com.cts.model;

import com.cts.service.impl.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		EmployeeServiceImpl imp =new EmployeeServiceImpl(); 
		Employee emp1=new Employee(101,"Ramya",97600);
		Employee emp2=new Employee(102,"Ram",30600);
		Employee emp3=new Employee(103,"Raghu",78600);
		
		imp.save(emp1);
		imp.save(emp2);
		imp.save(emp3);
		imp.delete(101);
		//System.out.println(imp.get(103));
		//imp.display(emp1);
		imp.display();

	}

}

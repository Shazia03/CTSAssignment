package com.cts.model;

import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.service.EmployeeService;
import com.cts.service.impl.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		EmployeeService empServiceimpl =new EmployeeServiceImpl(); 
		Employee emp;
		emp=new Employee(101,"Ramya",97600);
		try {
			empServiceimpl.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    emp=new Employee(102,"Ram",30000);
		try {
			empServiceimpl.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(103,"Raghu",78600);
		try {
			empServiceimpl.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//empServiceimpl.delete(101);
		//System.out.println(imp.get(103));
		
		//empServiceimpl.display(emp);
		//empServiceimpl.display();
		
		/*emp=new Employee(101,"Reshma",97600);
		System.out.println(empServiceimpl.update(emp));
		empServiceimpl.display();*/

		List<Employee> empsorted=empServiceimpl.getEmployees(1000, 30000);
		empServiceimpl.display(empsorted);
		
	}

}

package com.cts.service.hashmapimpl;

import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;
import com.cts.service.impl.EmpServiceHashMapImpl;

public class EmpServiceHashMapImplTest
{
	public static void main(String[] args) 
	{
		EmpServiceHashMapImpl empServiceHash=new EmpServiceHashMapImpl();
		Employee emp;
		emp=new Employee(303,"Sharan",60_000);
			empServiceHash.save(emp);
	
		emp=new Employee(304,"Sanjay",50_000);
			empServiceHash.save(emp);
	
		emp=new Employee(305,"Soumiya",80_000);
			empServiceHash.save(emp);
		
		System.out.println("Saving Employee");
		empServiceHash.display();
		
		empServiceHash.delete(304);
		System.out.println("Deletion");
		empServiceHash.display();
		
		System.out.println(empServiceHash.get(303));
		
		empServiceHash.get();
		System.out.println("All the employees details");
		empServiceHash.display();
		
		emp=new Employee(305,"Reshma",97600);
		System.out.println(empServiceHash.update(emp));
		System.out.println("Updated employee");
		empServiceHash.display();
		
		List<Employee> empList=empServiceHash.getEmployees();
		System.out.println("List of Employees");
		empServiceHash.display(empList);
		
	}
}

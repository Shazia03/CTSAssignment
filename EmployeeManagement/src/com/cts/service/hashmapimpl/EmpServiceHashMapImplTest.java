package com.cts.service.hashmapimpl;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;
import com.cts.service.impl.EmployeeServiceHashMapImpl;

public class EmpServiceHashMapImplTest
{
	public static void main(String[] args) 
	{
		EmployeeServiceHashMapImpl empServiceHash=new EmployeeServiceHashMapImpl();
		Employee emp;
		emp=new Employee(303,"Sharan",60_000);
		try {
			empServiceHash.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(304,"Sanjay",50_000);
		try {
			empServiceHash.save(emp);
		} catch (DuplicateUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emp=new Employee(305,"Soumiya",80_000);
		try {
			empServiceHash.save(emp);
		} catch (DuplicateUserException e)
		{
			e.printStackTrace();
		}
		
		empServiceHash.display();
		
	}
}

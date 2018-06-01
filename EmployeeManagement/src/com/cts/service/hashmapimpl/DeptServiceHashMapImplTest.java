package com.cts.service.hashmapimpl;
import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;
import com.cts.service.impl.DeptServiceHashMapImpl;
import com.cts.service.impl.EmpServiceHashMapImpl;

public class DeptServiceHashMapImplTest
{
	private static DepartmentService deptServiceHash;
	private static EmployeeService empServiceHash;
	 
	public static void init()
	
	{
			
		 Employee emp;
		 
		empServiceHash=new EmpServiceHashMapImpl();
		deptServiceHash=new DeptServiceHashMapImpl(empServiceHash);
		emp=new Employee(101,"Ramya",90_000);
		empServiceHash.save(emp);
		
	    emp=new Employee(102,"Ram",30_000);
	    empServiceHash.save(emp);
	    
		emp=new Employee(103,"Raghu",70_000);
		empServiceHash.save(emp);
		
		emp=new Employee(104,"Sharma",30_000);
		empServiceHash.save(emp);
	
		emp=new Employee(105,"Shipra",24_000);
		empServiceHash.save(emp);
		
		emp=new Employee(106,"Shami",45_000);
		empServiceHash.save(emp);
		
		emp=new Employee(107,"Shiny",20_000);
		empServiceHash.save(emp);

		
		Department dept;
		dept=new Department(201,"Electronics");
		deptServiceHash.save(dept);
		dept=new Department(202,"Software Development");
		deptServiceHash.save(dept);
		dept=new Department(203,"Testing");
		deptServiceHash.save(dept);
		
		
	}
	public static void main(String[] args) 
	{
		init();
		
		/*deptServiceHash.display();
		
		deptServiceHash.delete(202);
		deptServiceHash.display();
		
		dept=new Department(203,"HR");
		deptServiceHash.update(dept);
		deptServiceHash.display();
		
		System.out.println(deptServiceHash.get(201));
		
		deptServiceHash.get();
		deptServiceHash.display();*/
		

		deptServiceHash.addEmployeeToDept(101, 201);
		deptServiceHash.addEmployeeToDept(102, 201);
		deptServiceHash.addEmployeeToDept(103, 203);
		deptServiceHash.addEmployeeToDept(104, 202);
		deptServiceHash.addEmployeeToDept(105, 202);
		deptServiceHash.addEmployeeToDept(106, 203);
		
		System.out.println(deptServiceHash.get(202));
		
		System.out.println(deptServiceHash.getEmployees(202));
		
		
		
		
		
		
		
	}
}
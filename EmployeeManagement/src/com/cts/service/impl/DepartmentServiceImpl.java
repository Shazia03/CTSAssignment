package com.cts.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;

public class DepartmentServiceImpl implements DepartmentService
{
	EmployeeService empService;
	private List<Department> deptList;
//	private List<Department> newList;
	Employee e;
	Department d;
	public DepartmentServiceImpl()
	{
		deptList=new ArrayList<Department>();
		empService=new EmployeeServiceImpl();
	//	newList=new ArrayList<Department>();
	}
	
	public DepartmentServiceImpl(EmployeeService empService)
	{
		deptList=new ArrayList<Department>();
		this.empService=empService;
	//	newList=new ArrayList<Department>();
	}

	@Override
	public boolean save(Department d) {
		if(get(d.getDeptId())!=null)
		{
			return false;
		}
		deptList.add(d);
		return true;
		
	}

	@Override
	public boolean update(Department d)
	{
		if(get(d.getDeptId())==null)
		{
			deptList.add(d);
			return true;
		}
		
		return false;
	}

	@Override
	public boolean delete(int id) {
		Department d =get(id);
		if(d!=null)
		{
			deptList.remove(d);
			return true;
		}
		return false;
	}

	@Override
	public Department get(int id) {
		for(Department d:deptList)
		{
			if(d.getDeptId()==id)
				return d;
		}
		return null;
	}

	@Override
	public List<Department> get() {
		
		return deptList;
	} 
	@Override
	public void display(Department d)
	{
		
		System.out.println(d);
		List<Employee> empList = d.getEmpListInDepartment();
		empService.display(empList);
		
	}
	@Override
	public void display()
	{
		for(Department d:deptList)
		{
			display(d);
		}
	}
	
	
	
	@Override
	public boolean addEmployeeToDept(int empId, int deptId)
	{ //
		Employee emp=empService.get(empId);
		Department dept=get(deptId);
		if(emp==null||dept==null)
		{
			return false;
		}
		List<Employee> empList=getEmployees(deptId);
		if(empList==null)
		{
			empList = new ArrayList<Employee>();
		}
		empList.add(emp);
		dept.setEmpList(empList);
		//deptList.add(dept);
		return true;
	}

	@Override
	public boolean removeEmployeeFromDept(int empId, int deptId)
	{
		Employee emp=empService.get(empId); 	//get the Employee with the corresponding Id
		Department dept=get(deptId);	//get the Department with the corresponding Id
		if(emp==null||dept==null)
		{
			return false;		//It does not exist
		}
		List<Employee> empList=getEmployees(deptId);
		if(empList==null)
		{
			empList = new ArrayList<Employee>();
		}
		empList.remove(emp);		//Remove the employee of the passed empId from the empList
		dept.setEmpList(empList);	//set the new empList which has deleted the employee passed by the user
		return true;
	}

	@Override
	public List<Employee> getEmployees(int deptId)
	{
		
		List<Employee> empList=get(deptId).getEmpListInDepartment();
		return empList;
		
	
	}

	@Override
	public List<Employee> getEmployees(int deptId, int amount)
	{
		List<Employee> empList=get(deptId).getEmpListInDepartment();
		List<Employee> newList=new ArrayList<Employee>();
		for(Employee e:empList)
		{
			if(e.getSalary()==amount) 
			 newList.add(e);
			 
							
		}
		
		return newList;
						
	}

	@Override
	public List<Employee> getEmployees(int deptId, int min, int max) 
	{
		List<Employee> empList=get(deptId).getEmpListInDepartment();
		List<Employee> newList=new ArrayList<Employee>();
		for(Employee e:empList)
		{
			if(e.getSalary()>=min&&e.getSalary()<=max) 
			 newList.add(e);
			 		
		}
		return newList;
	}
	

}

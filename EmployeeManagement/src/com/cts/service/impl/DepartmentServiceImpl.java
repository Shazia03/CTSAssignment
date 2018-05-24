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
	public void display(Department d)
	{
		
		System.out.println("Department Id:"+d.getDeptId());
		System.out.println("Department Name:"+d.getDeptName());
	}
	public void display()
	{
		for(Department d:deptList)
		{
			display(d);
		}
	}
	
	
	
	@Override
	public boolean save(int empId, int deptId)
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
		
		return true;
	}

	@Override
	public boolean remove(Employee e, Department d)
	{
		if(get(d.getDeptId())!=null&&(get(e.getId())!=null))
		{
			return false;
		}
		deptList.remove(d);
		return true;
	}

	@Override
	public List<Employee> getEmployees(int deptId)
	{
		
		Department dept=get(deptId);
		return dept.getEmpList();
	//	empList.(dept);
		
		
 //return null;		
			
			
	}

	@Override
	public List<Department> getEmployees(int deptId, int amount)
	{
						
		
		
		return null;
	}

	@Override
	public List<Department> getEmployees(int deptId, int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

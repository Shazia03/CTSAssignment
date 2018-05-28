package com.cts.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cts.model.Department;
import com.cts.model.Employee;
import com.cts.service.DepartmentService;
import com.cts.service.EmployeeService;

public class DeptServiceHashMapImpl implements DepartmentService
{
	Employee e;
	EmployeeService empServiceHash;
	private Map<Integer , Department> deptMap;
	/*public DeptServiceHashMapImpl()
	{
		deptMap=new HashMap<Integer , Department>();
		empServiceHash=new EmpServiceHashMapImpl();
	}*/
	
	public DeptServiceHashMapImpl(EmployeeService empServiceHash)
	{
		deptMap=new HashMap<Integer , Department>();
		this.empServiceHash=empServiceHash;
	}


	@Override
	public boolean save(Department d)
	{
		if(!deptMap.containsKey(d))
		deptMap.put(d.getDeptId(),d);
		return true;
	
	}

	@Override
	public boolean update(Department d)
	{
		if(!deptMap.containsKey(d))
			return false;
			deptMap.remove(deptMap.containsKey(d));
			deptMap.put(d.getDeptId(),d);
			
			return true;
	}

	@Override
	public boolean delete(int id) {
		if(deptMap.containsKey(id))
		{
			deptMap.remove(id);
			return true;
		}
	return false;
	}

	@Override
	public Department get(int id) 
	{
		return deptMap.get(id);
	}

	@Override
	public List<Department> get() 
	{
		return new ArrayList<Department>((Collection<? extends Department>) deptMap.values());
	}

	@Override
	public boolean addEmployeeToDept(int empId, int deptId) 
	{
		
		Employee emp=empServiceHash.get(empId);
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
		deptMap.put(empId, dept);
		return true;
	}

	@Override
	public boolean removeEmployeeFromDept(int empId, int deptId)
	{
		
		Employee emp=empServiceHash.get(empId); 	//get the Employee with the corresponding Id
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
	public List<Employee> getEmployees(int deptId, int amount) {
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
	public List<Employee> getEmployees(int deptId, int min, int max) {
		List<Employee> empList=get(deptId).getEmpListInDepartment();
		List<Employee> newList=new ArrayList<Employee>();
		for(Employee e:empList)
		{
			if(e.getSalary()>=min&&e.getSalary()<=max) 
			 newList.add(e);
			 		
		}
		return newList;
		
	}

	@Override
	public void display(Department d) {
		System.out.println(d);
		
	}

	@Override
	public void display() {
	
		System.out.println(deptMap);
		
	}
	

}

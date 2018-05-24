package com.cts.service;

import java.util.List;

import com.cts.model.Department;
import com.cts.model.Employee;

public interface DepartmentService 
{
	 public boolean save(Department d);
	 public boolean update(Department department);
	 public boolean delete(int id);
	 public Department get(int id);
	 public List<Department> get();
	 public boolean save(int empId,int deptId);
	 public boolean remove(Employee empId,Department deptId);
	 public List<Employee> getEmployees(int deptId);
	 public List<Department> getEmployees(int deptId,int amount);
	 public List<Department> getEmployees(int deptId,int min,int max);
	
	 
	 

}

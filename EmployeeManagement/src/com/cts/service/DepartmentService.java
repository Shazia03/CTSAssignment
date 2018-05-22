package com.cts.service;

import java.util.List;

import com.cts.model.Department;
import com.cts.model.Employee;

public interface DepartmentService 
{
	 public boolean add(Department department);
	 public boolean update(Department department);
	 public boolean delete(int id);
	 public Department get(int id);
	 public List<Department> get();
	 public boolean add(Employee empId,Department deptId);
	 public boolean remove(Employee empId,Department deptId);
	 public List<Department> getEmployees(int deptId);
	 public List<Department> getEmployees(int deptId,int amount);
	 public List<Department> getEmployees(int deptId,int min,int max);
	 
	 

}

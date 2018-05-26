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
	 public boolean addEmployeeToDept(int empId,int deptId);
	 public boolean addEmployeeToDept(int empId1,int empId2,int deptId); 
	 public boolean removeEmployeeFromDept(int empId,int deptId);
	 public List<Employee> getEmployees(int deptId);
	 public List<Employee> getEmployees(int deptId,int amount);
	 public List<Employee> getEmployees(int deptId,int min,int max);
	 public void display(Department d);
	 public void display();
	
	 
	 

}

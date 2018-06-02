package com.cts.model;

public class Employee 
{
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", deptId=" + deptId + "]";
	}

	private int id;
	private String name;
	private int salary;
	private int deptId;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		deptId = deptId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee(int id, String name, int salary, int deptId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
}

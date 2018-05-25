package com.cts.collections.list;

import java.util.Comparator;

public class EmployeeDetails implements Comparator<EmployeeDetails>,Comparable<EmployeeDetails> {
	public EmployeeDetails(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public EmployeeDetails() {
		
	}
	private int id;
	private String name;
	private int salary;
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
	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) 
	{
		
		return o1.salary-o2.salary;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(EmployeeDetails o1)
	{
		
		return 0;
	}


}

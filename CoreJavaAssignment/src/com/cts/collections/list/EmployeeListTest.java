package com.cts.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeListTest {

		public static void main(String[] args) 
		{
			EmployeeList empListDemo=new EmployeeList();
			List<EmployeeDetails> empList=new ArrayList<EmployeeDetails>();
			EmployeeDetails em1=new EmployeeDetails(101,"Shan",5000);
			empList.add(em1);
			EmployeeDetails em2=new EmployeeDetails(102,"Shaz",5000);
			empList.add(em2);
			EmployeeDetails em3=new EmployeeDetails(103,"Shaf",5000);
			empList.add(em3);
			
			System.out.println("Before Sorting");
			empListDemo.displayEmployeeList(empList);
			
			System.out.println("After Sorting");
			
			Collections.sort(empList,new EmployeeDetails());
			empListDemo.displayEmployeeList(empList);
			
			
			
			
		}
		

	

}

package com.cts.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.exceptions.DuplicateUserException;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

public class EmpServiceImplDB implements EmployeeService {
	private Connection con;
	private PreparedStatement prepareStatement;
	List<Employee> empList;

	public EmpServiceImplDB() 
	{
		empList =new ArrayList<Employee>();
	}

	@Override
	public boolean save(Employee emp)  
	{
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("insert into employee values(?,?,?,?);");
			prepareStatement.setInt(1, emp.getId());
			prepareStatement.setString(2, emp.getName());
			prepareStatement.setInt(3, emp.getSalary());
			prepareStatement.setInt(4, emp.getDeptId());
			prepareStatement.executeUpdate();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("delete from employee where id=?");
			prepareStatement.setInt(1, id);
			prepareStatement.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> get() {
		con=DBConnection.getConnection();
		Statement statement;
		ResultSet resultset;
		Employee emp;
		List<Employee> empList=new ArrayList<Employee>();
		try {
			statement=con.createStatement();
			resultset=statement.executeQuery("select * from employee");
			while(resultset.next())
			{
				emp=new Employee();
				emp.setId(resultset.getInt(1));
				emp.setName(resultset.getString(2));
				emp.setSalary(resultset.getInt(3));
				emp.setDeptId(resultset.getInt(4));
				empList.add(emp);
			}return empList;
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public boolean update(Employee emp) {
		con=DBConnection.getConnection();
		try {
			prepareStatement=con.prepareStatement("update employee set name=?, salary=?, deptId=? where id=?");
			prepareStatement.setString(1, emp.getName());
			prepareStatement.setInt(2, emp.getSalary());
			prepareStatement.setInt(3, emp.getDeptId());
			prepareStatement.setInt(4, emp.getId());
			if(prepareStatement.executeUpdate()>0)
			return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}	return false;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(List<Employee> empList) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getEmployees(int min, int max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}
}

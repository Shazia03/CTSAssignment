package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.db.EmpServiceImplDB;
import com.cts.model.Employee;
import com.cts.service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EmployeeController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int  salary=Integer.parseInt(request.getParameter("salary"));
		int deptId=Integer.parseInt(request.getParameter("deptId"));
		EmployeeService employeeService=new EmpServiceImplDB();
		Employee emp;
		emp=new Employee(id, name, salary, deptId);
		employeeService.save(emp);
		
		RequestDispatcher dispatcher;
		if(employeeService.save(emp))
		{
			dispatcher=request.getRequestDispatcher("welcome.html");
			dispatcher.forward(request, response);
		}
		else
		{
			dispatcher=request.getRequestDispatcher("Employee.html");
			PrintWriter printwriter=response.getWriter();
			printwriter.println("invalid input");
			dispatcher.include(request, response);
		}
	}

}

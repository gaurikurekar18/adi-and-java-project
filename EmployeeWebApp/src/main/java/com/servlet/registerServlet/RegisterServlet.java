package com.servlet.registerServlet;

import java.io.IOException;


import com.servlet.entity.Employee;
import com.servlet.service.EmployeeService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet  extends HttpServlet{
	
	private Object msg;

	//service
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	//	resp.setContentType("text/html");
	//	resp.getWriter().print("<h1> style='color:red'>registration success....</h1>");
		
		
		String name=req.getParameter("name");
		
		String email=req.getParameter("email");
		
	    String password=req.getParameter("password");
	    
	    String dep=req.getParameter("dep");
	    
	    String gender=req.getParameter("gender");
	    
	    String address=req.getParameter("address");
	    
	    Employee employee=new Employee(name,email,password,dep,gender,address);
	    
	   EmployeeService service=new EmployeeService();
	   
	   String msg = service.saveEmp(employee);
	   
	   req.setAttribute("successMsg",msg);
	   
	   req.getRequestDispatcher("register.jsp").include(req, resp);
		
		
		
		
	}

}

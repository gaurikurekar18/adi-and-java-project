package com.jdbc;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Demo {
	
	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	   Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/12oct","root","root");
	 
	   Statement s = c.createStatement();
	
	//  s.execute("create database ram");
	//  s.execute("create table student(id int,name varchar(43),marks double)");
//	s.execute("create table employee(id int,name varchar(23),salary double)"); 
	  
//	s.execute("insert into student value(2,'shyam',67.67),(3,'hari',67.78)");
	   s.execute("insert into employee(id,name,salary)value(101,'Rohit',7888.23)");
	  System.out.println("Data inserted.....");
	  
	   
	    }
		catch(ClassNotFoundException | SQLException c)
		{
		System.out.println(c.getMessage());
		}
		
}
}
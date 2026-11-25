package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.jdbcConnection.MySQLConnection;
public class EmployeeDao {
	
static Connection con = MySQLConnection.getConnection();
	
//create table
public static void createTable()
{
	PreparedStatement pst=null;
	
	try {
		
	pst=con.prepareStatement("create table employee(id int,name varchar(43),salary double,dep varchar(33),address varchar(34),gender varchar(35))");
	
	pst.execute();
	System.out.println("table created");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			pst.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
}

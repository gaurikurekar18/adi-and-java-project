package com.aadi;
import java.sql.Connection;
import com.dao.EmployeeDao;
import com.jdbcConnection.MySQLConnection;
public class Dao {
	
	Connection con=MySQLConnection.getConnection();
	
	public static void main(String[]args)
	{
		EmployeeDao.createTable();
	}

}

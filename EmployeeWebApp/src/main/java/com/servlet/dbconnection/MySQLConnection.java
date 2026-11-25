package com.servlet.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {

	private static final String url = "jdbc:mysql://localhost:3306/24oct";
	private static final String username = "root";
	private static final String password = "root";

	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(url, username, password);   // <-- 'con =' add kela

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
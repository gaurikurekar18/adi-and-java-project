package com.servlet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.servlet.dbconnection.MySQLConnection;
import com.servlet.entity.Employee;

public class EmployeeDao {
	
	Connection con = MySQLConnection.createConnection();

    public String saveEmployee(Employee employee) {

        String sql = "insert into employee value (?,?,?,?,?,?)";
        try {
             PreparedStatement pst = con.prepareStatement(sql); 

            pst.setString(1, employee.getName());
            pst.setString(2, employee.getEmail());
            pst.setString(3, employee.getPassword());
            pst.setString(4, employee.getDep());
            pst.setString(5, employee.getGender());
            pst.setString(6, employee.getAddress());

            
            int x=pst.executeUpdate();
            
            if(x>0)
            {
            	return"Employee Registered Successfully.";
            }
            

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
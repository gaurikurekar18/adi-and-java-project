
package com.aadiandjava.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

import com.aadiandjava.dbConnection.MySQLConnection;
import com.aadiandjava.entity.Employee;

@Repository
public class EmployeeDao {

	Connection con = MySQLConnection.getDbConnection();

    public String insertEmployee(Employee employee) {

        try {
            
            PreparedStatement pst = con.prepareStatement(
           "INSERT INTO employee (id, name, dep, address, gender, salary) VALUES (?,?,?,?,?,?)"
            			);

            pst.setInt(1, employee.getId());
            pst.setString(2, employee.getName());
            pst.setString(3, employee.getDep());
            pst.setString(4, employee.getAddress());
            pst.setString(5, employee.getGender());
            pst.setDouble(6, employee.getSalary());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return "Employee insertion failed";
        }

        return "Employee Saved Successfully";
    }
}

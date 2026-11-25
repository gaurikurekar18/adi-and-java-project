package com.servlet.service;

import com.servlet.dao.EmployeeDao;
import com.servlet.entity.Employee;

public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	
	public String saveEmp(Employee employee)
	{
	return	dao.saveEmployee(employee);
	}
	
	
	
	
	

}

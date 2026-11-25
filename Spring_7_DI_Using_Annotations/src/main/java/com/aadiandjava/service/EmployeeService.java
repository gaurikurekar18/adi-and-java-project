package com.aadiandjava.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.aadiandjava.dao.EmployeeDao;
import com.aadiandjava.entity.Employee;

@Service
public class EmployeeService {
	
	
private EmployeeDao dao;

//	@Autowired
//	private EmployeeDao dao;
	
     @Autowired
	public EmployeeService(EmployeeDao dao)
	{
		this.dao=dao;
		//TODO Auto-generated constructor stub
	}
	
	public EmployeeService()
	{
		//TODO Auto-generated constructor stub
	}
	
	public String insert(Employee employee)
	{
		return dao.insertEmployee(employee);
	}

}

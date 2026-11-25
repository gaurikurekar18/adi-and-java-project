package com.aadiandjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aadiandjava.entity.Employee;
import com.aadiandjava.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	public String insert(Employee employee)
	{
		return service.insert(employee);
	}

}

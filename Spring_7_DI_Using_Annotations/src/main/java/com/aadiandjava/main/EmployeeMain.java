package com.aadiandjava.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aadiandjava.controller.EmployeeController;
import com.aadiandjava.entity.Employee;

@Component
public class EmployeeMain {
	
	@Autowired
	EmployeeController controller;
	
	public void insertData()
	{
		Employee e = new Employee(3, "Aadiandjava", 450000, "Male", "pune");
		System.out.println(controller.insert(e));
	}
	
}

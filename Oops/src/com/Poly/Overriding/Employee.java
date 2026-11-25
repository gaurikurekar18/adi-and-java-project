package com.Poly.Overriding;

public class Employee {
	
	int perDay=600;
	int totalDays=24;
	double salary;
	void calculateSalary()
	{
		salary  = perDay * totalDays;
		
		System.out.println("Employee Salary ="+salary);
	}

}

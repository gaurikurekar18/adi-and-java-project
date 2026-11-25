package com.Poly.Overriding;

public class JavaDeveloper extends Employee {
	
	void calculateSalary()
	{
		perDay = 800;
		totalDays = 25;
		salary = perDay * totalDays;
		System.out.println("Java Developer Salary="+salary);
		
		}
	
	public static void main(String [] args)
	{
		Employee e=new Employee();
		e.calculateSalary();
		
		JavaDeveloper j= new JavaDeveloper();
		j.calculateSalary();
	}
	
	
	
	
	
	
	
	
}
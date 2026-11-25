package com.Polymorphism;

public class Employee {
	//2 rule type can be different
	void work(int i)
	{
	System.out.println("Employee is working in company");	
	}
	void work(String i)
	{
		System.out.println("Employee is working in WFH");
	}
	void work(float i)
	{
		System.out.println("Employee is woking with junior");
	}
	public static void main(String[]args)
	{
		Employee e=new Employee();
		e.work(34.54f);
		e.work(29);
		e.work(23);
	}

}

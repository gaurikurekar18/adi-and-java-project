package com.Constructor;

public class Employee {
	
	//constructor name should be same as class name
	//Constructor will automatically execute when we create the object..
	//.for each object constructor will execute only once...
	Employee()
	{
		System.out.println("MyConstructor");
	}

	//Method Name can be anything.....
	//Method needs to call to execute
	//for each object  constructor will execute unlimited time...
	void aadi()
	{
		System.out.println("Aadi method");
	}
	public static void main(String[]args)
	{
		Employee e1= new Employee();
		
		Employee e2= new Employee();
	}
}

package com.aadiandjava.ex1;

public class Test {
	
	public static void main(String[]args)
	{
	
	//constructor injection	
	//Student s1=new Student(new Laptop());
		
	//field level injection
	//s1.laptop = new Laptop();
		
	  Student s1=new Student();
	  
	 s1.setLaptop(new Laptop());//setter injection
	  
	s1.study();

}
}
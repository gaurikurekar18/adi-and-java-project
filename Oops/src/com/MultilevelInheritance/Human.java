package com.MultilevelInheritance;

public class Human {
	String name;
	int age;
	String address;
	
	
	Human(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	void show()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	

}

package com.Polymorphism;

public class User {
	
	void display(int id,String name,String address)
	{
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	}
	void display(String name,String address,int id)
	{
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	}
	void display(String address,int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
		
	}
		
	public static void main(String[]args)
	{
		User user=new User();
		user.display(1," Ram"," pune");
		System.out.println("====================");

		user.display(2, "purvaj"," nagpur");
		System.out.println("=======================");
		user.display(3,"gauri","narkhed");
		
	}
	

}

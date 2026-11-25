package com.inheritance;

public class User {
	
	String username;
	String password;
	String address;
	
	User(String username,String password,String address)
	
	{
		this.username=username;
		this.password=password;
		this.address=address;
	}
	
	void show()
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(address);
	}
	

}

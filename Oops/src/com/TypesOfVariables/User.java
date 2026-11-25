package com.TypesOfVariables;

public class User {
	String username;
	String password;
	String email;
	
	static String address;
	
	void display()
	{
		System.out.println(address);
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
	}
	
	public static void main(String[]args)
	
	{
		User.address="pune";
		
		User user1 = new User();
		user1.username="aadi1212";
		user1.password="2345";
		user1.email="aadi@gmail.com";
		user1.display();
		
		System.out.println("===========================");
		
		User user2 = new User();
		user2.username ="gauri1211";
		user2.password = "4555";
		user2.email="gauri@gmail.com";
		user2.display();
	}

}

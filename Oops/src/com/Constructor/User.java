package com.Constructor;

public class User {
	
	String username;
	
	String password;
	
	String email;
	
	String gender;
	
	
	User(String username,String password,String email,String gender)
	{
		this.username=username;
		this.password=password;
		this.email=email;
		this.gender=gender;
		//display();
	}
	
	void display()
	{
		System.out.println("Username = "+username);
		System.out.println("password = "+password);
		System.out.println("email = "+email);
		System.out.println("gender = "+gender);
		System.out.println("==========================");
	}
	
	void changeUsername(String newUsername)
	{
		username=newUsername;
	}
	
	public static void main(String[]args)
	{
		//When we want to call more than 1 method...
	//	User user1 = new User("aadi","1212","aadi@gmail.com","male");
	//	user1.display();
	//	user1.changeUsername("aadiandjava");
	//	user1.display();
		
		//********OR**************
		//only one method we can call on anonyomos object....
		new User("aadi","1212","aadi@gmail.com","Male").display();
	}

}

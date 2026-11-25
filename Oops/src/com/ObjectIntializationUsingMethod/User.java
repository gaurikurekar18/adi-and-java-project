package com.ObjectIntializationUsingMethod;

public class User {
	
	String username;
	String password;
	String email;
	
	//not recommanded
	//void setData(String x,String y,String z)//local variable
	//{
	//	username=x;
	//	password=y;
	//	email=z;
	//}
	
	void setData(String username,String password,String email)
	{
		//interview qu=>this keyword is used differentiate instance variable and local variable
		this.username=username;//this keyword is very important
		this.password=password;
		this.email=email;
	}
	
	void show()
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
	}
	
	
	
	public static void main(String[]args)
	{
		User user1=new User();
	   user1.setData("aadi","1212","aadi@gmail.com");
		user1.show();
		
	System.out.println("========================");
	
	
		User user2=new User();
		user2.setData("gauri","3434","gauri@gmail.com");
		user2.show();
	
		
		
	}

}

package com.Poly.Overriding;

public class User {
	
	User()
	{
		this(11);
		System.out.println("0 paramiter");
	}
	
	User(int i)
	{
		this(11,22);
	System.out.println("1 paramiter");	
	}
	
	User(int i,int j)
	{
		System.out.println("2 paramiter");
	}
	
	public static void main(String[]args)
	{
		User user=new User();
		//User user1=new User(11);
		//User user2=new User(11,32);
	}

}

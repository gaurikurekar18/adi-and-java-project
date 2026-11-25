package com.Encapsulation;

public class Test {
	
	public static void main(String[]args)
	{
		User user=new User();
		//user.username="aadiandjava";//no one can set your data
		user.setUsername("aadiandjava");//data set using setter method
		//System.out.println(user.username);//no one can get your data
		
		
		user.setpassword("5555");
		System.out.println(user.getpassword());
		
		System.out.println(user.getUsername());//data get using get
		
		
		}

}

package com.Encapsulation;

public class User {
	
	private String username;
	
	private String password;
	
	
	//setter method
	public void setUsername(String username)
	{
		if(username.equals("Aadiandjava"))
		{
			this .username=username;
		}
		else
		{
			this.username="unknown";
		}
		
	}
	
	
//getter method
	public String getUsername()
	{
		return username;
	}
	
	
	//setter
	public void setpassword(String password)
	{
	this.password=password;
	}
	
	//getter
	public String getpassword()
	{
		return password;
	}
	//getter method
	public String getusername()
	{
		if(password.equals("5555"))
		{
			return username;
		}
		return "password not Matched";
	}
}

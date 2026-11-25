package com.Polymorphism;

public class Ecommerce {
	
	void login(String username,String password)
	{
		if(username.equals("gauri")&& password.equals("1212"))
		{
			System.out.println("Login success using username and password");
		}
		else
		{
			System.out.println("Login failed");
		}
	}
	int login(int otp)//void=>int
	{
		int dbOtp=3423;
		
		if(otp==dbOtp)
		{
			System.out.println("login Success using OTP");
		}
		else
		{
			System.out.println("login failed");
		}
		return otp;//return otp int cha jage var void lihal tar return nhi lihav lagt
	}
	public static void main(String[]args)
	{
		Ecommerce e=new Ecommerce();
		e.login(3423);
		e.login("gauri","1212");
	}
}

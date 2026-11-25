package demo;

import java.util.Scanner;

public class IFElse {
	public static void main(String[]args) {
		//CTRL + space +ENTER
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username...");
		String username=sc.next();
		System.out.println("Enter a password");
		String password=sc.next();
		if(username.equals("aadiandjava")&& password.equals("aadi1212"))
		{
			System.out.println("Login Success...");
		}else
		{
			System.out.println("Login Failed...");
		}
		
		
		
		
	//	if(username.equals("admin"))
	//	{
	//		System.out.println("Admin DashBoard granted");
	//	}else
	//	{
	//		System.out.println("User DashBoard Granted...");
	//	}
		
		
		
		//int num=sc.nextInt();
		
		
		
		
	//	if(num%2==0)
	//	{
	//		System.out.println("EVEN");
	//	}
	//	else
	//	{
	//		System.out.println("ODD");
	//	}	
		
		
		
		
	//	if(num<0)
	//	{
	//		System.out.println("Negative Number");
	//	}
	//	else
	//	{
	//		System.out.println("Positive Number");
	//	}
		
		
		
		
	//	if(num<0)
	//	{
	//		System.out.println("Negative number...");
	//	}
	//	if(num>0)
	//	{
	//		System.out.println("positive Number..");
	//	}
		
		
		
	}

}

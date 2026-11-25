package com.Interface;

public class Main implements SBI,HDFC{
	
	public void pay()
	{
		System.out.println("paid");
	}
	public void login()
	{
		System.out.println("login");
	}
	
	public static void main(String[]args)
	{
		SBI sbi=new Main();
		sbi.pay();
		sbi.login();
		
		HDFC hdfc=new Main();
		hdfc.pay();
		
	}

}

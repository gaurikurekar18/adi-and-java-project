package com.Abstraction;

public class UPI extends Bank{
	
	@Override
	void processPayment(double amount)
	{
		boolean x=Bank.validateAmount(amount);
		if(x==true)
		{
			System.out.println("Payment Processed via UPI:"+amount);
		}
		else
		{
			System.out.println("Invalid Amount...");
		}
	}
	
	public static void main(String[]args)
	{
		//UPI upi=new UPI();
		//upi.processPayment(-2111);
		
		//Gpay gpay=new Gpay();
		//gpay.processPayment(22222);
		
		//**OR**
		//object not allowed
		//Bank bank=new Bank();
		
		//parent class=new ChildClass()
		//*****Upcasting in java***********
		//**dynamic Disptach**
		Bank bank=new UPI();
		bank.processPayment(2222);
		
		Bank bank1=new Gpay();
		bank1.processPayment(555555);
	}

}

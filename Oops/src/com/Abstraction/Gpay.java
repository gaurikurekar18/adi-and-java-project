package com.Abstraction;

public class Gpay extends Bank {
	
	void processPayment(double amount)
	{
		boolean x=Bank.validateAmount(amount);
		if(x==true)
		{
			System.out.println("payment processed via Gpay:"+amount);
		}
		else
		{
			System.out.println("Invalid Amount..");
		}
	}
	
	

}

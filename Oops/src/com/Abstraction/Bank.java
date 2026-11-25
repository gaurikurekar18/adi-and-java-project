package com.Abstraction;

public abstract class Bank {
	
	//common for all implement class
	static boolean validateAmount(double amount)
	{
		if(amount>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	abstract void processPayment(double amount);	

}

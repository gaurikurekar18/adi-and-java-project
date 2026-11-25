package com.aadiandjava.ex2;

public class CreditCardPayment implements IPayment{
	
	
	public void processPayment(double amount)
	{
		System.out.println("payment Processed via creaditcard="+amount);
	}

	
	

}

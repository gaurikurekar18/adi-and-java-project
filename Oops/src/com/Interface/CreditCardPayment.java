package com.Interface;

public class CreditCardPayment implements Payment{
	
	@Override
	public void pay(double amount)
	{
		System.out.println("paid using creditcard..Rs"+amount);
	}

}

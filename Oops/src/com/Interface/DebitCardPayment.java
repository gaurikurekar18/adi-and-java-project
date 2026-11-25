package com.Interface;

public class DebitCardPayment implements Payment{
	
	@Override
	public void pay(double amount)
	{
		System.out.println("paid using creditcard..Rs"+amount);
	}

}

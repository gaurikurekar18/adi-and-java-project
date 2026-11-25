package com.aadiandjava.ex2;

public class DebitCardPayment implements IPayment {
	
	public void processPayment(double amount)
	{
		System.out.println("Payment processed via DebitCardPayment"+amount);
	}

	

}

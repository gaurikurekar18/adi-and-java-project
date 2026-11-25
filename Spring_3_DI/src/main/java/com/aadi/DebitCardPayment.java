package com.aadi;

public class DebitCardPayment implements IPayment{
	
	public void processPayment(double amount)
	{
		System.out.println("payment processed via URI="+amount);
	}

}

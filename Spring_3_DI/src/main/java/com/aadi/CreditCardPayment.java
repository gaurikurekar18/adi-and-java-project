package com.aadi;

public class CreditCardPayment implements IPayment {

	@Override
	public void processPayment(double amount) {
    System.out.println("Payment processed via Credit card="+amount);
		
	}

}

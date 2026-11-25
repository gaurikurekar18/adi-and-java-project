package com.aadi;

public class UPIPayment implements IPayment {

	@Override
	public void processPayment(double amount) {
		System.out.println("payment processed via UPI="+ amount);
		
	}

}

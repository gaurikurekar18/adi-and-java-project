package com.aadiandjava.ex2;

public class UPIPayment implements IPayment{

public void processPayment(double amount)
	{
		System.out.println("Payment Processed via UPI ="+amount);
	}

}

package com.aadi;

public class PaymentService {
	
	IPayment payment;
	public void doPayment(double amount)
	{
		payment.processPayment(amount);
		
		System.out.println("Payment Sucess....Thank you");
	}
	
	
/*	public void setPayment(IPayment payment)
	{
		System.out.println("setter injection");
		this.payment=payment;
	}
*/
	
	
//	public PaymentService(IPayment payment)
//	{
//		this.payment=payment;
//	}
	
	
	public PaymentService()
	{
	System.out.println("0 param constructor");	
	}
	
	
	
}

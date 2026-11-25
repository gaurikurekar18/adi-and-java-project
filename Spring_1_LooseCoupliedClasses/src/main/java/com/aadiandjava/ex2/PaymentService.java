package com.aadiandjava.ex2;

public class PaymentService {
	
//	UPIPayment upiPayment;
//	DebitCardPayment debit;
//	CreditCardPayment credit;
	
	public PaymentService()
	{
		System.out.println("payment service constructor called");
	}
	
	
	
	IPayment payment;
	public void setPayment(IPayment payment)
	{
		this.payment=payment;
	}
	
/*	public void setUpi(UPIPayment upiPayment)
	{
		this.upiPayment=upiPayment;
	}
	
	public void setDebit(DebitCardPayment debit)
	{
		this.debit=debit;
	}
	
	public void setCredit(CreditCardPayment credit)
	{
		this.credit=credit;
	}*/
	
	
	
	
	public PaymentService(IPayment Payment)
	{
		this.payment=Payment;
	}
	
	/*public PaymentService(DebitCardPayment debit)
	{
	 this.debit=debit;	
	}
	
	public PaymentService(CreditCardPayment credit)
	{
		this.credit=credit;
	}*/
	
	
	
	
	
	
	public void dopayment(double amount,String gateway)
	{
		if(gateway.equals("UPI"))

		{
			payment.processPayment(amount);
		}
		else if(gateway.equals("DEBIT"))
		{
			payment.processPayment(amount);
		}
		else if(gateway.equals("CREDIT"))
		{
			payment.processPayment(amount);
		}
		else
		{
			System.out.println("Invalid payment Gateway..");
		}
		
		System.out.println("payment Success...RS="+amount);
		
	
	}
	

}

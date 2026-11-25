package com.Polymorphism;

public class PaymentService {
	
	void pay(String UpID)
	{
		System.out.println("payment processed via:"+UpID);
	}
	void pay(long phonepayNumber)
	{
		System.out.println("payment processed via:"+phonepayNumber);
	}
	public static void main(String []args)
	{
		PaymentService p=new PaymentService();
		p.pay(237389337937L);
		p.pay("aadi@hdfc");
	}

}

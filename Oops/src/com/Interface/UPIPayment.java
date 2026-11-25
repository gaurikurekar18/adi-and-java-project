package com.Interface;

public class UPIPayment implements Payment {
	
	@Override
	public void pay(double amount)
	{
		System.out.println("paid using UPI Payment:"+amount);
		
		
	}

}

package com.Poly.Overriding;

public class SBI extends RBI {
	
	void interestRate()
	{
		System.out.println("Interest Rate 6.6%");
	}
	
	public static void main(String[] args)
	{
	//	SBI sbi = new SBI();
		//sbi.interestRate();
	//	sbi.deposit(6000);
		
		RBI rbi = new RBI();
		rbi.deposit(6000);
	}
	
	void deposite(int amount)
	{
		if(amount>5000)
		{
			bankBalance +=amount;
			System.out.println("Deposit Success"+bankBalance);
			}
		else
		{
			System.out.println("Minimum Deposite amount required 10000");
		}
	}

}

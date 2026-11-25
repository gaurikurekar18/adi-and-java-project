package com.Poly.Overriding;

public class RBI {
	double bankBalance;
	void interestRate()
	{
		System.out.println("Interest Rate 4.6%");
	}
	
	void deposit(int amount)
	{
		if(amount>=10000)
		{
			bankBalance +=amount;
			System.out.println("Deposit Success.="+bankBalance);
		}
		else
		{
			System.out.println("Minimum Deposite amount required 10000");
		}
	}

}

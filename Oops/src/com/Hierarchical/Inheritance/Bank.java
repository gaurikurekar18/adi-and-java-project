package com.Hierarchical.Inheritance;

public class Bank {
	
	double bankBalance;
	double interestRate;
	Bank(double bankBalance,double interestRate)
	{
		this.bankBalance=bankBalance;
		this.interestRate=interestRate;
	}
	void display()
	{
		System.out.println("BankBalance="+bankBalance);
		System.out.println("InterestRate="+interestRate);
	}

}

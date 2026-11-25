package com.Hierarchical.Inheritance;

public class Test {
	
	public static void main(String[]args)
	{
		System.out.println("SBI INFO");
		SBI sbi=new SBI(10000,6.7);
		sbi.display();
		
		System.out.println();
		
		System.out.println("HDFC INFO");
		HDFC hdfc=new HDFC(200000,6.3);
		hdfc.display();
	}

}

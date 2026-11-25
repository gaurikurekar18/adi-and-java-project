package com.aadi;

public class Demo {
	
	public void m1() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[]args)
	{
		Demo d=new Demo();
		d.m1();
		d.m1();
	}

}

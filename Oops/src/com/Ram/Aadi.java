package com.Ram;

public class Aadi {
	
	protected Aadi()
	{
		System.out.println("aadi constructor");
	}
	
	protected int id=11;
	
	protected void m1()
	{
		
	}
	
	public static void main(String[]args)
	{
		Aadi aadi=new Aadi();
		System.out.println(aadi.id);
		aadi.m1();
		
	}

}

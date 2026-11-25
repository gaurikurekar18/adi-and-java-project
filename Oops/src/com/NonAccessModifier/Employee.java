package com.NonAccessModifier;

public final class Employee {
	
	public static final int id=22;
	private static final int x=45;
	protected static final int i=44;
	static final int j=45;
	
	protected Employee()
	{
		
	}
	
	//update
	//id=23;
	public final void m1()
	{
		System.out.println("hello");
	}
	
	void money()
	{
		m1();
	}
	
   public static void main(String[]args)
	{
		
	}
	
	

}

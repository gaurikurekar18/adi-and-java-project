package com.Interface;

public interface Test {
	//from java 9 version************Interview qu***********
	private void m2()
	{
		
	}
	
	//from java 8 version
	static void m3()
	{
		
	}
	
	//from java 8 version
	default void m4()
	{
		
	}
	
	public static final int x=234;
	
	int id=444;//public static final
	
	public String name="Ram";//static final compiler will add
	
	static int i=111;//public final compiled will add
	
	final int y=56;//public static compile will add
	
	public abstract void login();
	
	void register();//public abstract compiler will add
	
	public void pay();//abstract compiler will add
	
	abstract void fun();//compiler will add public
	
	
	
	public static void main(String[] args)
	{
	System.out.println(Test.id);
	}

}

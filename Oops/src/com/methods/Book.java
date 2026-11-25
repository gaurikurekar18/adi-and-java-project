package com.methods;

public class Book {
	
	int id;
	static String Author;
	
	
	
	
	//method chaining =>one method is calling another method
	static void m1() 
	{
		System.out.println("m1 static");
		System.out.println(Author);
		//m3();//m1 is calling to the m3 method
		//m2();static can not call instance method
		
		Book b=new Book();
		b.m2();
		b.m4();
	}
	void m2()
	{
		System.out.println("m2 instance");
		System.out.println(id);
		System.out.println(Author);
	//	m4();//m2 method is calling m4 method
	//	m1();//m2 method is calling m1 also
	//	m3();//m2 method is calling m3 also
	}
	static void m3()
	{
		System.out.println("m3 static ");
	}
	void m4()
	{
		System.out.println("m4 instance");
	}
	public static void main(String[]args)
	{
		//Book.m1();
		//Book.m3();
		
		Book b= new Book();
		b.m2();
		b.m4();
		
	}

}

package com.Aadi;

public class Test {
	
	public static void main(String[] args)
	{
		String name="Aadiandjava";
		
		char c[]=new char[4];
		c[0]='a';
		c[1]='a';
		c[2]='d';
		c[3]='i';
		String s1=new String(c);
		System.out.println(s1);
		
		
		//1)String Literal
		//String name="Ram";
		String city="Pune";
		String address="Mh";
		
		
		//new Keyword
		String S1=new String("Aadiandjava");
		System.out.println(S1);
		
		String S2=new String("Raja");
		System.out.println(S2);
		
		
		//StringBuffer
		StringBuffer sb=new StringBuffer("I am aadi");
		System.out.println(sb);
		
		//Stringbuilder
		StringBuilder sf=new StringBuilder("i am from pune");
		System.out.println(sf);
		
		
		
		
	}

}

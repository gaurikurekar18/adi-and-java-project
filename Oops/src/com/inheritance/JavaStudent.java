package com.inheritance;

public class JavaStudent extends Student {

	public static void main(String[]args)
	{
		JavaStudent j1=new JavaStudent();
		j1.name="Ram";
		j1.address="pune";
		j1.marks=56.56;
		j1.display();
		
		System.out.println("========================");
		
		Student s1=new Student();
		s1.name="Hari";
		s1.address="Mumbai";
		s1.marks=56.89;
		s1.display();
		
	}
	
}


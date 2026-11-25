package com.inheritance;

public class PythonStudent extends Student
{
	String name;
	int age;
	int rollNo;
	String subject;
	
	void display()
	{
		super.name=name;
		super.display();
		System.out.println(age);//parent method call
		System.out.println(rollNo);
		System.out.println(subject);
	}
	public static void main(String[]args)
	{
		PythonStudent p1=new PythonStudent();
		p1.name="Rohit";
		p1.address="pune";
		p1.marks=45.45;
		p1.age=34;
		p1.rollNo=2332;
		p1.subject="python";
		p1.display();
	}

}

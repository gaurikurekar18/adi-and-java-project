package com.ObjectIntializationUsingMethod;

public class Student {

	int id;
	String name;
	int age;
	String address;
	
	void setStudent(int i,String x,int j,String y)//not a indrusty level in datatype value
	
	{
		id=i;
		name=x;
		age=j;
		address=y;
		  }
	
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
	}
	
	public static void main(String[]args)
	{
		Student s1=new Student();
		s1.setStudent(1,"purvaj", 23,"pune");
		s1.show();
		
		System.out.println("=================");
		
		Student s2=new Student();
		s2.setStudent(2,"gauri",24,"nagpur");
		s2.show();
			
	}
}

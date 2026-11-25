package com.Constructor;

public class Student {
	
	int id;
	String name;
	int age;
	
	Student()
	{
		System.out.println("Non parameter constructor");
	}
	//parameterized Matter
	Student(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		show();
	}
	void show()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println("====================");
	}
	public static void main(String []args)
	{
	//	Student s1=new Student(3,"aadi",34);
	//	s1.show();
		
	//	Student s2=new Student(2,"Ram",24);
	//	s2.show();
		
	//	Student s3=new Student(1,"shyam",22);
	//	s3.show();
		
		//************OR**************************
		
		
	//  Student s1=new Student(3,"aadi",34);
		
	//	Student s2=new Student(2,"Ram",24);
		
	//	Student s3=new Student(1,"Shyam",22);
		
		//***********OR**************
		
		
		//Anonymos object=The object whichdont have any name..
		new Student(3,"aadi",34);
		new Student(2,"Ram",24);
		new Student(1,"shyam",22);
		
	}
	

}

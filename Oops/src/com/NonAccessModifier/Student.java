package com.NonAccessModifier;

public class Student  {
	//.class file loaded in jvm ->memory done
	
	static String address;
	//after the object creation ->memory done
	int id;
	String name;
	double marks;
	static int count;
	public Student(int id, String name, double marks) {
		
		super();// to call parent class constructor=>object class is parent in super
		this.id = id;
		this.name = name;
		this.marks = marks;
		getCount();
	}
	
	static void getCount()
	{
		count++;//1 2 3
	}
	void display()
	{
		System.out.println(address);
		System.out.println(name);
		System.out.println(id);
		System.out.println(marks);
		System.out.println("===============================");
		
	}
	
	public static void main(String[]args)
	{
		Student.address="pune";//static varable value same
		Student s1=new Student(1,"Ram",45.5);
		s1.display();
		Student s2=new Student(2,"shyam",67.8);
		s2.display();
		Student s3=new Student(3,"hari",83.3);
		s3.display();
		
		System.out.println("count of student is:3");
	}
	

}

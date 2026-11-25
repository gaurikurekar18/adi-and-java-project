package com.MultilevelInheritance;

public class Student extends Human {
	
	int studentId;
	long MobileNo;
	
	Student(String name,int age,String address,int studentId,long MobileNo)
	{
		super(name,age,address);//human constructor
		this.studentId=studentId;
		this.MobileNo=MobileNo;
	}
	void showStudent()
	{
		System.out.println(studentId);
		System.out.println(MobileNo);
	}

}

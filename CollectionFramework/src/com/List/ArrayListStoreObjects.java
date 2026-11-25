package com.List;

import java.util.ArrayList;

public class ArrayListStoreObjects {
	
	public static void main(String[]args)
	{
	//	ArrayList<Integer> al=new ArrayList<Integer>();
	//	al.add(222);
	//	al.add(333);
	//	al.add(44);
	//	System.out.println(al);
		
	//	**********SETERGETER USE*********
		
	//	Student s1=new Student();
	//	s1.setId(1);
	//	s1.setName("Ram");
	//	s1.setAddress("pune");
		
	//	Student s2=new Student();
	//	s2.setId(2);
	//	s2.setName("Rohit");
	//	s2.setAddress("Nagpur");
		
	//	Student s3=new Student();
	//	s3.setId(3);
	//	s3.setName("Gyari");
	//	s3.setAddress("nashik");
		
		//*******CONSTRUCTOR USE**********
		
	//	Student s1=new Student(1,"Ram","pune");
	//	Student s2=new Student(2,"shyam","Mumbai");
	//	Student s3=new Student(3,"hari","pune");
		
		ArrayList<Student> Students=new ArrayList<Student>();
		Students.add(new Student(1,"Ram","pune"));
		Students.add(new Student(2,"Shyam","Mumbai"));
		Students.add(new Student(3,"hari","pune"));
		
		//System.out.println(students.size());
		for(Student s:Students)
		{
			if(s.getAddress().equals("pune"))
		     s.display();
		}
		
		
		
		
	
	}

}

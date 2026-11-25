package com.aadi;

import java.util.Arrays;
import java.util.List;

public class Student {
	
	int id;
	
	String name;
	
	Address address;
	
	double marks;
	
	String[] subjects;
	
	List<String>skills;
	
	Course course;
	
	
	
	public void setCourse(Course course) {
		this.course = course;
	}

	public void setSkills(List<String>skills)
	{
		this.skills=skills;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	/*public void setAddress(String address)
	{
		this.address=address;
	}*/
	
	
	
	public void setMarks(double marks)
	{
		this.marks=marks;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	public Student()
	{
		
	}
	
	
	
	/*public Student(int id, String name, String address, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}*/



	void display()
	{
		System.out.println ("ID="+id);
		System.out.println("Name="+name);
		address.displayAddress();
		System.out.println("Marks="+marks);
		System.out.println("Subjects="+Arrays.toString(subjects));
		System.out.println("Skills="+skills);
		course.displayCourse();
		System.out.println("=========================");		
	}
	

}

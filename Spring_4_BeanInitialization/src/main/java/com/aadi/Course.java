package com.aadi;

public class Course {
	
	int id;
	
	String courseName;
	
	double price;

	public void setId(int id) {
		this.id = id;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void displayCourse()
	{
		System.out.println("Course ID="+id);
		System.out.println("CourseName="+courseName);
		System.out.println("Price="+price);
	}

}

package com.MultilevelInheritance;

public class CollegeStudent extends Student {
	
	String collegeName;
	
	CollegeStudent(String name,int age,String address, int studentId,long MobileNo,String collegeName)
	{
		super(name,age,address,studentId,MobileNo);
		this.collegeName=collegeName;
	}
	void showClgStudent()
	{
		System.out.println(collegeName);
	}
	
	
	public static void main(String[]args)
	{
	
	CollegeStudent c = new CollegeStudent("Ram",35,"pune",567,2345678901L,"MIT");
		c.show();	
		c.showStudent();
		c.showClgStudent();
		System.out.println("=======================");	
		
		Student s1=new Student("akash",22,"nashik",345,3454678921L);
		s1.show();
		s1.showStudent();
		System.out.println("=========================");
		
		Human h = new Human("Rohit",45,"delhi");
		h.show();
		
			
//	c.name="Ram";
//	c.age=34;
//	c.address="pune";
	}

}

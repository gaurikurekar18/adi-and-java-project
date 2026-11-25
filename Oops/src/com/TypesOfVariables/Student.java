package com.TypesOfVariables;

public class Student {
	int id;
	String name;
	String address;
	
	static double fees;
	
	static String course;//10 obj full strack obj 
	
	static String[] rules;
	
	void show()
	{
		System.out.println("ID="+id);
		System.out.println("Name="+name);
		System.out.println("address="+address);
		System.out.println("Fees="+fees);
		System.out.println("Course="+course);
		
		for(int i=0;i<rules.length;i++)
		{
			System.out.println(rules[i]);
		}
		
		
	}
	public static void main(String[]args)
	{
		Student.fees=10000;
	//	Student.course="full Stack java";
	//	String[]rule= {"Class will start at 8 AM Morning..","Every Student must do given assignment..."}
		
		}
	}



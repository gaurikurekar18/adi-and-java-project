package com.TypesOfVariables;

public class Employee {
	
	int id;
	String name;
	double salary;
	static String companyName;
	
	void sleep(int i)
	{
		int age=23;
		System.out.println(id);
		System.out.println(age);
		
		int a = 10 , b = 32;
		System.out.println(a+b);
	}
	
	void show()
	{
		System.out.println("companyName="+companyName);
		System.out.println("ID="+id);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
		
	}
	
	public static void main(String[]args)
	
	{
		Employee.companyName="TCS";
		
		Employee e1=new Employee();
		e1.id=1;
		e1.name="Ram";
		e1.salary=45000;
         e1.show();
         e1.sleep(0);
         
         
         System.out.println("==========================");
		
		Employee e2 = new Employee();
		e2.id=2;
		e2.name="purvaj";
		e2.salary=34000;
		 e2.show();
		 e2.sleep(0);
	}

}

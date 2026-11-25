package com.methods;

public class Employee {
	void addition()
	{
		//Addition
		int a=10,b=20;
		System.out.println("Addition="+(a+b));
	}
		void substraction()
		{
			int a=10,b=20;
			System.out.println("Substraction="+(a-b));
		}
		void multiplication()
		{
			int a=10,b=20;
			System.out.println("Multiply="+(a*b));
		}
		void division()
		{
			int a=100,b=20;
			System.out.println("Division="+(a/b));
		}
		
		public static void main(String[]args)
		{
			
		Employee e=new Employee();
		e.addition();
		e.substraction();
		e.multiplication();
		e.division();	//30 method HW
		
	}

}

package com.aadi;

public class Student implements Runnable {
	
	String name;
	String subject;
	Student(String name, String subject)
	{
		this.name=name;
		this.subject=subject;
	}

		@Override
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(name + "studying "+ subject);
			}
			System.out.println("================");
		}
	
	
	public static void main(String[]args)
	{
		Student s1=new Student("Aakash","Java");
		
		Student s2=new Student("prakash","Python");
		
		Thread t1=new Thread(s1);
		
		Thread t2=new Thread(s2);
		
		t1.start();
		t2.start();
	}

}

package com.Abstraction;

public class Demo extends JavaDeveloper{
	
	void calculateSalary()
	{
	int perDay=333;
	int days=25;
	
	double totalSalary =perDay * days;
	System.out.println("total salary="+totalSalary);
	}
	
	void work()
	{
		System.out.println("Emp is working");
	}
	public static void main(String[]args)
	{
		Demo d=new Demo();
		d.id=11;
		d.calculateSalary();
		d.work();
		d.show();
		JavaDeveloper.address="pune";
		JavaDeveloper.get();
	}

}

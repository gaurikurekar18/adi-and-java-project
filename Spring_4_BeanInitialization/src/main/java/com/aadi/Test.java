package com.aadi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[]args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml"); 
		
		Student s1=(Student)context.getBean("student1");
		
		s1.display();
		
		Student s2=(Student)context.getBean("student2");
		s2.display();
	}

}

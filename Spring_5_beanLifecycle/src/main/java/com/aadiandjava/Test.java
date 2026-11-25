package com.aadiandjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args)
	{
	//	recommended way
	//	ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
	
     // IOC-XML
	//	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		//IOC-Annotation
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(User.class);
		User bean = context.getBean(User.class);
	//	System.out.println(bean.hashCode());
		
	//	Student s1 = context.getBean(Student.class);
	//	s1.getData();
		context.close();
		
	}
}
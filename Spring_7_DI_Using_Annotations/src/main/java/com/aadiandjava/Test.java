package com.aadiandjava;

import org.springframework.context.ApplicationContext;
import com.aadiandjava.main.EmployeeMain;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[]args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		EmployeeMain bean = context.getBean(EmployeeMain.class);
		
		bean.insertData();
	}
}

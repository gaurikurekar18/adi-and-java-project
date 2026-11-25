package com.util;
import org.hibernate.cfg.Configuration;
public class HibernateUtil {
	
	
	public static void main(String[]args)
	{
	
		Configuration cfg=new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		cfg.buildSessionFactory();
		
		System.out.println("table created");
		}

}

package com.aadi;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[]args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		PaymentService service1 = (PaymentService)context.getBean("paymentService1");
	//	System.out.println(service1.hashCode());
		service1.doPayment(111111);
		
		
		
		
		
		
		
		
		
		
	/*	PaymentService service2 =(PaymentService) context.getBean("paymentService2");
		System.out.println(service2.hashCode());
		
		PaymentService service3 =(PaymentService) context.getBean("paymentService3");
		System.out.println(service3.hashCode());

		System.out.println("================================");
		
		UPIPayment upi1 = (UPIPayment)context.getBean("upi1");
		System.out.println(upi1.hashCode());
		
		UPIPayment upi2 = (UPIPayment)context.getBean("upi2");
		System.out.println(upi2.hashCode());
		
		UPIPayment upi3 = (UPIPayment)context.getBean("upi3");
		System.out.println(upi3.hashCode());
		*/
		
	}

}

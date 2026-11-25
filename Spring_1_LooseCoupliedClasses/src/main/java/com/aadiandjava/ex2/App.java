package com.aadiandjava.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // Step 1: Start Spring IoC container
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aadi.xml");

        // Step 2: Get PaymentService object from Spring
        PaymentService service =
                context.getBean("paymentService", PaymentService.class);

        // Step 3: Execute payment
        service.dopayment(10000, "UPI");


//package com.aadiandjava.ex2;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class App {
//	
//	public static void main(String[]args)
//	{
//	//IOC start	
//	ApplicationContext context = new ClassPathXmlApplicationContext("aadi.xml");	
//		
//		
//		
//		
//		
//		
//		
		
		
		
	//	PaymentService service=new PaymentService();
		
		
	//	service.payment=new UPIPayment();
	//	service.dopayment(2222,"UPI");
		
	//	service.payment=new DebitCardPayment();
	//	service.dopayment(2222,"DEBIT");
		
	//	service.payment=new CreditCardPayment();
	//	service.dopayment(2222,"CREADIT");
		
		
		
	//	service.setPayment(new UPIPayment());
	//	service.dopayment(2222,"UPI");
		
	//	service.setPayment(new DebitCardPayment());
	//	service.dopayment(3333,"DEBIT");
		
	//	service.setPayment(new CreditCardPayment());
	//	service.dopayment(2222,"CREDIT");
		
		
		
	//	PaymentService service=new PaymentService(new UPIPayment());
	//	service.dopayment(2222,"UPI");
		
	//	PaymentService service=new PaymentService(new CreditCardPayment());
	//	service.dopayment(2222,"CREDIT");
		
	//	PaymentService service=new PaymentService(new DebitCardPayment());
	//	service.dopayment(2222,"DEBIT");
		
		
		
		//**************field level Injection****************
		
		//service.upiPayment=new UPIPayment();
		//service.dopayment(10000,"UPI");
		
		//service.credit=new CreditCardPayment();
		//service.dopayment(1000,"CREDIT");
		
		//service.debit=new DebitCardPayment();
		//service.dopayment(6546,"DEBIT");
		
		
		//**************Constructor Injection**************
		
	//	PaymentService service=new PaymentService(new UPIPayment());
	//	service.dopayment(10000,"UPI");
		
	//	PaymentService service=new PaymentService(new DebitCardPayment());
	//	service.dopayment(10000,"DEBIT");
		
	//	PaymentService service=new PaymentService(new CreditCardPayment());
	//		service.dopayment(10000,"CREDIT");
		
		
		//****************Setter Injection**************
		
	//	PaymentService service=new PaymentService();
	//	service.setUpi(new UPIPayment());
	//	service.dopayment(1111,"UPI");
		
	//	PaymentService service=new PaymentService();
	//	service.setDebit(new DebitCardPayment());
	//	service.dopayment(11111,"DEBIT");
		
	//    PaymentService service=new paymentService();
	//   service.setCredit(new CreditCardPayment());
	//     service.dopayment(1111,"CREDIT");
		
	}

}

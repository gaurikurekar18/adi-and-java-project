package demo;
import java.util.Scanner;
public class ElseIf {
	public static void main(String []args)
	{
		//Discount => i want give discount to the user as per product price
		//10000>=>10%
		//5000> =5%
		//2000> =2%
		//<2000=no Discount 
		Scanner sc = new Scanner(System.in);
		/*multiline comments
		 //this comment is for ecommerce application discount and gst calculation
		 /// this code is for user login and validation
		 
		System.out.println("Enter Product Price..");
		double price=sc.nextDouble();
		if(price>10000) 
		{
			System.out.println("10% Discount");
			double discount =price*0.10;//10%
			double finalprice=price-discount;
			//GST-18% ADD
			double gst=finalprice*0.18;//18%
			System.out.println(" Discount= "+discount);
			System.out.println("After Discount Price= "+finalprice);
			System.out.println("GST="+gst);
			finalprice +=gst;
			System.out.println("After GST Final price="+finalprice);
			
		}
		else if(price>5000)
		{
			System.out.println("5% Discount");
			double discount = price * 0.05;
			double finalprice = price-discount;
			System.out.println("Discount = "+discount);
			System.out.println("After Discount price="+finalprice);
			double gst=finalprice*0.12;
			finalprice +=gst;
			System.out.println("GST = "+gst);
			System.out.println("After GST Final Price = "+finalprice);
			
		}
		else if(price>2000)
		{
			System.out.println("2% Discount");
			double discount=price * 0.02;
			double finalprice=price-discount;
			System.out.println("Discount = "+discount);
			System.out.println("After Discount Final Price = "+finalprice);
			double gst=finalprice*0.05;
			System.out.println("GST ="+gst);
			finalprice +=gst;
			System.out.println("After GST Final Price ="+finalprice);
		}
		else
		{
			System.out.println("No Discount");
		}
		*/
		
		//***************Employee Example******
		
		System.out.println("Enter your Experience...");
		int exp = sc.nextInt();
		
		System.out.println("Enter your Salary...");
		double salary = sc.nextDouble();
		
		 if(exp > 5 && salary > 100000)
		{
			double bonus = 12000;
			System.out.println("You got Bonus RS = 12000");
			System.out.println("Before Bonus Salary= "+salary);
			salary +=bonus;
			System.out.println("Final Salary="+salary);	
		}
		  
		 else if(exp > 5 && salary > 70000)
		 {
			 double bonus =70000;
			 System.out.println("You got Bonus RS = 7000");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary += bonus;
			 System.out.println("Final Salary="+salary);
		 }
		 
		 else if(exp > 3 && salary > 50000)
		 {
			 double bonus = 50000;
			 System.out.println("You got Bonus RS = 50000");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary += bonus;
			 System.out.println("Final Salary ="+salary);
		 }
		 
		  else if(exp > 3 && salary > 30000)
		 {
			 double bonus = 30000;
			 System.out.println("You got Bonus RS = 30000");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary += bonus;
			 System.out.println("Final Salary ="+salary);
		 }
			 
		  else if(exp >1 && salary > 20000)
		 {
			 double bonus = 20000;
			 System.out.println("You got Bonus RS = 1500");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary +=bonus;
			 System.out.println("Final Salary ="+salary);
		 }
		 
		  else if(exp >1 && salary >12000)
		 {
			 double bonus = 1000;
			 System.out.println("You got Bonus RS=1000");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary +=bonus;
			 System.out.println("Final Salary ="+salary);
		 }
		 
		  else if(exp ==0 && salary >=7000)
		 {
			 double bonus = 200;
			 System.out.println("You got Bonus RS=200");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary +=bonus;
			 System.out.println("Final Salary ="+salary);
		 }
			
		  else
		 {
			 double bonus=0;
			 System.out.println("You got Bonus RS =0");
			 System.out.println("Before Bonus Salary ="+salary);
			 salary +=bonus;
			 System.out.println("Final Salary ="+salary);
		 }
			 
		// homework 30%= time2 video time = 50% => 5time practice  time = 80% 100%=2 year		
	}

}

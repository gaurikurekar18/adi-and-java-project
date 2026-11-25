package demo;
import java.util.Scanner;

public class NestediFoodDeliveryApplication {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Food Delivery App....");
		System.out.println("1.Pizza(450RS)");
		System.out.println("2.Vadapav(30RS)");
		System.out.println("3.Pavbhaji(120RS)");
		System.out.println("4.Burger(150RS)");
		
		String orderName="";
		double price=0;
		String customerName="";
		int qty=0;
		double totalPrice=0;
		double discount =0;
		double finalPrice=0;
		
		
		System.out.println("Which one you want to taste...(1-4)");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			orderName = "Pizza";
			price = 450;
			System.out.println("Enter Your Name...");
			customerName=sc.next();
			sc.nextLine();
			System.out.println("Enter Order Qty...");
			qty=sc.nextInt();
		totalPrice = price*qty;
		if(totalPrice>=1000)
		{
			//10%
			discount = totalPrice*0.10;
			finalPrice = totalPrice-discount;
		}
		else
		{
			System.out.println("No Discount...");
			finalPrice = totalPrice;
		}
			
		}
		else if(choice == 2)
		{
			orderName =" Vadapav";
			price=30;
			System.out.println("Enter your Name");
			customerName = sc.next();
			sc.nextLine();
			System.out.println("enter order Qty...");
			qty = sc.nextInt();
			totalPrice = price * qty;
			if(totalPrice>=1000)
			{
				//10%
				discount = totalPrice * 0.10;
				finalPrice = totalPrice;
			}
			
		}
		else if(choice == 3)
		{
			orderName = "PavBhaji";
			price=120;
			System.out.println("Enter your Name");
			customerName = sc.next();
			sc.nextLine();
			System.out.println("enter order Qty....");
			qty = sc.nextInt();
			totalPrice = price *qty;
			if(totalPrice>=1000)
			{
				//10%
				discount = totalPrice * 0.10;
				finalPrice = totalPrice;
			}
			
			
		}
		else if(choice == 4)
		{
			orderName = "Burger";
			price=150;
			System.out.println("Enter your Name");
			customerName = sc.next();
			sc.nextLine();
			System.out.println("enter order Qty....");
			qty = sc.nextInt();
			totalPrice = price * qty;
			if(totalPrice>=1000)
			{
				discount = totalPrice *0.10;
				finalPrice = totalPrice;
			}
			
		}
		else
		{
			System.out.println("Invalid choice....");
			return;//it will stop the execution of method
		}
		System.out.println("=========Order Placed Successfully========");
		System.out.println("\n=====Your Bill======\n");
		System.out.println("OrderName= "+orderName);
		System.out.println("CustomerName= "+customerName);
		System.out.println("Order Price ="+price);
		System.out.println("Qty = "+qty);
		System.out.println("Total Price = "+totalPrice);
		System.out.println("Discount = "+discount);
		System.out.println("Final Order Price = "+finalPrice);
		
		
	}
	

}

package looping;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[]args) {
		
/*	int i=1;
	while(i<=10)
	{
		System.out.println(i);
		i++;
	} */
		
		
/*	int i=1;
	while(i<=100)
	{
		System.out.println(i);
		i+=2;
	}  */
		
		
/*	int i=1;
	while(i<=100)
	{
		if(i%2!=0)
		{
			
		System.out.println(i);
	}
	i++;
	} */
		
	//infinite loop=unlimited time it will iterate
/*		boolean b= true;
	while(b) {
		System.out.println("Ram");
		b=false;
	}*/
		
		
	/*boolean b=true;
	int i=1;
	while(b)
	{
		System.out.println("Ram");
		i++;
		if(i==5)
		{
			b=false;
		}
	}*/
		
		
		Scanner sc=new Scanner(System.in);
	/*	boolean b=true;
		while(b)
		{
			
		System.out.println("Enter Username...");
		String username=sc.next();
		
			if(username.length()<5) {
				System.out.println("Invalid Username....please try again");
			}
			else
			{
				System.out.println("Valid Username...."+username);
				b=false;
			}
		 }*/
		
		
	/*	boolean b=true;
		int attempt=0;
		while(b)
		{
			System.out.println("Enter Username..");
			String username=sc.next();
			if(username.length()<5) {
				System.out.println("Invalid Username...please try again");
				attempt++;
				if(attempt==3)
				{
					System.out.println("Multiple incorrect attemtps");
					b=false;
				}
				
			}
			else {
				System.out.println("Valid Username..."+username);
				b=false;
			}
		}*/
		
		
		
		int attemtps=0;
		boolean x=true;
		double bankBalance=1000;
		while(x) {
			System.out.println("Enter your 4 digit pin...");
			int pin=sc.nextInt();
			if(pin == 1212) {
				System.out.println("PIN verified Sucess....🤞");
				boolean b =true;
						while(b)
				{
					System.out.println("1.Deposit");
					System.out.println("2.Withdraw");
					System.out.println("3.Check balance");
					System.out.println("4.Exit");
					
					System.out.println("enter your choice...");
					int choice=sc.nextInt();
					if(choice==1)
					{
						System.out.println("Enter Deposit Amount...");
						double deposit = sc.nextDouble();
						if(deposit >0) {
							bankBalance += deposit;
							System.out.println("deposite Success....Avaliable");
								}
						else
						{
							System.out.println("Invalid Amount....Avaliable Balance ="+bankBalance);
						}
						
					}
					else if(choice ==2)
					{
						System.out.println("enter Withdraw Amount...");
						double withdraw = sc.nextDouble();
						if(withdraw > 0)
						{
							if(withdraw <= bankBalance)
							{
								bankBalance -=withdraw;
								System.out.println("Withdraw Successfull....Avaliable balance = "+bankBalance);
								
							}
							else
							{
								System.out.println("Insufficient balance");
							}
						}
						else
						{
							System.out.println("Invalid amount...");
						}
					}
					else if(choice == 3)
					{
						System.out.println("your current bankBalance="+bankBalance);
					}
					else if(choice == 4)
					{
					b= false;
					System.out.println("thank you....");
					}
				}
				x = false;
			}
			else {
				System.out.println("Incorrect pin...try again...");
				attemtps +=1;
				if(attemtps == 3)
				{
					x=false;
					System.out.println("Due to Multiple incorrect attemtps....account blocked for 24 hours...");
				}
					
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	

}

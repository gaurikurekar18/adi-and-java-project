package demo;
import java.util.Scanner;
public class NestedIf{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age...");
		int age =sc.nextInt();
		if(age>=18 && age <=25)
		{
			System.out.println("you are Eligible for admission process...");
			System.out.println("Enter your Marks...");
			double marks= sc.nextDouble();
			//90>admission success
			if(marks>=90)
			{
				System.out.println("Enter your caste...");
				String caste = sc.next();
				if(caste.equals("OPEN"))
				{
					System.out.println("You have to pay 50K RS for admission...");
					System.out.println("Enter Your AdharCard Number...");
					String adharNumber =sc.next();
					if(adharNumber.length()==12)
					{
						System.out.println("Valid Adhar Number...");
						System.out.println("Now You can pay your Fees....");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("Choose your payment Gateway...");
						int choice = sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!! your Admission Success....");					
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulations!!! your Admission Success....");
							
						}
						else
						{
							System.out.println("Invalid Payment Gateway");
						}
						
					}
					else
					{
						System.out.println("Invalid Adhar Number..");
					}
				}
				else if(caste.equals("OBC"))
				{
					System.out.println("Enter Your AdharCard Number...");
					String adharNumber =sc.next();
					if(adharNumber.length()==12)
					{
						System.out.println("Valid Adhar Number...");
						System.out.println("Now You can pay your Fees....");
						System.out.println("you have to pay 30K RS...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("Choose your payment Gateway...");
						int choice = sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!! your Admission Success....");					
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulations!!! your Admission Success....");
							
						}
						else
						{
							System.out.println("Invalid Payment Gateway");
						}
						
					}
					else
					{
						System.out.println("Invalid Adhar Number..");
					}
				}
				else if(caste.equals("SC") || caste.equals("ST"))
				{
					System.out.println("Enter Your AdharCard Number...");
					String adharNumber =sc.next();
					if(adharNumber.length()==12)
					{
						System.out.println("Valid Adhar Number...");
						System.out.println("Now You can pay your Fees....");
						System.out.println("you have to pay 20K RS...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("Choose your payment Gateway...");
						int choice = sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!! your Admission Success....");					
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulations!!! your Admission Success....");
							
						}
						else
						{
							System.out.println("Invalid Payment Gateway");
						}
						
					}
					else
					{
						System.out.println("Invalid Adhar Number..");
					}
				}
				else
				{
					System.out.println("you have to pay 20K for admission");
				}
				
			}
			else if(marks < 90 && marks >= 70)
			{
			System.out.println("Enter Your Caste..");
			String caste=sc.next();
			if(caste.equals("OPEN"))
			{
				System.out.println("Enter your Adhar Number..");
				String adharNumber = sc.next();
				if(adharNumber.length()==12)
				{
					System.out.println("valid Adhar Number...");
					System.out.println("Now you can pay your Fees...");
					System.out.println("you have to pay 1LAKH Rs..");
					System.out.println("1 UPI");
					System.out.println("2.Cash");
					System.out.println("choose your payment gateway..");
					int choice= sc.nextInt();
					if(choice==1)
					{
						System.out.println("UPI payment successfully..");
						System.out.println("Congratulations!!! Your Admission");
					}
					else if(choice==2)
					{
						System.out.println("cash payment Successfully...");
						System.out.println("Congratulations!!!your Admission");
					}
					else
					{
						System.out.println("Invalid payment gateway..");
					}
				}
				else
				{
					System.out.println("Invalid Adhar Number..");
				}
			}
				
			else if(caste.equals("OBC"))
			{
				System.out.println("Enter Your AdharCard Number...");
				String adharNumber =sc.next();
				if(adharNumber.length()==12)
				{
					System.out.println("Valid Adhar Number...");
					System.out.println("Now You can pay your Fees....");
					System.out.println("you have to pay 50K RS...");
					System.out.println("1.UPI");
					System.out.println("2.Cash");
					System.out.println("Choose your payment Gateway...");
					int choice = sc.nextInt();
					if(choice ==1)
					{
						System.out.println("UPI payment Successfully...");
						System.out.println("Congratulations!!! your Admission Success....");					
					}
					else if(choice==2)
					{
						System.out.println("cash payment Successfully...");
						System.out.println("Congratulations!!! your Admission Success....");
						
					}
					else
					{
						System.out.println("Invalid Payment Gateway");
					}
					
				}
				else
				{
					System.out.println("Invalid Adhar Number..");
				}
			}
			else if(caste.equals("SC")|| caste.equals("ST"));
			{
				System.out.println("Enter your Adharcard number....");
				String adharNumber = sc.next();
				if(adharNumber.length()==12)
				{
					System.out.println("valid adhar number...");
					System.out.println("now you can pay your fees");
					System.out.println("you have to pay 20LAKH Rs...");
					System.out.println("1.UPI");
					System.out.println("2.Cash");
					System.out.println("choose your payment gateway...");
					int choice=sc.nextInt();
					if(choice ==1)
					{
						System.out.println("UPI payment Successfully...");
						System.out.println("Congratulations!!!! your Admission");
					}
					else if(choice==2)
					{
						System.out.println("cash payment Successfully...");
						System.out.println("Congratulation!!!your Admission");
					}
					else
					{
						System.out.println("Invalid Adhar Number");
					}
				}
			}
			}
			else if(marks <70 && marks >=50)
			{
				System.out.println("Enter Your Caste..");
				String caste=sc.next();
				if(caste.equals("OPEN"))
				{
					System.out.println("Enter your Adharcard number....");
					String adharNumber = sc.next();
					if(adharNumber.length()==12)
					{
						System.out.println("valid adhar number...");
						System.out.println("now you can pay your fees");
						System.out.println("you have to pay 2LAKH Rs...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("choose your payment gateway...");
						int choice=sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!!! your Admission");
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulation!!!your Admission");
						}
						else
						{
							System.out.println("Invalid Adhar Number");
						}
					}
				}
				
				else if(caste.equals("OBC"))
				{
					System.out.println("Enter your Adharcard number....");
					String adharNumber = sc.next();
					if(adharNumber.length()==12)
					{
						System.out.println("valid adhar number...");
						System.out.println("now you can pay your fees");
						System.out.println("you have to pay 70LAKH Rs...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("choose your payment gateway...");
						int choice=sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!!! your Admission");
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulation!!!your Admission");
						}
						else
						{
							System.out.println("Invalid Adhar Number");
						}
					}
				}
				else if(caste.equals("SC")|| caste.equals("ST"));
				{
					System.out.println("Enter your Adharcard number");
					String adharNumber=sc.next();
					if (adharNumber.length()==12)
					{
						System.out.println("valid adhar number...");
						System.out.println("now you can pay your fees");
						System.out.println("you have to pay 30LAKH Rs...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("choose your payment gateway...");
						int choice=sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!!! your Admission");
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulation!!!your Admission");
						}
						else
						{
							System.out.println("Invalid Adhar Number");
						}
					}
							
				}
			}
			else if(marks <50 && marks >=30)
			{
				System.out.println("Enter Your Caste..");
				String caste=sc.next();
				if(caste.equals("OPEN"))
				{
					System.out.println("Enter your Adhar Number...");
					String adharNumber= sc.next();
					if(adharNumber.length()==12)
					{
					System.out.println("valid adhar number...");	
					System.out.println("now you can pay your fees...");
					System.out.println("you have to pay 3LAKH RS");
					System.out.println("1.UPI");
					System.out.println("2.Cash");
					System.out.println("Choose your payment gateway...");
					int choice=sc.nextInt();
					if(choice==1)
					{
						System.out.println("UPI payment successfully...");
						System.out.println("Congratulations!!!! your admission");
					}
					else if(choice==2)
					{
						System.out.println("cash payment Successfully...");
						System.out.println("Congratulations!!! your Admission");
					}
					else
					{
						System.out.println("Invalid payment gateway...");
					}
					
					}
					else
					{
						System.out.println("Invalid payment Number");
					}
				}
				else if(caste.equals("OBC"))
				{
					System.out.println("Enter your Adharcard number");
					String adharNumber=sc.next();
					if (adharNumber.length()==12)
					{
						System.out.println("valid adhar number...");
						System.out.println("now you can pay your fees");
						System.out.println("you have to pay 90LAKH Rs...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("choose your payment gateway...");
						int choice=sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!!! your Admission");
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulation!!!your Admission");
						}
						else
						{
							System.out.println("Invalid Adhar Number");
						}
				}
				else if(caste.equals("SC")|| caste.equals("ST"));
				{
					System.out.println("Enter your Adharcard number");
				String	 Adharcardnumber = sc.next();
					if (adharNumber.length()==12)
					{
						System.out.println("valid adhar number...");
						System.out.println("now you can pay your fees");
						System.out.println("you have to pay 60LAKH Rs...");
						System.out.println("1.UPI");
						System.out.println("2.Cash");
						System.out.println("choose your payment gateway...");
						int choice=sc.nextInt();
						if(choice ==1)
						{
							System.out.println("UPI payment Successfully...");
							System.out.println("Congratulations!!!! your Admission");
						}
						else if(choice==2)
						{
							System.out.println("cash payment Successfully...");
							System.out.println("Congratulation!!!your Admission");
						}
						else
						{
							System.out.println("Invalid Adhar Number");
						}
				}
				
			else
			{
				System.out.println("Low Marks...Admission not Possible..");
			}
		}
				}
		else
		{
			System.out.println("You are not eligible for admission process ...due to age");
		}	
				
	}
		}		
	}
	}

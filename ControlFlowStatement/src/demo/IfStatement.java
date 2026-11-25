package demo;
import java.util.Scanner;
public class IfStatement {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter Username..");
//	int num =sc.nextInt();
	
//	String username=sc.next();
//	System.out.println("username:"+username);
//	System.out.println("Length = "+username.length());
	
	
//validation we can write using if
	String username=sc.next();
	if(username.length()<5)
	{
		System.out.println("Invalid Username..");
	}
	if(username.length()>=5)
	{
		System.out.println("valid Username:"+username);
	}
	System.out.println("enter the password..");
	
	String password=sc.next();
	if(password.length()<5)
	{
		System.out.println("Invalid password");
	}
	if(password.length()>=5)
	{
		System.out.println("valid password:"+username);
	}
	//to compare 2 string we have to use equal method of string
	//== =>we can use to compare 2 number
	//wrong way to check string is equal or not
	if(username.equals("aadiandjava") && password.equals("aadi1212"));
	{
		System.out.println("Login Sucess..");
	}
	if(!username.equals("aadiandjava"))
	{
		System.out.println("Incorrect Username...");
	}
	if(!password.equals("aadi1212"))
	{
		System.out.println("Incorrect Password...");
	}
	if(!username.equals("aadiandjava") || !password.equals("aadi1212"))
	{
		System.out.println("Login Failes...");
	}
	
	//System.out.println(username.equals("aadiandjava"));
	//System.out.println(password.equals("aadi1212"));
	
	
		//check number is divisible by 3
	
//	if(num%3==0)
//	{
//		System.out.println("Number is divisible");
		
//	}
//	if(num%3!=0)
//	{
//		System.out.println("Number is not divisible ...");
//		}
	
	
	
//	if(num%2==0)
//	{
//		System.out.println("Number is Divisible");
		
//	}
//	if(num%2!=0)
		
//	{
//		System.out.println("Number is not Divisible ");
//		}
	
	
	
//	if(num%3==0 && num%5==0);
//	{
//		System.out.println("Number is divisible by 3 or 5");
//	}

	
	
//    if(num%3==0|| num%5==0);
//	{
//		System.out.println("Number is divisible by 3 or 5");
//	}

	
	
//	if(num%3==0)
//	{
//		System.out.println("Number is divisible by 3");
//   }
//	if(num%5==0)
//	{
//		System.out.println("number is divisible by 5");
//	}
	
	
	
	
//	if(num%7==0)
//	{
//		System.out.println("number is divisible by 7");
//	}
//	if(num%7!=0)
//	{
//		System.out.println("number is not divisible by 7");
//	}
		
	
	
	
	//	int age=13;
	//	if(age >=18)
	//	{
	//		System.out.println("you are young..");//dependent
	//	}
		//13<18
	//	if(age<18)//true
	//	{
	//		System.out.println("you are child..");//dependent
	//	}
	//	System.out.println("aadiandjava");//independent	
		
		
	//	System.out.println("Enter Any Number..");
	//	Scanner s=new Scanner(System.in);
	//	int num=s.nextInt();//read value and assign to the value
	//	
	//	if(num>0)
	//	{
	//		System.out.println("Number is Positive");
	//	}
	//	if(num<0)
	//	{
	//		System.out.println("Number is Negative");
	//	}
	//	if(num==0)
	//	{
	//		System.out.println("Number is Zero..");
	//	}
		
		
	//	Scanner x=new Scanner(System.in);
	//	System.out.println("Enter a value...");
	//	int value=x.nextInt();
	//	System.out.println("enter the value="+value);
		
		
	//	System.out.println("Enter Float Value:");
	//	float value=x.nextFloat();
	//	System.out.println("Float Value:"+value);
		
		
	//	System.out.println("Enter Byte Value:");
	//	Byte value=x.nextByte();
	//	System.out.println("Byte Value:"+value);
		
		
	//	System.out.println("Enter Short Value:");
	//	Short value=x.nextShort();
	//	System.out.println("Short Value:"+value);
		
		
	//	System.out.println("Enter Long Value:");
	//	Long value=x.nextLong();
	//	System.out.println("Long Value:"+value);
		
		
	//	System.out.println("Enter Double Value:");
	//	Double value=x.nextDouble();
	//	System.out.println("Double Value:"+value);
		
		
	//	System.out.println("Enter String Value:");
	//	String value=x.next();
	//	System.out.println("String Value:"+value);
		
		
	//	System.out.println("Enter String Value:");
	//	String value=x.nextLine();
	 //   System.out.println("String Value:"+value);
		
		
	//	System.out.println("Enter Boolean value:");
	//	boolean value=x.nextBoolean();
	//	System.out.println("Boolean Value:"+value);
		
		
	//	System.out.println("Enter charecter value:");
	//	char value=x.next().charAt(0);
	//	System.out.println("char Value:"+value);
		//10 time practice
		
		
	//****HOME WORK*****
	
		
	}
	

}

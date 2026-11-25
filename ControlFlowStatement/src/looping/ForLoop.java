package looping;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[]args ) {
		
	Scanner sc=new Scanner(System.in);
	
//	for(int i=1;i<=10;i++)
//	{
//		System.out.println("Hello");
//	}
	
//	1<10=infinite
//	if you writing condition make sure that increment must be there 
//	for(int i=1,j=1;i<=10;i++)
//	{
//		System.out.println("j");
//	}
	
	
// jyachi condition tyacha increment	
//	for(int i=1,j=1;j<=10;j++)
//	{
//		System.out.println(j);
//	}
	
	
//	*****INTERVIEW QU**********
//	we can intialize =>any number of variable inside for loop
	// condition is only one condtion
//	for(int i=1,j=1,k=1;i<=10;i++,k++,j++)
//	{
//		System.out.println(i+" "+j+" ");
//	}
	
	
	//*****WRONG STATEMENT******
//	for(int i=1;i<=10;i++);//end statement;
//	{
//		System.out.println("ram");
//	}
	
	
//	   for(int i=1;i<=10;i++)
//	   System.out.println("ram");//this is only of for loop
//	System.out.println("Shyam");//not part of for loop
//	if we are having only one statement after for loop then curly bracet is not required
//  only one line after for loop will be consider inside for 
	
	
//	for(int i=1 ; i<=10 ; i++)//end statement;
//	{
//		System.out.println("Ram")//this is only part of for loop
//		System.out.println("Shyam");
//	} //no 
	
	
//	for(int i=1;i<=10;i++);System.out.println("hello");

	
//	***********INTERVIEW QU**********
//	 ******kay hot curly braket nhi dil tar********
//	 ans:-if we having only one statement after if then curly bracket
//	only one line after if will be consider inside if	
//	int num = 111;
//	if(num<200)
//		System.out.println("hello ram");//depend on condition
//	System.out.println("hello aadi");//not depend on condition
		
	
	//1+2+3+4+5+6+7+8+9+10 =>55
//	int sum=0;
//	for(int i=1;i<=10000;i++)
//	{
//		sum=sum+i;
//	}
//	System.out.println("sum="+sum);
	
	
	
	//2+4+6+8+10
//	int sum=0;
//	for(int i=1;i<=100;i++)
//	{
//		if(i%2==0)
//			sum=sum+i;
//	}
//	System.out.println("sum="+sum);
	
	
	//1+3+5+7+9
//	int sum=0;
//	for(int i=1;i<=10;i++)
//	{
//		if(i%2 !=0)
//		{
//			sum=sum + i;
//		}
//	}
//	System.out.println("sum="+sum);
	
	

	//1*2*3*4*5*6*7*8*9*10
	//integer=to store very very large class
//	int multiply = 1;
//	for(int i=1;i<=10;i++)
//	{
//		multiply = multiply * i;
//	}
//	System.out.println("sum ="+ multiply);
	
	
	//	System.out.println("enter any number...");
	//Multiplication Table
//	int num = sc.nextInt();
	
//	if(num<=0)
//	{
//		System.out.println("Invalid Number...");
//	}
//	else {
//	for(int i=1;i<=10;i++)
//	{
//		System.out.println(num+" * "+i+" = "+num * i); //10*1,10*2,10*3,10*4....10*10
		
//	}
//	}	
		
		
	//	for(int i=1;i<=1000000;i++)
	//	{
	//		System.out.println("Ram: "+i);
	//	}
		
		
		//20 to 30
	//	for(int i=20;i<=30;i++)
	//	{
	//		System.out.println(i);
	//	}
	/*	System.out.println("====================");
		//30 to 20
		for(int i=30;i>=20;i--)
		{
			System.out.println(i);
		}
		*/
		
		
		
	/*	for(int i=1;i<=10;i++)//increasing i value by 1
		{
			System.out.println(i);
		}*/
		
		
		
	//	for(int i=1;i<=10;i+=2)//increasing i value by 1
	//	{
	//		System.out.println(i);
	//	}
		
		
		//EVEN NUMBER 1 to 100
	//	for(int i=2;i<=100;i+=2)
	//	{
	//		System.out.println(i);
	//	}
		
		//ODD NUMBER i to 100
	//	for(int i=1;i<=100;i+=2)//increasing i value by 1
	//	{
	//		System.out.println(i);
	//	}
		
		
	//	for(int i=5;i<=50;i+=5)//increasing i value by 1
	//	{
	//		System.out.println(i);
	//	}
		
		//*******Write a for loop way***********
    //	    WAY1( barobar)	
	//	for(int i=1;i<=10;i++)
	//	{
	//		System.out.println(i);
	//	}
		
		
	//    WAY2	(barobar)
	//	int i=1;//intialization     //interview qu ki as pan for loop la lihata yete ka
	//	for(;i<=10;)//condition
	//	{
	//		System.out.println(i);
	//		i++;//increment
	//	}
		
		
	//	*******WRONG CODE BUT INTERVIEW ASK***********
		//Infinite for loop=>it will not stop
	//	for(;;)
	//	{
	//		System.out.println("Ram");
	//	}
		
		
		//infinite for loop=>it will not stop
	//	for(int i=1;;)
	//	{
	//		System.out.println("ram");
	//	}
		
	//  Infinite for loop=>it will not stop
	//	for(int i=1;i<=10;)
	//	{
	//		System.out.println("ram");
	//	}
	
		
	//	Infinite for loop=>it will not stop
	//		for(int i=1;;i++)
	//		{
	//			System.out.println("ram");
	//		}
		
	//    Number datatype are recommended to use in for loop
	//	for(int i=1;i<=10;i++)
	//	{
	//		if(true) {
	//			System.out.println("hello");
	//		}
	//		System.out.println("gauri");
	//	}
		
   //	      for(int i=1;i<=100;i++)
   //	     {
   //		 if(1%2!=0) {
   //			System.out.println(i);
   //		}
   //	}

		
   //		for(int i=1;i<=100;i++)
   //		{
   //			if(1%2==1) {
   //				System.out.println(i);
   //			}
   //		}
		
	//	int count=0;
	//	for(int i=1;i<=100;i++)
	//	{
	//		if(i%3==0)
	//		{
	//			System.out.println(i);
	//			count++;
	//		}
	//	}
	//	System.out.println("count of numbers which are divisible by 3:"+count);
		
		
	//	int count=0;
	//	for(int i=1;i<=100;i++)
	//	{
	//		if(i%3==0 && i%15==0) {
	//			System.out.println(i);
	//			count++;
	//		}
	//	}
	//	System.out.println("count of number which are divisible by 3 and 5 :"+count);
		
		
		//divisible by 7 and 11
	//	int count=0;
	//	for(int i=1;i<=100;i++)
	//	{
	//		if(i%7==0 && i%11==0) {
	//			System.out.println(i);
	//			count++;
	//		}
	//	}
	//	System.out.println("count of number which are divisible by 3 and 5 :"+count);
		
	
		
	//	int count=0;
	//	for(int i=1;i<=100000;i++)
	//	{
	//		if(i%3==0 && i%15==0) {
	//			System.out.println(i);
	//			count++;
	//		}
	//	}
	//	System.out.println("count of number which are divisible by 3 and 5 :"+count);
	//	
		
		//homework 170 line = *3 =>500 line
		
		
	}

}

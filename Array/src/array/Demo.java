package array;
import java .util.Scanner;
public class Demo {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		//SINGLE DIMENSIONAL=>[]
		//TWO DIMENTIONAL=>[][]
		//Static array
	/*	int arr1[]=new int[3];
		arr1[0]=111;
		arr1[1]=222;
		arr1[2]=333;
	*/	
		//2 number addition in 3rd number stored
		//Dynamic
		//JVM will allocate the size /memory to below
	/*	int arr1[]= {10,20,30,40};
		int arr2[]= {100,200,300,400};
		      //   110   220   330     440 
		int arr3[]= new int[4];
		for(int i = 0;i < arr1.length;i++) {
			arr3[i]=arr1[i]+arr2[i];
			//110      //10    +  100
			
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
		*/
		
		//ALL SINGLE DIMENSIONAL
	/*	int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter Array Element at indexing:"+i);
			number[i]=sc.nextInt();	
		}
		System.out.println("=====================");
		int sum=0;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2!=0) {
				sum=sum+number[i];
			}
		}
		System.out.println("Sum="+sum);
	*/	
		
		
		//Addition program
	/*	int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter Array Element at indexing:"+i);
			number[i]=sc.nextInt();
		}
		System.out.println("===================");
		int sum=0;
		for(int i=0;i<number.length;i++) {
			sum=sum+number[i];
		}
		System.out.println("sum="+sum);
		*/
		
	
		
	/*	System.out.println("Enter Array Size...");
		int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter Array Element at indexing:"+i);
			number[i]=sc.nextInt();
		}
		System.out.println("====================");
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0) {     //EVEN NUMBER checking
				System.out.println(number[i]);	
			}
			
		}*/
		
		
			
		
	/*	System.out.println("Enter Array Size....");
		int size=sc.nextInt();
		int number[]=new int[size];
		for(int i=0;i < number.length;i++)
		{
		 number[i] =i+100;//RANDOM QU5
		}
		System.out.println("==============");
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Array element at indexing:"+i+"="+number[i]);
		}
		
		*/
		
		
		
	/*	System.out.println("Enter Array Size..");
		int size=sc.nextInt();
		int number[]=new int [size];
		for(int i=0;i<number.length;i++)
		{
			int num =(int)(Math.random()*100);
			number[i]=num;
		}
		System.out.println("=====================");
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Enter Array Element at indexing :"+i+"="+number[i]);
		}
		
		*/
		
		
			
//	String cities[]= new String[5];//definition
	//initialization
	//10 cities
/*	cities[0]="pune";
	cities[1]="Mumbai";
	cities[2]="Delhi";*/
/*	Scanner sc=new Scanner(System.in);
	for(int i=0;i<=5;i++)
	{
		System.out.println("enter array element for indexing="+i);
		cities[i]=sc.nextLine();
	}
	System.out.println("=================");
	for(int i=0;i<5;i++)
	{
		System.out.println("array elsement at indexing: "+i+" : "+cities[i]);
	}*/
//	
//	System.out.println(cities[0]);
//	System.out.println(cities[1]);
//	System.out.println(cities[2]);
	
		
		
		//size-1=indexing
	/*	int[] marks=new int[5];
		marks[0]=124;
		marks[1]=343;
		marks[2]=98;
		marks[3]=78;
		marks[4]=67;
	//	marks[5]=44;//wrong this position not avilable in memory ArrayIndexOutofBoundException
		System.out.println("marks[0]");
		System.out.println("marks[1]");
		System.out.println("marks[2]");
		System.out.println("marks[3]");
		System.out.println("marks[4]");
		System.out.println("marks[5]");//ArrayIndexOutBoundsException
		
	//	System.out.println(marks[7]);*/
		
		
		
	
	}

}

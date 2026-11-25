package Exception;

public class Demo {
	
	void division(int i,int j)
	{
	//	try
	//	{
	//		int div=i/j;
	//		System.out.println("Division="+div);	
	//	}
	//	catch(ArithmeticException e)
	//	{
	//		System.out.println(e.getMessage());
	//	}
		
		int div =i/j;
		System.out.println("Division="+div);
	}
	
	
	public static void main(String[] args)
	{
	//	Demo d=new Demo();
	//	try
	//	{
	//		d.division(10, 0);
	//		}
	//	catch(ArithmeticException e)
	//	{
	//	System.out.println(e.getMessage());	
	//	}
				
		
		
		
	//	String name="aadiandjava";
	//	name=null;
	//	try
	//	{
	//		System.out.println(name.length());
	//	}
	//	catch(NullPointerException n)
	//	{
	//		System.out.println(n.getMessage());
	//	}
		
		
		
	//	String name="aadiandjava";
	//	int arr[]= {1,2,3,4,5,6,7}

	//	try
	//	{
	//		System.out.println(name.length());
	//		System.out.println(arr[10]);
	//	}
	////	catch(NullPointerException n)
	//	{
	//		System.out.println(n.getMessage());
	//	}
	//	catch(ArrayIndexOutOfBoundsException i)
	//	{
	//		System.out.println(i.getMessage());
	//	}
		
	//	**********OR*********
		
		String name="aadiandjava";
		int arr[]= {1,2,3,4,5,6,7}
;
		try
		{
			System.out.println(name.length());
			System.out.println(arr[10]);
		}
		catch(NullPointerException  | ArrayIndexOutOfBoundsException n)
		{
			System.out.println(n.getMessage());
		}
			
		
		
		
	//	System.out.println("hello");
	//	System.out.println(10 + 10);
	//	System.out.println("aadiandjava");
	//	try
	//	{
	//		System.out.println(10/0);
	//	}
	//	catch(ArithmeticException a)
	//	{
	//		System.out.println("dont divide with zero..");//developer message
	//		OR
	//		System.out.println(a.getMessage());//system dfault message
	//		OR
	//		a.printStackTrace();
	//	}
		
		
		
		
	//	int arr[]= {10,20,30,40,50};
	//	try
	//	{
	//		System.out.println(arr[10]);
	//	}
	//	catch(ArrayIndexOutOfBoundsException a)
	//	{
	//		System.out.println(a.getMessage());
	//	}
	//	
	//	System.out.println("hello");
	//	
	//	System.out.println("hello");
	//	System.out.println(10 + 10);
	//	System.out.println("aadiandjava");
			}

}

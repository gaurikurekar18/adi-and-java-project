package demo;

public class UnaryOperator {
	public static void main(String[]args)
	{
	//	int x=-100;
		//math rule + - =>-
		//math rule - - =>+
		//math rule + - =>-
		//math rule + + =>+
	//	System.out.println(+x);
	//	System.out.println(-x);
		
		
//	int x=100;
//	x++;  //value increasing after variable
//	++x;  //value increasing first...
//	System.out.println(x++);  //print x first 100
//	System.out.println(x); //101
	
	
//	System.out.println(++x);//101
//	System.out.println(x--);
//	System.out.println(x);
	
	
//	System.out.println(--x);//99
	
	
	int x=10, y=20, z=30;
	//int result=++x + ++y ++z;//11+21+31
	int result= ++x + ++y - ++z;//11+21-31
	System.out.println(result);
	
	
	
	
	
	
	
	
		
	}

}

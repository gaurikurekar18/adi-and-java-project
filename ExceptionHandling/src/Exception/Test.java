package Exception;
import java.io.File;
import java.io.IOException;
public class Test {
	
//	int i=0;
//	void m1()
//	{
//		System.out.println("m1");
//		m2();
//	}
//	
//	void m2()
//	{
//	System.out.println("m2");
//	i++;
//	while(i<=10) {
//		m1();
//	}
//}
	
	
	
	public static void main(String[] args)
	{
		
	//	Test t=new Test();
	//	t.m1();
		
	// int a=10,b=0;
	//System.out.println(a/b);//cpmpile ignore this line...sucessfully compiled
	
	//at jvm this code fail..cause runtime problem-runtime exception
	
	//System.out.println("hello");
	
	int a=10;//syntax error 
   File file=new File("ram.txt");
   try {
	file.createNewFile();//compile time exception//not ignoreing compiler catched this problem
   }
   catch(IOException i)
   {
	   System.out.println(i.getMessage());
   }
	System.out.println("file created....");	
		
		
		
		
		
	}
	
}

package variable;

public class Test {
	public static void main(String[]arg)
	{
		byte b=45;//1 byte -128 to 127
		System.out.println(b);
		
		short s=1000;//  2 byte -32768 to 32767
		System.out.println(s);
		
		int i=10000;// 4 byte -2,147,483,648 to 2,147,483,647																																																																															
		System.out.println(i);
		
		//where we cross the int datatype range we have to write L at the end
		long l=100000;// 8 byte 
		System.out.println(l);
		
		float f=5.5f;// 4 byte
		System.out.println(f);
		
		//salary,price,discount
		double d=3440.44;// 8 byte
		System.out.println(d);
		
		char c='r';
		System.out.println(c);
		
		char cc=66;//ASCII value=American Standard code for information interchange
		System.out.println(cc);
		
		boolean x =true;//islogin true
		System.out.println(x);
		
		int xx=23;
		String num="784";//22 byte
		
		System.out.println(num + 100);
		
		String name="gauri";
		System.out.println(name);
		
		String address="nagpur";
		System.out.println(address);
		
		String dob = "11-12-2000";
		System.out.println(dob);
		
		String dep="IT";
		System.out.println(dep);
		
	}

}

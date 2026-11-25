package typecasting;

public class Demo {
	public static void main(String[]args)

	{
	//datatype primitive	
//	boolean b = true;
	
	//int i =(int)b;
	//boolean value we can not convert implicitly or explicit
	//boolean we can convert into string type value....
	
// 1. String s=String .valueOf(b);//boolean converted into string
//	   System.out.println(s);
	
	//wrapper Class - collection
 //   2.  String s= Boolean.toString(b);
  //    System.out.println(s);
	
	//char is v.v.important
		// ASCII American standerd code for information interchange
//	char c ='A';//2
//	byte b = c;//1 explicit
//  short s = c;//2 explicit
	
//	int i=c; //4 implicit
//	System.out.println(i);
	
//	long l=c;//implicit
//	System.out.println(l);
	
//	float f=c;//implicit
//	System.out.println(f);
	
// double d=c;//implicit
//	System.out.println(d);
	
	//reverse case
		//all number type of datatype value to convert
//	byte b=65;//1byte
//	char c = (char) b;//2 byte//explicit
//	System.out.println(c);
		
//		short s = 122;
//		char c = (char)s;
//		System.out.println(c);
		
		
//	int i =97;//4 byte
//	char c=(char)i;///explicit
//	System.out.println(c);
		
//		long l=65;
//		char c=(char)l;
//		System.out.println(c);////explicit
		
	
	//	float f=65;
	//	char c=(char)f;
	//	System.out.println(c);
		
		
	//	double d=1;//8 doble is big
	//	System.out.println(d);
		
	//	int num=111;
	//	String.valueOf(num);
	//	System.out.println(s);
		
		
	//	String s= Integer.toString(num);
	//	System.out.println(s);
		
//	long mobileNo = 9022154058L;//explicit typecasting
//	int i = (int )mobileNo;
//	System.out.println("int value: "+i);
	
	
//	short s=(short) mobileNo;
//	System.out.println("short value:"+s);
	
//	byte b=(byte)mobileNo;
//	System.out.println("byte value:"+b);
	
	
//	double d=45.45;
//	float f=(float)d;//recommeded data
//	long l=(long)d;
//	int i=(int)d;
//	System.out.println(f);
//	System.out.println(l);//45 loss
//	System.out.println(i);//loss
			
		
//	int age = 35;
//	double d=age;
//	System.out.println(d);
		
//	long mobilenumber = 8262085189L;
//	double d = mobilenumber;
//	System.out.println(d); // 
		
	//	long bankAccountnumber=234526778528L;
	//	double d = bankAccountnumber;
	//	System.out.println(d);
			
		
	//	byte b=10;
		
	//	short s=b;//byte data converted into int type of data
	//	int i=b;
	//	long l=b;
		
	//	System.out.println(s);//10
	//	System.out.println(i);//10
	//	System.out.println(l);//10
		
	//	int x = 111;
	//	long l = x;
	//	System.out.println(l);
		
	//	short s = 111;
	//	int l=s;
		
	//	byte b=12;// 1 byte
	//	float f=b; //4 byte
	//	System.out.println(f);
		
	//	short s=111; //2 byte
	//	float f=s;
	//	System.out.println(f);
		
		///exceptional case
	//	int i =111; //4 byte
	//	float f=i; //  4 float is big
	//	System.out.println(f);
		
		///exception case
	//	long l=111;//8 byte
	//	float f=l; //4 byte float is big
	//	System.out.println(f);
		
	//	float f = 34.34f;
	//	double d=f;
	//	System.out.println(d);
		
		
	//  byte b=111;//1
	//	double d=b;//8
	//	System.out.println(d);
		
	//	short s=111;//2
	//	double d=s;//8
	//	System.out.println(d);
		
	//	int i=111;//4
	//	double d=i;//8
	//	System.out.println(d);
		
		
	//	long l=111;//8
	//	double d=1;//8 double is big
	//	System.out.println(d);
		
		
		//167*3x=>practice homework
			
				
	}

}

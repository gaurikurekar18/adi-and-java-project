package com.inheritance;

public class WhatsappUser extends User {
	//this is not recommended
//	WhatsappUser()
//	{
//		username="aadi";
//		password="1212";
//		address="pune";
//	}
	//this is recommended
//	WhatsappUser(String username,String password,String address)
//	{
//		super.username=username;
//		super.password=password;
//		super.address=address;
//	}
	
//	WhatsappUser()
//	{
//		System.out.println("WhatsappUser");
//	}
	
	//not good Approach
//	WhatsappUser()
//	{
//		super("aadi","1212","pune");
//		System.out.println("WhatsappUser construction");
//	}
	
	
	//best approach
	WhatsappUser(String username,String password,String address)
	{
		super(username,password,address);
	}
	
	
	
	public static void main(String[]args)
	{
		
//	WhatsappUser w = new WhatsappUser("aadi","1213","pune");
		
//		w.show();
//		System.out.println();
//		WhatsappUser w1 = new WhatsappUser("Ram","5678","nashik");
//		w1.show();
		
//		System.out.println();
		
//	WhatsappUser w2=new WhatsappUser("aakash","7890","delhi");
//		w2.show();
		
	//	User user=new User();
		
		WhatsappUser w = new WhatsappUser("aadi","1212","pune");
		w.show();
		
		System.out.println();
		WhatsappUser w1=new WhatsappUser("Ram","3456","nashik");
		w1.show();
		
		
		System.out.println();
		WhatsappUser w2=new WhatsappUser("trupti","9878","delhi");
		w2.show();
	}

}

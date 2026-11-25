package polymorphism.RunTime;

public class WhatsappUser extends User {
	
	@Override//Annotation
	void show(int i)
	{
		super.show(12);
		System.out.println("Show Whatsapp user");
		System.out.println("WhatssappNumber:9675987654");
		System.out.println("Chat Message : 1 Lakh");
	}
public static void main(String[] args)
{
	WhatsappUser w=new WhatsappUser();
	w.show(23);
}
}

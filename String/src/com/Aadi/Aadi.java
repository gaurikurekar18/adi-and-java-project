package com.Aadi;

public class Aadi {
	
	public static void main(String[]args)
	{
		String city="pune";
		System.out.println("before concat="+city);
		
		String newCity=city.concat("Mumbai");//puneMumbai
		//Immutable /unchangeble
		
		System.out.println("After contact="+city);
		
		System.out.println("using new obj="+newCity);//puneMumbai
	}

}

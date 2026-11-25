package com.String;

public class Demo {
	public static void main(String[]args)
	{
	//	String username="Aadiandjava";
		
		
		//*************ALL STRING METHOD***************
		
	//	String city="pune";
	//	System.out.println(username.concat("city"));
		
	//  System.out.println(username.repeat(2));
		
		
	//	System.out.println(username.compareTo("Ram"));
		
		
		
		
		
		
		//******************Ignore**************
	/*	if(username.compareTo("Aaa")==0)
		{
			System.out.println("Both are equals");
		}
		else if(username.compareTo("Aaa")>0)
		{
			System.out.println("First string is greater");	
		}
		else
		{
			System.out.println("Second string is greater");
		}*/
		
		String username="Aadiandjava";
		char[]c=username.toLowerCase().toCharArray();
		int count=0;
		int cCount=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' ||c[i]=='e'|| c[i]=='i'||c[i]=='o'||c[i]=='u')
			{
			count++;
			}
			else
			{
				cCount++;
			}
		}
		System.out.println("Total Vowel in string="+count);
		System.out.println("Total Consonent in String="+cCount);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	System.out.println(username.trim().length());
		
	//System.out.println(username.trim());
		
		
	//    String newUsername=username.replace(username, "Aadiandpython");
	 //   System.out.println(username);
	//   System.out.println(newUsername);
	//	System.out.println(username.replace(username,"AadiandPython"));
		
		
	//	String password="1212";
	//	System.out.println(username.concat("11112"));
		
	//	System.out.println(username.contains("va"));
		
	//	System.out.println(username.isBlank());
		
	//	System.out.println(username.isEmpty());
		
	//	System.out.println(username.toUpperCase());
		
	//	System.out.println(username.toLowerCase());
		
	//	System.out.println(username.startsWith("A"));
		
	//	System.out.println(username.endsWith("va"));
		
		
		
	//	System.out.println(username.length());
		
	//	System.out.println(username.equals("Aadi"));
		
	//	System.out.println(username.equalsIgnoreCase("AADIANDJAVA"));
		
	//	System.out.println(username.charAt(0));
		
	//	System.out.println(username.indexOf('a'));
		
	//	System.out.println(username.lastIndexOf('a'));
		
		
		
	}

}

package com.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	public static void main(String[] args)
	{
		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<Integer,String>();
		lmap.put(101,"ram");
		lmap.put(102,"Shyam");
		lmap.put(103,"hari");
		lmap.put(104,"rohit");
	
		System.out.println(lmap);
		

		for(Map.Entry<Integer,String> e : lmap.entrySet())
		{
		    System.out.println(e.getKey() + " " + e.getValue());
		}
				
		
		
		
	}

}

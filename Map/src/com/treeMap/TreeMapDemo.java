package com.treeMap;

import java.util.TreeMap;
import java.util.Map;
public class TreeMapDemo {
	
	public static void main(String[] args)
	{
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(45,"Ram");
		map.put(76,"Shyam");
		map.put(24,"hari");
		map.put(12,"Rohit");
	//	tr.put(56,null);
	//	tr.put(76,null);
	//	tr.put(null,"Aakash");
		System.out.println(map);
		
		
		for(Map.Entry<Integer,String> e : map.entrySet())
		{
		    System.out.println(e.getKey() + " " + e.getValue());
		}
				
	}

}

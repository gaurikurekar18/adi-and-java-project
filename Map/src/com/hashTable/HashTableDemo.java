package com.hashTable;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
public class HashTableDemo {
	
	public static void main(String[]args)
	{
		Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
		ht.put(1,"Amit");
		ht.put(2,"Rahul");
		ht.put(3,"Priya");
		
		Iterator<Map.Entry<Integer,String>>it=ht.entrySet().iterator();
		
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

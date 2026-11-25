package com.hashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapDemo {
	
	public static void main(String[] args)
	{
	//	HashMap<Integer, String> map=new HashMap<Integer,String>();
	//	map.put(101, "Ram");//1st entry
	//	map.put(45,"Shyam");
	//	map.put(89,"hari");
	//	map.put(34, "Aakash");
	//	map.put(12, "Achal");
	//	System.out.println(map);
		
		HashMap<String,String> gk=new HashMap<String,String>();
		gk.put("purvaj","Cricketer");
		gk.put("aadi","youtuber");
		gk.put("gauri","Developer");
		gk.put("Aakash","Criketer");
		gk.put("Aadi","Tester");
		gk.put("Rohit",null);//value unlimited null and null key is dublikit chalte but one time
		gk.put("Ravi", null);
		gk.put(null, "Java trainer");//data loss
		
	//	System.out.println(gk.size());
	//	System.out.println(gk.keySet());
	//	System.out.println(gk.values());
	//	System.out.println(gk.containsKey("Ram"));
	//	System.out.println(gk.containsValue("Tester"));
	//	System.out.println(gk.isEmpty());
	//	gk.clear();
	//	System.out.println(gk.remove("Ravi"));
	//	System.out.println(gk.get("purvaj"));
		System.out.println(gk.replace("gauri","Java developer"));
		
		
		System.out.println();
		//***************FOR EACH LOOP**************
		Set<Entry<String, String>> entrySet = gk.entrySet();//alt+shift+L
		//to iterate map use entry set method with for each loop
		for(Entry<String,String>ss:entrySet)
		{
			System.out.println(ss.getKey()+"="+ss.getValue());
		}
		
		
		
		//value doublekey deu shakto
		//but key doublicate nhi deu shakt
		//System.out.println(gk);
		
		
	//	HashMap<String,Boolean> pk=new HashMap<String,Boolean>();
	//	pk.put("purvaj",true);
	//	pk.put("aadi",true);
	//	pk.put("gauri",true);
	//	pk.put("Aakash",false);
	//	
	//	System.out.println(pk);
		
		
	}
	

}

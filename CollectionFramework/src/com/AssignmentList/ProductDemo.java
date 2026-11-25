package com.AssignmentList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ProductDemo {
	
	public static void main(String[] args)
	{
		ArrayList<Product>products=new ArrayList<Product>();
		
		products.add(new Product("Laptop",50000));
		products.add(new Product("Mobile",20000));
		products.add(new Product("keyboard",1000));
		products.add(new Product("Mouse",500));
		products.add(new Product("Monitor",10000));
		products.add(new Product("Printer",8000));
		products.add(new Product("Charger",200));
		products.add(new Product("Pendrive",800));
		products.add(new Product("HardDisk",500));
		products.add(new Product("SmartWatch",2000));
		products.add(new Product("Router",2500));
		products.add(new Product("Scanner",7000));
		products.add(new Product("Projector",25000));
		products.add(new Product("USB cable",300));
		products.add(new Product("Camera",30000));
		products.add(new Product("Speaker",3000));
		products.add(new Product("Earbuds",1500));
		products.add(new Product("Bluetooth speaker",2500));
		products.add(new Product("SmartTv",350000));
		products.add(new Product("PowerAdapter",1000));
		
	//	FOR LOOP
	/*	System.out.println("for loop");
		for(int i=0;i<products.size();i++)
		{
			System.out.println(products.get(i).name);
			System.out.println(products.get(i).price);
			System.out.println("====================");
		}
		*/
		
		
		
		//FOR EACH LOOP
	/*	System.out.println("For each loop");
		for(Product p:products)
		{
			System.out.println(p.name);
			System.out.println(p.price);
			System.out.println("==================");
		}
		*/
		
		
		
		
		//ITERATOR
	/*	System.out.println("Iterator");
		Iterator<Product>itr= products.iterator();
		while(itr.hasNext())
		{
			Product p=itr.next();
			System.out.println(p.name);
			System.out.println(p.price);
			System.out.println("================");
			}
		*/
		
		
		
		//LISTITERATOR
		System.out.println("Listiterator");
		ListIterator<Product>ltr=products.listIterator();
		while(ltr.hasNext());
		{
			Product p=ltr.next();
			System.out.println(p.name);
			System.out.println(p.price);
		}
		
	}

}

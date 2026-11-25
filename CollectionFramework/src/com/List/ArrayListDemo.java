package com.List;
import java.util.ArrayList;

import java.lang.NullPointerException;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListDemo {

		public static void main(String[]args)
		{
			
	//	ArrayList<Integer> al=new ArrayList<Integer>();
	//	al.add(111);
	//	al.add(34);
	//	al.add(22);
	//	al.add(-324);
	//	al.add(67);
	//	al.add(222);
	//	al.add(null);
	//	al.add(null);
	//	al.add(123);
	//	al.add(465);	
	//	**************11 ALL METHODS*****************
	//    when we add 11th element in arraylist it increase his size 10/2 =5 10+5=15
	//	System.out.println(al.get(15));//return value at given index
	//	System.out.println(al.contains(2222));//check element is present or not
	//	System.out.println(al.indexOf(null));//it will return first index
	//	System.out.println(al.isEmpty());//check arraylist is empty
	//	System.out.println(al.remove(0));//provide idex to remove
	//	System.out.println(al.getFirst());//first element
	//	System.out.println(al.getLast());//last element
	//	System.out.println(al.set(3, 100));//set use in updation
	//	System.out.println(al.set(7,400));//update
	//	System.out.println(al.);
	//	al.clear();//remove all elements....
	//	System.out.println(al);
	//	System.out.println(al.size());
			
		
			
			
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(111);
		al.add(34);
		al.add(22);
		al.add(-324);
		al.add(67);
		al.add(222);
		al.add(null);
		al.add(null);
		al.add(123);
        al.add(465);	
        
    // ***********for loop**************
    //   for(int i=0;i<al.size();i++)
    //  {
    //	   try {
    //	   if(al.get(i)%2!=0) {
    //	   System.out.println(al.get(i));
    //	   }
    //	   }catch(NullPointerException n) {
    //		   System.out.println(n.getMessage());
    //	   }
    //  }
        
        
        
        
    //   *********** for each loop***********
    //    for(Integer i:al)
   //    {
   //   	System.out.println(i);
   //      }
			
		
		
	//1)iterator can iterator whole collection list ,set,Queue
    //2)iteration can iterate data in forward direction    
	//	 ************Iterator***********
    //    Iterator<Integer> itr = al.iterator();
    //    while(itr.hasNext())
    //    {
    //    	System.out.println(itr.next());
    //    }		
        
        
		
    // 1)Listerator can iteratory only list impliment class..
    //    arraylist,linklist,vector,stack
    //    ALT + SHIFT + L=to extract return value
    //  2)It can iterator data in both direction forward and backward
        
 //      ***************ListIterator**********
        //ALT + SHIFT + L= to extract return value
      ListIterator<Integer>ltr=al.listIterator();
      while(ltr.hasNext())
      {
    	  System.out.println(ltr.next());
      }
      System.out.println("========================");
      while(ltr.hasPrevious())
      {
    	  System.out.println(ltr.previous());
      }
      
      
			
			
		//	ArrayList<Object>x = new ArrayList<Object>();
		//	x.add(0,1000);
		//	x.add(1,"Ram");
		//	x.add(2,true);
		//	x.add(3,"Ram");
		//	x.add(4,true);
		//	x.add(5,35.44);
		//	x.add(6,'A');
		//	System.out.println(x);
			
			
		// ArrayList<String>x = new ArrayList<String>();
		//	x.add("Shyam");
		//	x.add("Ram");
		//	x.add("hari");
		//	System.out.println(x);
			
			
			
		//	ArrayList<Character>x = new ArrayList<Character>();
		//	x.add('A');
		//	x.add('B');
		//	x.add('C');
		//	System.out.println(x);
					
			
			
	//	ArrayList<Integer> x= new ArrayList<Integer>();
	//	x.add(1000);
	//	x.add(3453);
	//	x.add(45);
	//	x.add(35);
	//	System.out.println(x);
		
		
	//	********* OLD WAY************
	//	ArrayList<int> a12=new ArrayListDemo(); //wrong
	//	ArrayList a12=new  ArrayList();//not recommended Warning
		
	//	a12.add(111);
	//	a12.add("Ram");
	//	a12.add(67);
	//	a12.add(true)
	//	a12.add(56.46);
	//	System.out.println(a12);
		
			
		}   
		
}
	
	
	
	



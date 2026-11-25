package com.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {
	
	

	public static void main(String[]args)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(222);
		list.add(333);
		list.add(445);
		list.add(576);
		list.add(242);
		list.add(222);
		list.add(null);
		list.add(null);
		
	//	LinkedList<test>Tests=new LinkedList<test>();
		
	//	Tests.add(new test(1,"Ram"));
	//	Tests.add(new test(2,"Shyam"));
	//	Tests.add(new test(3,"Hari"));
		
		
		
	//	for(int i=0;i<Tests.size();i++)
	//	{
	//		Tests.get(i).display();
	//	}
		
		
		
		
	//	for(test test :Tests)
		{
			System.out.println(list);
		}
		
		
		
		
		
	//	Iterator<test> itr=Tests.iterator();
	//	while(itr.hasNext())
	//	{
	//		System.out.println(itr.next());
	//	}
		
		
		
	//	ListIterator<test> ltr=Tests.listIterator();
	//	while(ltr.hasNext())
	//	{
	//		System.out.println(ltr.next());
	//	}
		
		
		
	
		
	//	System.out.println(list.get(0));
	//	System.out.println(list);
	}

}

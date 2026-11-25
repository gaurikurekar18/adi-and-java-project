package com.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[]args)
	{
	 PriorityQueue<Integer>pp=new PriorityQueue<Integer>();
	 
	 pp.add(12);
	 pp.add(45);
	 pp.add(576);
	 pp.add(1);
	 pp.add(68);
//   pp.add(null);PriorityQueue not allow in null value element
	 pp.add(-2);
	 pp.add(0);
	 pp.add(12);
	 
//	 System.out.println(pp);
//	 System.out.println(pp.size());
//	 pp.clear();
//	 System.out.println(pp.isEmpty());
//	 System.out.println(pp.contains(68));
//	 System.out.println(pp.remove(0));
//	 pp.offer(500);//to add new element at last...
//	 System.out.println(pp.element());//small element will get
	 
	 
	 
//	 Iterator<Integer>iterator=pp.iterator();
//	 while(iterator.hasNext())
//	 {
//		 System.out.println(iterator.next());
//	 }
	 
	 
	 
	 //for each
	 for(Integer i:pp)
	 {
		 System.out.println(i);
	 }
	 
	}

}

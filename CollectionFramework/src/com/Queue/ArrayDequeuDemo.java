package com.Queue;

import java.util.ArrayDeque;

public class ArrayDequeuDemo {
	public static void main(String[]args)
	{
		ArrayDeque<String>aa=new ArrayDeque<String>();
		aa.add("Ram");
		aa.add("hari");
		aa.add("Ram");
		aa.add("rohan");
		aa.add("sameer");
		//aa.add(null);//not allow
		
		System.out.println(aa.size());
	//	System.out.println(aa.peek());//FIFO will get first element
	//	System.out.println(aa.getLast());//LIFO will get last element
	//	System.out.println(aa.poll());//first element remove
	//	System.out.println(aa.pollLast());//last element remove
	//	System.out.println(aa.pop());//Poll and pop same work in first element remove
		System.out.println(aa.peekFirst());//FIFO peek and peekFirst work same will get first element
		System.out.println(aa.peekLast());//LIFO peekLast na getLast work same will get last element
		System.out.println(aa);
		
	}

}

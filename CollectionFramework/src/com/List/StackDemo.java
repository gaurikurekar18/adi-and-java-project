package com.List;
import java.util.Stack;
public class StackDemo {
	
	public static void main(String[]args)
	{
		Stack<Integer>s=new Stack<Integer>();
		s.add(0,333);
		s.add(45);
		s.add(333);
		s.add(null);
		s.add(null);
		System.out.println(s.get(0));
		//STACK=>LAST IN 1ST out
		System.out.println(s.peek());
		System.out.println(s.pop());
		
		System.out.println(s);
		
	}

}

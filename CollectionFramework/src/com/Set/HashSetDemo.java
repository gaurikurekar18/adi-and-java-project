package com.Set;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
	
	public static void main(String[] args)
	{
	
/*  Student s1=new Student(1,"Ram");
	Student s2=new Student(2,"Shyam");
		
	HashSet<Student> students=new HashSet<Student>();
	students.add(s1);
	students.add(s2);
	
	//for loop worked here ==>no indexing
	//	*********FOR EACH*********	
	for(Student ss:students)
	{
	System.out.println(ss.getId());
	System.out.println(ss.getName());
	System.out.println("============");
	}	
	
		//*******ITERATOR**********
	Iterator<Student>iterator=students.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	*/
	
	

	
	
	/*	HashSet<Integer>hs =new HashSet<Integer>();
		hs.add(12);
		hs.add(34);
		hs.add(45);
		hs.add(46);
		hs.add(12);
		hs.add(null);
		hs.add(null);
	//	System.out.println(hs);
		*/

		
		HashSet<Object>hs2=new HashSet<Object>();
		hs2.add(12);
		hs2.add("Ram");
		hs2.add(true);
		hs2.add(46.56);
		hs2.add(345.34f);
		hs2.add("Ram");
	//	System.out.println(hs2.size());
	//	hs2.clear();
	//	System.out.println(hs2.isEmpty());
	//	System.out.println(hs2.contains(112))
    //  System.out.println(hs2.remove(true));
		
		
		
	}

}

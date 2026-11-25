package com.aadi;

public class User implements Runnable {
	
	
	String s1="aadiandjava";
	
	synchronized void m1()
	{
		char c[] = s1.toCharArray();
		for(char cc:c)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"="+cc);
		}
		System.out.println();
	}
	@Override
	public void run()
	{
		m1();
	}
	
	public static void main(String []args)
	{
		User user=new User();
		
		Thread t1=new Thread(user);
		t1.setName("ram");
		t1.start();
		
		Thread t2=new Thread(user);
		t2.setName("shyam");
		t2.start();
		
		Thread t3 = new Thread(user);
		t3.setName("hari");
		t3.start();
		
	}

}

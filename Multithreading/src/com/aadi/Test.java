package com.aadi;

public class Test extends Thread {
	
	
	@Override
	public void run()
	{
		m1();
	}
	
	
	void m1()
	{
		for(int i=1;i<=5;i++)
		{
			try {
				if(Thread.currentThread().getName().equals("Ram"))
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"="+Thread.currentThread().getName());
		}
	}
	
	
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getName());
		
		//parralel execution
		//thread-0
	//	Test t1=new Test();
	//	t1.setName("Aadi");
	//	t1.start();//start method internally called run method
		Test t1=new Test();
		Thread t = new Thread(t1);
		t.setName("Ram");
		t.start();
		
		
	//	Test t2=new Test();
	//	t2.setName("purvaj");
	//	t2.start();//start method internally called run method
		Thread t2=new Thread(t1);
		t2.setName("hari");
		t2.start();
		
		
	//	Test t3=new Test();
	//	t3.setName("gauri");
	//	t3.start();//start method internally called run method
		Thread t3=new Thread(t1);
		t3.setName("Aakash");
		t3.start();
	}
	
	
	

}

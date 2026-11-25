
package com.aadiandjava;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public  class Student {
	
//	@Override
//	public void afterPropertiesSet() throws Exception
//	{
//		System.out.println("Getting DB connection success...");	
//	}
	
	
//	@Override
//	public void destroy() throws Exception
//	{
//		System.out.println("Closing DB connection...");
//	}
	
	
	
  //  public void getConnection() 
  //  {
 //       System.out.println("Getting DB connection success...");
 //   }

    public void getData()
    {
    	System.out.println("getting data from DB..");
    }
    
    public void insertData()
    {
    	System.out.println("Inserted data in db...");
    }
    
    
 //   public void closeConnection()
 //   {
 //      System.out.println("Closing DB connection...");
 //   }
	
	}


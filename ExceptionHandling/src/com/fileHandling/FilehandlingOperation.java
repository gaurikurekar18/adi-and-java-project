package com.fileHandling;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FilehandlingOperation {
	
	String  username="aadiandjava";
	String  password="aadi1212";
	String email="aadi@gmail.com";
	String gender="Male";
	
	void createFile()
	{
		File file=new File("D:\\full strack java\\filehandling\\student.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("file create Successfully....");
			}
			else
			{
				System.out.println("File Already exist...");
			}
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
	}
	//write data into file
	
	void writeData()
	{
		User user1=new User("Rohit", "rohit1212", "rohit@gmail.com", "male");
		
		FileWriter fw=null;//default value of class
		try {
		 fw=new FileWriter("D:\\full strack java\\filehandling\\student.txt",true);
		 
		 fw.write("\n===============================\n");
		 fw.write("\nUsername="+user1.getUsername());
		 fw.write("\npassword="+user1.getPassword());
		 fw.write("\nEmail="+user1.getEmail());
		 fw.write("\nGender="+user1.getGender());
		 
		// fw.write("\nHello student.....");//to write the data
		// fw.write("\nMy name is aadi");
		// fw.append("\ni am from pune");
		// fw.write("\ni am learning java");
		 
		 
		 fw.flush();//to save the data.in file
		 
		 System.out.println("Data written Successfully.....");
		}
		catch(IOException i)
		{
			i.printStackTrace();	
		}
		finally
		{
			try {
			fw.close();
		}
			catch(IOException i)
			{
				i.printStackTrace();
			}
		
		}
	
	
	}
	
	
	
	
	void readDataFromFile()
	{
		FileReader fr=null;
		try
		{
		  fr=new FileReader("D:\\full strack java\\filehandling\\student.txt");
		  
		// int x= fr.read();
		// System.out.println(x);
		  int data;
		  while((data=fr.read())!= -1) {
			  System.out.print((char)data);
		  }
		}  
		catch( IOException i)
		{
			i.printStackTrace();
		}
		
		finally {
			try
			{
				fr.close();
			}	
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	

	void deleteFile()
	{
		File file=new File("D:\\full strack java\\filehandling\\student.txt");
		
		if(file.exists()) {
			
			file.delete();
			System.out.println("Deleted success...");
			
		}
		else {
			System.out.println("file not present");
		}
	}
	
}

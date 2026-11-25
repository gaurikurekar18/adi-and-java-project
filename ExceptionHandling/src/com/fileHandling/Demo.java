package com.fileHandling;
import java.io.File;
import java.io.IOException;
public class Demo {
	
	/*void m1() throws IOException
	{
		File file=new File("D:\\full strack java\\filehandling\\student.txt");
		file.createNewFile();//i dont want to handle ..--declare this exception
		
		System.out.println("File create...");	
	}
	*/
	
	
	public static void main(String[] args) 
	{
	/*	File file=new File("emp.text");
		try {
			file.createNewFile();
			System.out.println("file create....");
		}
		catch(IOException i)
		{
			System.out.println(i.getMessage());
		}
		*/
		
		
		
		//emp1.txt
		//emp2.txt
		//emp100.txt
		
		 for(int i=1;i<=100;i++) {
			 
		 
		File file=new File("D:\\full strack java\\filehandling\\emp'"+i+"'.mp4");//concatination
	    try {
	    	
	    	if(file.createNewFile())
	    	{
	    		System.out.println("File create...");
	    	}
	    	else
	    	{
	    		System.out.println("File already exist");
	    	}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//i dont want to handle ..--declare this exception
		
		 }
	}
	

}

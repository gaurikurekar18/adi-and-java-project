package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dbconnection.MySQLDbConnection;
import com.model.User;

public class UserDao {
	
	Connection con = MySQLDbConnection.createConnection();
	
	
/*	public void createUserTable()
	{
		try {
		Statement st=con.createStatement();
		st.execute("create table user(userId int,username varchar(45),password varchar(34),email varchar(34),address varchar(34),gender varchar(54))");
		System.out.println("Table Created...");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}*/
	
	
	
	
	
//	*****************1st WAY***************
	
	
/*	public void saveUser(int userId,String username,String password,String email,String address,String gender)
	{
		try {
		Statement st=con.createStatement();
		
	//	String sqlQuery="insert into user value(1,'Ram','2323','ram@gmail.com','pune','Male')";
		
		String sqlQuery="insert into user value('"+userId+"','"+username+"','"+password+"','"+email+"','"+address+"','"+gender+"')";
		st.execute(sqlQuery);
		
		System.out.println("Data inserted...");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}*/
	
	
	
	
	
	//*****************2nd WAY****************
	
/*	public void saveUser(int userId,String username,String password,String email,String address,String gender)
	{
		try {
		String sqlQuery="insert into user value (?,?,?,?,?,?)";//query parameter
		
		PreparedStatement pst=con.prepareStatement(sqlQuery);
		
		pst.setInt(1, userId);
		pst.setString(2,username);
		pst.setString(3,password);
		pst.setString(4,email);
		pst.setString(5,address);
		pst.setString(6,gender);
		
		pst.execute();
		
	
		System.out.println("data Inserted...");
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}*/
	
	
	
	
	
	
	
	//************************3RD WAY*****************
	
	
	public String saveUser(User user)
	{
		PreparedStatement pst=null;
		try {
		String sqlQuery="insert into user value (?,?,?,?,?,?)";//query parameter
		
		 pst=con.prepareStatement(sqlQuery);
		
		pst.setInt(1, user.getUserId());
		pst.setString(2,user.getUsername());
		pst.setString(3,user.getPassword());
		pst.setString(4,user.getEmail());
		pst.setString(5,user.getAddress());
		pst.setString(6,user.getGender());
		
		pst.execute();
		
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				pst.close();//for security close the resourcess in finally block
				con.close();//connection also should get close
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return"User Register Success";
	}
		
	
   public User getUserById(int id)
   {
	   User user=null;
  
	   String sqlQuery="select * from user where userid=?";
   
	try {
   PreparedStatement pst=con.prepareStatement(sqlQuery);
   
   pst.setInt(1, id);
   
  ResultSet rs= pst.executeQuery(); 
  
  if(rs.next())//select query
  {
	//for only one record i want to get from db  
  int userid=rs.getInt(1);
  String username=rs.getString(2);
  String password=rs.getString(3);
  String email=rs.getString(4);
  String address=rs.getString(5);
  String gender=rs.getString(6);
  
   user=new User();
  
  user.setUserId(userid);
  user.setAddress(address);
  user.setEmail(email);
  user.setGender(gender);
  user.setPassword(password);
  user.setUsername(username);
  
  }
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
	
	return user;
	
}	
	//all user get from db
   
   public ArrayList<User> getAlluserFromDB()
   {
	  ArrayList<User> users=new ArrayList<User>(); //12 user
	   
	   
	   User user=null;
	   
	 String sqlQuery="select * from user";  
	   
	  try {
		PreparedStatement pst= con.prepareStatement(sqlQuery);
		ResultSet rs=pst.executeQuery();
		//more than 1 records i want to get from db
		while(rs.next())
		{
			int userid=rs.getInt(1);
			  String username=rs.getString(2);
			  String password=rs.getString(3);
			  String email=rs.getString(4);
			  String address=rs.getString(5);
			  String gender=rs.getString(6);	
			  
			  user= new User();
			  
			  user.setUserId(userid);
			  user.setAddress(address);
			  user.setEmail(email);
			  user.setGender(gender);
			  user.setPassword(password);
			  user.setUsername(username);
			  	  users.add(user);  
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return users;
	}	
   
   
   
   
   
   //whole user i want to update
   public String updateUser(User user)
   {
	    String sql = "update user set username=?, password=?, email=?, address=?, gender=? where userId=?";

		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,user.getUsername());
			pst.setString(2,user.getPassword());
			pst.setString(3,user.getEmail());
			pst.setString(4,user.getAddress());
			pst.setString(5,user.getGender());
			pst.setInt(6,user.getUserId());
			
			pst.execute();
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return "User Updated Successfully";
   }

   //delete
   public String deleteById(int id)
   {
	   String sql="delete from user where userid=?";
	   
	   PreparedStatement pst=null;
	   
	   try {
		   pst=con.prepareStatement(sql);
		   
		   pst.setInt(1, id);
		   
		   pst.execute();
		   int i=pst.executeUpdate();
		  if(i>0)
		  {
			  return "User deleted Successfully";
		  }
		  else
		  {
			  return null;
		  }
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   finally
	   {
		   try {
			   pst.close();
			   con.close();
		   }
		   catch(SQLException e)
		   {
			   e.printStackTrace();
		   }
	   }
	   return "User deleted Successfully";
   }
   
   public String deleteById1(int id)
   {
	   return "User deleted Successfully";
   }
}
































/*	public static void main(String[]args)
	{
		UserDao dao=new UserDao();
	//	dao.createUserTable();
	//	dao.saveUser(3,"rohan","1212","rohan@gmail.com","mumbai","male");
		User user=new User();
		user.setUserId(4);
		user.setUsername("prakash");
		user.setPassword("213456");
		user.setEmail("P@gmail.com");
		user.setAddress("delhi");
		user.setGender("male");
		
		dao.saveUser(user);
	*/	
		
//	}


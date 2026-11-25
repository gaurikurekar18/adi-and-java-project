package com.main;
import com.exception.InvalidUserIdException;
import com.exception.UserNotFoundException;

import java.util.ArrayList;
import com.controller.UserController;
import com.model.User;
public class UserMain {
	
	public static void main(String[]args)
	{
		UserController controller=new UserController();
		try {
		System.out.println(controller.delete(2));
		}
		catch(UserNotFoundException u)
		{
			System.out.println(u.getLocalizedMessage());
		}
	/*	User user=new User();
		user.setUserId(1);
		user.setAddress("Delhi");
		user.setEmail("laxman@gmail.com");
		user.setGender("male");
		user.setPassword("Ram$5656");
		user.setUsername("Laxman");
		
		
         
		String msg=controller.update(user);
		System.out.println(msg);
		
		*/
		
	
		
	/*	ArrayList<User> users=controller.getAllUsers();
		for(User user:users)
		{
			System.out.println(user.getUserId());
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			System.out.println(user.getEmail());
			System.out.println(user.getAddress());
			System.out.println(user.getGender());
			
			System.out.println("==========================================");
		}*/
		
		
		
		
		
	/*	try {
		User user=controller.getUserById(5);
		
		System.out.println(user.getUserId());
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		System.out.println(user.getAddress());
		System.out.println(user.getGender());
		}
		catch(UserNotFoundException e)
		{
			System.out.println(e.getMessage());
		}*/
		
		
	/*	User user=new User();
		user.setUserId(12);
		user.setAddress("Mumbai");
	    user.setEmail("vishal@gmail.com");
	    user.setGender("male");
	    user.setPassword("Vishal$5656");
	    user.setUsername("vishal");
		try {
		String msg=controller.saveUser(user);
		System.out.println(msg);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		*/
		
	}

}

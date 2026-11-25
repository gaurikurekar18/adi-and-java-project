package com.controller;
import java.util.ArrayList;
import com.exception.UserNotFoundException;
import com.model.User;
import com.service.UserService;
public class UserController {
	
	UserService service = new UserService();
	
	public String saveUser(User user)
	{
		String msg=service.saveUser(user);
		
		return msg;
		
	}
	
	public User getUserById(int id) 
	{
	User user =	service.getUserById(id);
		
		
		return user;
	}
	
	public ArrayList<User> getAllUsers()
	{
		ArrayList<User> users=service.getAllUsers();
		return users;
	}

	public String update(User user)
	{
		return service.update(user);
		
	}
	public String delete(int id)
	{
		return service.delete(id);
	}
}

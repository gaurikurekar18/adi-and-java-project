package com.service;
import java.util.ArrayList;
import com.dao.UserDao;
import com.exception.InvalidPasswordException;
import com.exception.InvalidUserIdException;
import com.exception.UserNotFoundException;
import com.exception.UsernameLengthReachedException;
import com.model.User;
public class UserService {
		
		UserDao dao=new UserDao();
		
		String passwordRegex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$";
		
		public String saveUser(User user)
		{
			if(user.getUsername().length()>10 || user.getUsername().length()<3)
			{
				throw new UsernameLengthReachedException("Username should be in between 3 to 10 char");
			}
			if(user.getUserId()<=0)
			{
				throw new InvalidUserIdException("userId not valid...");
			}
			
			if(!user.getEmail().contains("@")|| !user.getEmail().endsWith(".com"))
			{
				throw new InvalidEmailException("Email is not valid.."+user.getEmail());
			}
			if(!user.getPassword().matches(passwordRegex))
			{
				throw new InvalidPasswordException("password must contain at least one capital letter,"+"one small letter,one digit,and one special charecter.");
			}
			String msg=dao.saveUser(user);
			
			return msg;
		
	    }

		public User getUserById(int id) 
		{
			
		User user =	dao.getUserById(id);
		//logic
		if(user == null)
		{
			throw new UserNotFoundException("user not found with id = "+id);
		}
		
		return user;
		}
		public ArrayList<User> getAllUsers()
		{
			ArrayList<User>users=dao.getAlluserFromDB();
			
			return users;
		}
		
		public String update(User user)
		{
			return dao.updateUser(user);
		}

		public String delete(int id) {
		    String msg= dao.deleteById(id);
		    if(msg==null)
		    {
		    	throw new UserNotFoundException("User Not found with id ="+id);
		    }
		    return msg;
		}
}

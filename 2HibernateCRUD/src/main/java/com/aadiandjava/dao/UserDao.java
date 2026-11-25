package com.aadiandjava.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.aadiandjava.entity.User;
import com.aadiandjava.hibernateUtil.HibernateUtil;

public class UserDao {
	
	//save update delete = transaction
	public String saveUser(User user)
	{
		try
		{
	//	SessionFactory sessionFactory =	HibernateUtil.getSessionFactory();
		
	//	Session session= sessionFactory.openSession();
		
	//	Transaction tr=session.beginTransaction();
			
	Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tr=session.beginTransaction();
		
		session.persist(user);//save user in db NEW
		
	//	session .save(user);//save user in db OLD
		
		tr.commit();//saved change in database
		
		return "User Saved Successfully";
		
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	public User getUserById(int id)
	{
		try
		{
			Session session=HibernateUtil.getSessionFactory().openSession();
			
		User user = session.get(User.class,id);
		
	    return user;
		}
		catch(Exception e)
		{
		throw new RuntimeException(e.getMessage());	
		}
	}
	
	//HQL--Hibernate Query Language
	public List<User>  getAllUsers()
	{
		try
		{
			Session session = HibernateUtil.getSessionFactory().openSession();
			
		List<User> users = session.createQuery("from User",User.class).getResultList();
		return users;
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	//Update
	public  String update(int id,User user)
	{
		try
		{
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			  Transaction tr = session.beginTransaction();
			  
			  User dbUser = session.get(User.class,id);
			  
			  dbUser.setEmail(user.getEmail());
			  dbUser.setGender(user.getGender());
			  dbUser.setPassword(user.getPassword());
			   dbUser.setUsername(user.getUsername());
			  
			  session.persist(dbUser);
			  
			  tr.commit();
			  
			  return "User Update Successful";
		
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}
	
	//Delete
	
	public String deleteUser(int id)
	{
		try
		{
			Session session = HibernateUtil.getSessionFactory().openSession();
			
			Transaction tr = session.beginTransaction();
			
			User user = session.get(User.class,id);
			
			session.remove(user);
			
			tr.commit();
			
			return"Delete Successfully";
		}
		catch(Exception e)
		{
			throw new RuntimeException(e.getMessage());
		}
	}

}

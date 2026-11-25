package com.fileHandling;

public class User {
	
	private String username;
	private String password;
	private String email;
	private String gender;
	
	public User(String username,String password,String email,String gender)
	{
		super();
		this.username=username;
		this.username=password;
		this.email=email;
		this.gender=gender;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}
	
		
	}



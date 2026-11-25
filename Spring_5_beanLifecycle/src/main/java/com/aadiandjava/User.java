package com.aadiandjava;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Configuration
@Component
public class User {
	
	
	
	@PostConstruct//annotation Configuration
	public void getConnection()
	{
		System.out.println("getting db Connection..");
		loadAdmin();
	}
	
	
	public void loadAdmin()
	{
		System.out.println("Name= Admin");
		System.out.println("Pass= Admin@1212");
		System.out.println("Role= ADMIN");
	}
	
	@PreDestroy
	public void closeConnection()
	{
		System.out.println("closing db connection");
	}

}

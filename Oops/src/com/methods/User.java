package com.methods;

public class User {
	static String city;//common for all object
	int id;//difference for all object
	String username;
	String password;
	
	static void rules() {
		System.out.println("1.User must be use Instagram for only 2 Hours in a Day");
		System.out.println("2.User must be have 10K Followers to Earn Money from Instagram");
	}
	
	void display() {
		System.out.println("ID:"+id);
		System.out.println("Username:"+username);
		System.out.println("Password:"+password);
		
	}
     public static void main(String []args) {
    	 User.city="Pune";
    	 User.rules();
    	 
    	 User user1=new User();
    	 user1.id=11;
    	 user1.username="aadi";
    	 user1.password="1232";
    	 user1.display();
    	 
    	 System.out.println("=====================");
    	 
    	 
    	 User.rules();
    	 
    	 User user2=new User();
    	 user2.id=22;
    	 user2.username="puru";
    	 user2.password="1112";
    	 user2.display();
     }
}

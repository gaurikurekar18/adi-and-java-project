package com.aadiandjava.main;

import java.util.List;

import com.aadiandjava.controller.UserController;
import com.aadiandjava.entity.User;

public class UserMain {

    public static void main(String[] args) {

        UserController controller = new UserController();
        
        System.out.println(controller.delete(102));
            
   //   User user = new User(102,"AadiandCPP","6767","aadi78@gmail.com","Male");
        
      // System.out.println(controller.update(102,user));
        
    /*  List<User> users=controller.getAll();
        
        for(User user:users)
        {
        	user.display();
        	System.out.println("=============================");
        	}
     */ 
   /*   try {
     User user=controller.getUser(104);
     user.display();
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }*/

   //   User user = new User( 103, "gaurikurekar","1213","gauri102@gmail.com", "female");
           
          
   //   System.out.println(controller.saveUser(user));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.class1;
/**
 *
 * @author omerfaruk
 */
public class Main {
     public static void main(String[]args){
       Student student= new Student();
       student.setId(1);
       student.setFirstName("Beyza");
       student.setLastName("Işık");
       student.setEmail("Beyza...@gmail.com");
       student.completionRate="%64";
       student.setPassword("15263");
   
       
      Instructor ınstructor=new Instructor();
      ınstructor.setId(2);
      ınstructor.setFirstName("Ömer");
    
    
      UserManager userManager= new UserManager();
      userManager.add(student);
      userManager.logIn(student);
      userManager.delete(ınstructor);
     
       
  
		
	
		
     }

  
}


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
public class UserManager {
    
    public void add(User user){
        System.out.println(user.getFirstName() +" eklendi.");
    }
     public void delete(User user){
        System.out.println(user.getFirstName() +" silindi.");
    }
      public void update(User user){
        System.out.println(user.getFirstName() + " güncellendi.");
    }
       public void logIn(User user){
        System.out.println(user.getFirstName()+ " giriş yapıldı.");
    } 
          public void logOut(User user){
        System.out.println(user.getFirstName()+ " çıkış yapıldı.");
    } 
         
}

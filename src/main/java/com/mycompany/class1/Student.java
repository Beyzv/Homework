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
public class Student extends User {

    String  completionRate;
  
    public Student (){
      
    }
    public Student (int id,String firstName,String lastName,String email,String completionRate,String password){
    
        this.getId();
        this.getFirstName();
        this.getLastName();
        this.getEmail();
        this.getPassword();
        this.completionRate=completionRate;
    }
 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author tron
 */
public class UserModel {
    public int userId;
    public String userName;
    public String password;
    public String email;
    public String firstName;
    public String lastName;
    public String userAccountType;
    
    public UserModel(){
        this.userId = 0;
    }
    public UserModel(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
    
    public UserModel(String firstName, String lastName, String email, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }
}
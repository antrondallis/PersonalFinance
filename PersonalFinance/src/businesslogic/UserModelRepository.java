/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import models.UserModel;

/**
 *
 * @author tron
 */
public class UserModelRepository {
    public UserModelRepository(){}
    
    public UserModel AuthenticateUser(UserModel model){
        UserModel returnModel = new UserModel();
        if (model.userName.equals("user") && model.password.equals("password")){
            returnModel.userId = 1;
            returnModel.userName = "user";
            returnModel.password = "";
            returnModel.email = "test@User.com";
            returnModel.firstName = "test";
            returnModel.lastName = "user";
            returnModel.userAccountType = "STAND";
        }
        
        return returnModel;
    }
}

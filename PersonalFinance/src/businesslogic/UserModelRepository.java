/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datalayer.db_connect;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import models.AuthenticatedUser;
import models.DataResult;
import models.UserModel;
import staticfiles.DataResultStatus;

/**
 *
 * @author tron
 */
public class UserModelRepository {
    
    CallableStatement myStmt = null;
    Connection myConn = null;
    
    ResultSet rs;
    
    public UserModelRepository(){}
    
    
    public void AuthenticateUser(UserModel model){
        try{
            myConn = db_connect.GetConnection();
            
            myStmt = myConn.prepareCall("{call authenticate_user(?, ?)}");
            myStmt.setString(1, model.userName);
            myStmt.setString(2, model.password);
            myStmt.execute();
            
            rs = myStmt.getResultSet();

            while(rs.next()){
                AuthenticatedUser.SetUser(rs.getInt("user_id"), rs.getString("username"));
            }
            
            myConn.close();
            myStmt.close();
        } catch (Exception e){
            JOptionPane.showOptionDialog(null, "Database Login Error: " + e.getMessage(), "Login Error",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
        }
    }
    
    public DataResult RegisterUser(UserModel model){
        DataResult returnResult = new DataResult();
        try{
            //get connection to database
            myConn = db_connect.GetConnection();
            //prepare the stored procedure call
            myStmt = myConn.prepareCall("{call register_user(?, ?, ?, ?, ?)}");   
            
            //set parameters
            myStmt.setString(1, model.firstName);
            myStmt.setString(2, model.lastName);
            myStmt.setString(3, model.email);
            myStmt.setString(4, model.userName);
            myStmt.setString(5, model.password);
            
            //calling stored procedure
            myStmt.execute();
            
            returnResult.StatusCode = DataResultStatus.CREATED_STATUS;
            returnResult.Message = DataResultStatus.CREATED_MESSAGE;
            
            myConn.close();
            myStmt.close();
        } catch(Exception e){
            returnResult.StatusCode = DataResultStatus.ERROR_STATUS;
            returnResult.Message = DataResultStatus.SetErrorMessage(e.getMessage());
        }
        
        return returnResult;
    }
    
    public DataResult CheckForUsername(String username){
        DataResult returnResult = new DataResult();
        
        try{
            myConn = db_connect.GetConnection();
            myStmt = myConn.prepareCall("{call check_for_username(?)}");
        
            myStmt.setString(1, username);
            
            myStmt.execute();
            
            rs = myStmt.getResultSet();
            
            while(rs.next()){
                returnResult.Data = rs.getInt("user_id");
            }
            
            if (rs != null) rs.close();
        } catch(Exception e){
            returnResult.StatusCode = DataResultStatus.ERROR_STATUS;
            returnResult.Message = DataResultStatus.SetErrorMessage(e.getMessage());
        }
        
        
        return returnResult;
    }
}

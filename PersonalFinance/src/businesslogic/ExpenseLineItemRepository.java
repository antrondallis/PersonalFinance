/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import datalayer.db_connect;
import java.awt.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.*;
import staticfiles.DataResultStatus;

/**
 *
 * @author tron
 */
public class ExpenseLineItemRepository {
    CallableStatement myStmt = null;
    Connection myConn = null;
    
    ResultSet rs;
    
    public ExpenseLineItemRepository(){}
    
    public ArrayList<ExpenseLineItem> GetAllLineItemsById(){
        //DataResult returnResult = new DataResult();
        ArrayList<ExpenseLineItem> items = new ArrayList<ExpenseLineItem>();
        try{            
            myConn = db_connect.GetConnection();
            myStmt = myConn.prepareCall("{call get_all_line_items_by_id(?)}");
            myStmt.setInt(1, AuthenticatedUser.userId);
            myStmt.execute();
            
            rs = myStmt.getResultSet();
            
            while(rs.next()){
                ExpenseLineItem item = new ExpenseLineItem();
                item.Id = rs.getInt("line_item_id");
                item.lineItemName = rs.getString("line_item_name");
                item.lineItemOwner = rs.getInt("line_item_owner");
                item.lineItemOrderBy = rs.getInt("line_item_order_by");
                items.add(item);
            }
            
            myConn.close();
            myStmt.close();
        } catch(Exception e){
            JOptionPane.showOptionDialog(null, "Database Login Error: " + e.getMessage(), "Login Error",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
        }
        
        return items;
    }
    
    public DataResult AddLineItem(String itemName){
        DataResult result = new DataResult();
        
        try{
            myConn = db_connect.GetConnection();
            myStmt = myConn.prepareCall("{call add_new_line_item(?,?)}");
            myStmt.setString(1, itemName);
            myStmt.setInt(2, AuthenticatedUser.userId);
            myStmt.execute();
        } catch(Exception e){
            JOptionPane.showOptionDialog(null, "Database Login Error: " + e.getMessage(), "Login Error",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null);
        }
        
        return result;
    }
}

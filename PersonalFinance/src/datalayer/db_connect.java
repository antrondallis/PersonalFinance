/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author tron
 */
public class db_connect {
    static Connection conn = null;
    public static Connection GetConnection(){
        try{
            //?autoReconnect=true&userSSL=false"
            //Class.forName("com.mysql.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.1.159:3306/personalfinance", 
                    "perfin", "finance1");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return conn;
    }
}

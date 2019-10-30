/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticfiles;

/**
 *
 * @author tron
 */
public class DataResultStatus {
    public static int GOOD_STATUS = 100;
    public static int ERROR_STATUS = 200;
    public static int CREATED_STATUS = 201;
    
    public static String SUCCESS_MESSAGE = "SUCCESS";
    public static String ERROR_MESSAGE = "The following error has occured: ";
    public static String CREATED_MESSAGE = "CREATED";
    
    public static String SetErrorMessage(String errorMsg){
        return ERROR_MESSAGE + errorMsg;
    }
}

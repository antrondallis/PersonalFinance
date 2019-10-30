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
public class DataResult<T> {
    public int StatusCode;
    public String Message;
    public T Data;
    
    public DataResult(){
        StatusCode = 0;
        Message = "";
    }
}

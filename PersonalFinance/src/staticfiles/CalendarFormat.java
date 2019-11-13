/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticfiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author tron
 */
public class CalendarFormat {
    String months[];
    public CalendarFormat(){
        months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    }
    public String GetCurrentDate(){
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtfMonth = DateTimeFormatter.ofPattern("M");
        DateTimeFormatter dtfDateYear = DateTimeFormatter.ofPattern("d, y");
        
        String month = GetMonthName(dtfMonth.format(localDate));
        String dateYear = dtfDateYear.format(localDate);
        /*
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM d, y");
        
        lblWelcomeUser.setText("Welcome " + AuthenticatedUser.userName + "!");
        lblCurrentDate.setText(dtf.format(localDate));
        *
        */
        
        return month + " " + dateYear;
    }
    
    private String GetMonthName(String month){
        int monthNumber = Integer.parseInt(month);
        return months[monthNumber - 1];
    }
}

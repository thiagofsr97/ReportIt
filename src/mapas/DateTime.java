/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class DateTime implements Serializable{
    private int day;
    private int month;
    private int year;

    public DateTime(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString(){
        String pattern = "dd/MM/YY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        
        return simpleDateFormat.format(new Date(month + "/" + day + "/" + year));
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
    
    
}

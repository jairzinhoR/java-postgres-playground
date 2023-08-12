package com.example.application;
import java.sql.Date;

public class HourContract {
    private Date date;
    private Double valeuPerHour;
    private Integer hours;
    
    public HourContract(){
    }
    
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
    public Double getValeuPerHour() {
        return valeuPerHour;
    }
    public void setValeuPerHour(Double valeuPerHour) {
        this.valeuPerHour = valeuPerHour;
    }

    public Integer getHours() {
        return hours;
    }
    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double totalValue(){
        return valeuPerHour * hours;
    }

}
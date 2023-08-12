package com.example.application;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private Workerlevel level;
    private Double baseSalary;
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){
    }
    
    public Worker(String name, Workerlevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Workerlevel getLevel() {
        return level;
    }
    public void setLevel(Workerlevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }
    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }
    
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for (HourContract c: contracts) {
            int c_year = 
            int c_month =

            if () {

            }
            
        }
    }


}

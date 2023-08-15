package com.example.teoria.worker;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();
    
    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public Worker(){
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public Double income(int year, int month){
        Double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c: contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);        
            int c_month = cal.get(Calendar.MONTH +1);
                if (c_year == year && c_month == month){
                    sum += c.totalValue(); 
                }
        }

        return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
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


}
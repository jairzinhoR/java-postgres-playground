package com.example.teoria.worker;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.element.Name;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();

        System.out.print("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextLine();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));

        System.out.println("How many contracts to this worker");
        n = sc.nextLine();

        for (int i=1; i<n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY)");
            Date contractDate = sc.
        }



        sc.close();



        

    }
    
}

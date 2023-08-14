package com.example.teoria;

import java.util.ArrayList;

public class ArrayL {
    
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<>();
            dias.add("DOM");
            dias.add("SEG");
            dias.add("TER");
            dias.add("QUA");
            dias.add("QUI");
            dias.add("SEX");
            dias.add("SAB");

        for (int i=0; i<dias.size(); i++) {   
            System.out.println("Dia " + (i+1) + " - " + dias.get(i));
        }
    }
}

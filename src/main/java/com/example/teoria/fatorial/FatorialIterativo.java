package com.example.teoria.fatorial;

public class FatorialIterativo {
    
    public static void main(String[] args) {
        int n = -2;
        int i = n-1;

        if (n >= 0){ 
            while (i > 1){
                n = n * i;
                i = i - 1;
            }
            System.out.println(n);                  
        }
        else { System.out.println("Por favor, digite um número maior ou igual a zero.");}
    }
}
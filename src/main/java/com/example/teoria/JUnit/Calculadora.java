package com.example.teoria.JUnit;

public class Calculadora {

    public int soma (int a, int b){
        return a + b;
    }
    
    public int divisao (int a, int b){
        return a / b;
    }

    public boolean verificarPar (int n){
        if (n % 2 == 0) {
            return true;
        }
        else return false;
    }
    
}

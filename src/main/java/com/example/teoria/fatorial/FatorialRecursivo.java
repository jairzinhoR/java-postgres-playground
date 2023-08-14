package com.example.teoria.fatorial;

public class FatorialRecursivo {

    public static int getFatorial(int n){
        if (n>1) {
            return n * getFatorial(n-1);
        }
        return n;
    }
    
    public static void main(String[] args) {
        System.out.println(getFatorial(4));
    }
}
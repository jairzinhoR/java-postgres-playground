package com.example.desafios;

public class Potencia2 {
    int base;
    int expoente;

    public Potencia2(){
    }

    public int calc(int base, int expoente){
        this.base = base;
        this.expoente = expoente;
        if (expoente == 0){
            return 1;
        } else return base * calc(base, expoente -1); 
    }

    public static void main(String[] args) {
        Potencia2 t1 = new Potencia2();
        System.out.println(t1.calc(3,3));
    }

}

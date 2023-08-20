package com.example.desafios;

import java.util.ArrayList;

public class Fila {
    ArrayList<Integer> vet = new ArrayList<>();

    public Fila(){
    };

    public ArrayList<Integer> entrar (int x){
        this.vet.add(x);
        return vet;
    }

    public ArrayList<Integer> sair (){
        this.vet.remove(0);
        return vet;
    }

    public static void main(String[] args) {
        Fila f = new Fila();
        System.out.println(f.entrar(31));
        System.out.println(f.entrar(8));
        System.out.println(f.entrar(87));
        System.out.println(f.sair());
    }
}

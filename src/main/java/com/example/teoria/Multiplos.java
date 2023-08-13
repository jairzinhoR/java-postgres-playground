package com.example.teoria;
import java.util.ArrayList;

public class Multiplos {
    public int numero;
    public int inicio;
    public int fim;

    public Multiplos(int inicio, int fim, int numero){
        this.numero = numero;
        this.inicio = inicio;
        this.fim = fim;
        ArrayList<Integer> intervalo = new ArrayList<>();

        for (int i=inicio; i<=fim; i++) {
            if (i % numero == 0){
                intervalo.add(i);
            }     
        }
        System.out.println("Aqui estão os números múltiplos de 87:");
        System.out.println(intervalo);
    }

    public static void main(String[] args) {
        Multiplos num87 = new Multiplos(1, 1000, 87);
    }

}

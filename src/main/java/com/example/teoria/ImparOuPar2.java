package com.example.teoria;
import java.util.Scanner;
import java.util.ArrayList;

public class ImparOuPar2 {
    ArrayList<Integer> intervalo;

    public ImparOuPar2(){
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        int fim = sc.nextInt();
        String busca = sc.next();
        System.out.println(" ");
        this.intervalo = new ArrayList<>();

        if (busca.equals("par") && inicio%2 == 0){
            for(Integer i = inicio; i <= fim; i = i+2){
                intervalo.add(i);
            }}
        else if (busca.equals("par") && inicio%2 != 0){
            for(Integer i = inicio; i <= fim; i = i+2){
                intervalo.add(i+1);
            }}
        else if (busca.equals("impar") && inicio%2 == 0){
            for(Integer i = inicio; i <= fim; i = i+2){
                intervalo.add(i+1);
            }}
        else if (busca.equals("impar") && inicio%2 != 0){
            for(Integer i = inicio; i <= fim; i = i+2){
                intervalo.add(i);
            }}
        else System.out.println("Digite um intervalo numérico e uma busca válida: 'par' ou 'impar'."); 
    }

    public static void main(String[] args) {
        ImparOuPar2 testando = new ImparOuPar2();
        testando.intervalo.forEach(System.out::println);
        }
}
    


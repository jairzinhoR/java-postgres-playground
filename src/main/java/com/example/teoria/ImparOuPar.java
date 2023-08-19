package com.example.teoria;
import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o início do intervalo numérico: ");
        int inicio = sc.nextInt();
        
        System.out.print("Digite o fim do intervalo numérico: ");
        int fim = sc.nextInt();
        
        System.out.print("Quais números quer encontrar? Digite 'par' ou 'impar': ");
        String parOuImpar = sc.next();
        
        if (parOuImpar.equals("par")) {
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } 
            } System.out.println(" ");
        } else if (parOuImpar.equals("impar")) {
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            } System.out.println(" ");
        } else {
            System.out.println("Opção inválida. Digite 'par' ou 'impar'.");
        }
    }
}

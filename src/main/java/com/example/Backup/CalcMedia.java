package com.example.Backup;
import java.util.Scanner;
public class CalcMedia {
    
    public static void main(String[] args) {
   
    // Criar um objeto Scanner para ler a entrada do usuário
    Scanner scanner = new Scanner(System.in);
    
    // Solicite ao usuário que digite os três números
    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();

    // Solicite ao usuário que digite os três números
    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();

    // Solicite ao usuário que digite os três números
    System.out.print("Digite o terceiro número: ");
    int num3 = scanner.nextInt();
        
    // Calcule a média dos três números
    double media = (num1+num2+num3)/3.0;

    // Imprima o resultado da média
        System.out.println();
        System.out.println("A média dos três números é: " + media);
        System.out.println();
    // Feche o Scanner para liberar recursos
    scanner.close();
        
    }

}

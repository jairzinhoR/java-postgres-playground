package com.example.Backup;
import java.util.Scanner;

public class Calc4OperacoesGPT {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o símbolo da operação: + - * ou / ");
        String operacao = scanner.next();
        
        // Usar equals() para comparar strings em Java, em vez do operador ==
        if (operacao.equals("+")) {
            operacao = "Adição";
        } else if (operacao.equals("-")) {
            operacao = "Subtração";
        } else if (operacao.equals("*")) {
            operacao = "Multiplicação";
        } else if (operacao.equals("/")) {
            operacao = "Divisão";
        } else {
            System.out.println("Operação inválida");
            scanner.close();
            return; // Encerra o programa em caso de operação inválida
        }
        
        System.out.println("Você escolheu a operação: " + operacao);
        
        // Informe o primeiro número da operação
        System.out.println("Informe o primeiro número da operação");
        int num1 = scanner.nextInt();
        System.out.println("Informe o segundo número da operação");
        int num2 = scanner.nextInt();

        // Cálculo
        int result = 0; // Inicialize a variável result com um valor padrão

        if (operacao.equals("Adição")) {
            result = num1 + num2;
    
        } else if (operacao.equals("Subtração")) {
            result = num1 - num2;
    
        } else if (operacao.equals("Multiplicação")) {
            result = num1 * num2;

        } else if (operacao.equals("Divisão")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Divisão por zero não é permitida");
                scanner.close();
                return; // Encerra o programa em caso de divisão por zero
            }
        }

        System.out.println("O resultado da operação é: " + result);

        // Feche o Scanner para liberar recursos
        scanner.close();
    }
}

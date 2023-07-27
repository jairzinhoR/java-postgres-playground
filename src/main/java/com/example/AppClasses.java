package com.example;

class Cliente {
    double Renda;
    char Sexo;
    int anoNascimento;

}

public class AppClasses {

    public static void main (String arg[]) {

        Cliente cliente1 = new Cliente();

        cliente1.Renda = 5450.00;
        cliente1.Sexo = 'M';
        cliente1.anoNascimento = 1987;

        System.out.println(cliente1.Renda);
        System.out.println(cliente1.Sexo);
        System.out.println(cliente1.anoNascimento);

        
    }



}
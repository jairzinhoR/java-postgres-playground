package com.example;

//ARQUIVO DE INSTÂNCIAÇÃO DOS OBJETOS CLIENTE
public class AppTeste {
    public static void main (String args[]) {
        Cliente cliente1 = new Cliente();
        cliente1.setAnoNascimento(1987);
        cliente1.setRenda(5450);
        cliente1.setSexo('M');

        System.out.println(cliente1.getAnoNascimento());
        System.out.println(cliente1.getRenda());
        System.out.println(cliente1.getSexo());

        Cliente cliente3 = new Cliente(3000, 'G', 1988);

        System.out.println(cliente3.getAnoNascimento());
        System.out.println(cliente3.getRenda());
        System.out.println(cliente3.getSexo());


    }
    
}

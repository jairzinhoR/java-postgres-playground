package com.example;

//ARQUIVO DE INSTÂNCIAÇÃO DOS OBJETOS DA CLASSE CLIENTE CLIENTE
public class AppTeste {
    public static void main (String args[]) {
        Cliente cliente1 = new Cliente();
        cliente1.setAnoNascimento(1987);
        cliente1.setRenda(5450);
        cliente1.setSexo('M');
        cliente1.setNome("Jairzinho");
        
        System.out.println("-----------------------");
        System.out.println(cliente1.getAnoNascimento());
        System.out.println(cliente1.getRenda());
        System.out.println(cliente1.getSexo());
        System.out.println(cliente1.getNome());
        

        System.out.println("-----------------------");
        Cliente cliente3 = new Cliente(3000, 'M', 1988, "Jair");
        System.out.println(cliente3.getAnoNascimento());
        System.out.println(cliente3.getRenda());
        System.out.println(cliente3.getSexo());
        System.out.println(cliente3.getNome());

    }
    
}

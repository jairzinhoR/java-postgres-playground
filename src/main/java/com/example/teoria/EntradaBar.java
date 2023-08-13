package com.example.teoria;

public class EntradaBar {
    public int idade;
    public boolean amigoDoDono;
    
    public EntradaBar(int idade, boolean amigoDoDono){
        this.idade = idade;
        this.amigoDoDono = amigoDoDono;
        if (idade > 18 || amigoDoDono) {
            System.out.println("Entrada autorizada");
        }
        else {System.out.println("Entrada não autorizada");}
    }
    
public static void main(String[] args) {
    
    EntradaBar jairzinho = new EntradaBar(12, true);
    }
}
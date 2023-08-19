package com.example.teoria;

public class Idade {
    private int idade;
    private int anterior;
    private int posterior;

    public Idade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public int anterior() {
        this.anterior = idade - 1;
       return anterior;
    }
    
    public int posterior() {
        this.posterior = idade + 1;
        return posterior;
    } 

    public static void main(String[] args) {
        
        Idade jairzinho = new Idade(36);
        System.out.println(jairzinho.getIdade());
        jairzinho.anterior();
        jairzinho.posterior();
        System.out.println(jairzinho.anterior);
        System.out.println(jairzinho.posterior);
    }
}
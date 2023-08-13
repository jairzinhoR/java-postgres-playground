package com.example.teoria;

public class Idade {
    private int idade;

    public Idade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void anterior() {
        int anterior = idade - 1;
        System.out.println(anterior);
    }
    
    public void posterior() {
        int posterior = idade + 1;
        System.out.println(posterior);
    } 

    public static void main(String[] args) {
        
        Idade jairzinho = new Idade(35);
        System.out.println(jairzinho.getIdade());
        jairzinho.anterior();
        jairzinho.posterior();
    }
}
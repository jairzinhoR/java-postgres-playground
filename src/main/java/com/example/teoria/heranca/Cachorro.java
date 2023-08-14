package com.example.teoria.heranca;

public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }


}

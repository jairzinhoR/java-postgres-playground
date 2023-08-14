package com.example.teoria.heranca;

public class Gato extends Animal {
    String corPelagem;

    public Gato(String nome, int idade, String corPelagem){
        super(nome, idade);
        this.corPelagem = corPelagem;
    }

    public String getCorPelagem(){
        return corPelagem;
    }

}

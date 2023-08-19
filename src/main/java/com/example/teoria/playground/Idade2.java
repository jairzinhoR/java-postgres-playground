package com.example.teoria.playground;

public class Idade2 {
    int idade;

    public Idade2(int idade){
        this.idade = idade;
    }

    public int idadeAnt(){
        int idadeAnt = idade - 1;
        return idadeAnt;
    }

    public int idadePost(){
        int idadePost = idade + 1;
        return idadePost;
    }
    
    public static void main (String args[]){
        Idade2 jairzinho = new Idade2(35);
        Idade2 elis = new Idade2(38);

        System.out.println(jairzinho.idadeAnt());
        System.out.println(jairzinho.idadePost());

        System.out.println(elis.idadeAnt());
        System.out.println(elis.idadePost());

        System.out.println(elis.idade);

    }

}

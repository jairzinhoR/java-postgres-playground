package com.example.teoria.listaEvetor;

public class Vetor {
    String[] gatos = new String[5];
    int numeroDoGato = 0;

    public Vetor(){
    }

    public void addGatos(String gato){
        if (numeroDoGato < gatos.length) {
            this.gatos[numeroDoGato] = gato;
            numeroDoGato = numeroDoGato + 1;
        } else {
            System.out.println("O vetor está cheio. Não é possível adicionar mais gatos.");
        }
    }  

    public void imprimirGatos() {
        System.out.println("Nomes dos gatos:");
        for (int i = 0; i < numeroDoGato; i++) {
            System.out.println(gatos[i]);
        }
    }

    public static void main(String[] args) {
        Vetor gatos = new Vetor();
        gatos.addGatos("Fumaça");
        gatos.addGatos("Onça");
        gatos.addGatos("Listrado");
        gatos.addGatos("Farol");
        gatos.addGatos("Nevasca");

        gatos.imprimirGatos();
    }
}
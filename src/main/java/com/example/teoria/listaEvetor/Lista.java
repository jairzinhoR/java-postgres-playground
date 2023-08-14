package com.example.teoria.listaEvetor;
import java.util.ArrayList;

public class Lista {
    ArrayList<String> gatos;

    public Lista(){
        gatos = new ArrayList<>();
    }

    public void addGatosList(String nome){
        this.gatos.add(nome);
    }

    public ArrayList printGatos(){
        return gatos;
    }

    public static void main(String[] args) {
        Lista gatos = new Lista();
        gatos.addGatosList("Fumaça");
        gatos.addGatosList("Farol");
        gatos.addGatosList("Listrado");

        System.out.println(gatos.printGatos());

    }

}

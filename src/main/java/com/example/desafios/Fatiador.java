package com.example.desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class Fatiador {
    String s;
    ArrayList<String> pedacos = new ArrayList<>();

    public ArrayList<String> fatiar(){
        System.out.println("Digite uma frase:");
        Scanner sc = new Scanner(System.in);
        this.s = sc.nextLine();
        System.out.println("");
        for (int i = 0; i < this.s.length(); i++){
            this.pedacos.add(this.s.charAt(i) + "");
        }
        return this.pedacos;
    }
    
    public static void main (String args[]) {
        Fatiador f = new Fatiador();
        System.out.println(f.fatiar());
        System.out.println(f);
    }

}
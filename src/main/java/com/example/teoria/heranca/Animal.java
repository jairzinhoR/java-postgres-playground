/* Instruções de Exercício
Crie uma hierarquia de classes relacionadas a animais, utilizando o conceito de herança.
Comece com uma classe base chamada Animal, da qual outras classes específicas de animais herdarão.

Crie uma classe Animal com os seguintes atributos:

nome (String): O nome do animal.
idade (int): A idade do animal.
Crie duas classes derivadas de Animal:

Cachorro: Adicione um atributo raca (String) para representar a raça do cachorro.
Gato: Adicione um atributo corPelagem (String) para representar a cor da pelagem do gato.
Crie construtores para cada classe que inicializem os atributos adequados.

Crie métodos de acesso (getters) e, se necessário, métodos para exibir informações sobre os animais.

Na classe Main (classe com o método main), crie objetos das classes Cachorro e Gato.
Demonstre o uso dos construtores e métodos de acesso.

*/
package com.example.teoria.heranca;

public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade() {
        return idade;
    }

        public static void main (String[] args) {
            Cachorro fiona = new Cachorro("Fiona", 14, "Vira-lata");
            System.out.println(
            "Nome: " + fiona.getNome() +
            "| Idade: " + fiona.getIdade() +
            "| Raça: " + fiona.getRaca());

            System.out.println("");
            Gato fumaca = new Gato("Fumaça", 3, "Cinza");
            System.out.println(
            "Nome: " + fumaca.getNome() +
            "| Idade: " + fumaca.getIdade() +
            "| Cor da Pelagem: " + fumaca.getCorPelagem());
        }
   
}
package com.example;

// ARQUIVO DA CLASSE CLIENTE
public class Cliente {
    private double renda;
    private char sexo;
    private int anoNascimento;

    // Construtor padrão
    public Cliente() {
    }

    // Construtor com parâmetros
    public Cliente(double renda, char sexo, int anoNascimento) {
        this.renda = renda;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    // Métodos getter e setter para o atributo renda
    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0) {
            this.renda = renda;
        } else {
            System.out.println("A renda não pode ser negativa.");
        }
    }

    // Métodos getter e setter para o atributo sexo
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F') {
            this.sexo = sexo;
        } else {
            System.out.println("O sexo deve ser 'M' ou 'F'.");
        }
    }

    // Métodos getter e setter para o atributo anoNascimento
    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento >= 1900 && anoNascimento <= 2023) {
            this.anoNascimento = anoNascimento;
        } else {
            System.out.println("O ano de nascimento deve estar entre 1900 e 2023.");
        }
    }
}

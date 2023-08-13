package com.example.teoria;

public class Conta {
    public int saldo;
    public Object getSaldo;

    public Conta(){
    }

    public int saldo(){
        return saldo;
    }

    public int saca(int valor){
        int saldoAtual = this.saldo - valor;
        this.saldo = saldoAtual;
        return this.saldo;
    }

    public int deposito(int valor){
        int saldoAtual = this.saldo + valor;
        this.saldo = saldoAtual;
        return this.saldo;
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.saldo());
        conta.deposito(7500);
        System.out.println(conta.saldo());
        conta.saca(4500);
        System.out.println(conta.saldo());
    }

}

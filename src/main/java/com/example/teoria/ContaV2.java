package com.example.teoria;

public class ContaV2 {
    private int saldo;

    public ContaV2(){
    }

    public int getSaldo(){
        return this.saldo;
    }

    public int saca(int valor){
        if (valor <= this.saldo) {
            int saldoAtual = this.saldo - valor;
            this.saldo = saldoAtual;
            System.out.println("Saque: " + valor);
            System.out.println("Saldo: " + this.saldo);
        }
        else { System.out.println("Saldo insuficiente");
        System.out.println("Saldo: " + this.saldo);
        }
        return this.saldo;
    }

    public int deposito(int valor){
        int saldoAtual = this.saldo + valor;
        this.saldo = saldoAtual;
        return this.saldo;
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposito(7500);
        System.out.println(conta.saca(9500));

    }

}

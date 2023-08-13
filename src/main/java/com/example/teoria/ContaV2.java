package com.example.teoria;

public class ContaV2 {
        double saldo;
        String titular;
    
        // Construtor da classe Conta
        ContaV2() {
            this.saldo = 0;
            this.titular = "";
        }
    
        // Método para sacar um valor da conta
        boolean saca(double valor) {
            if (valor > 0 && this.saldo >= valor) {
                this.saldo -= valor;
                return true;
            } else {
                return false;
            }
        }
    
        // Método para depositar um valor na conta
        void deposita(double valor) {
            if (valor > 0) {
                this.saldo += valor;
            }
        }
    
        // Método para transferir um valor para outra conta
        boolean transfere(ContaV2 destino, double valor) {
            boolean retirou = this.saca(valor);
            if (retirou == false) {
                // Não deu pra sacar!
                return false;
            } else {
                destino.deposita(valor);
                return true;
            }
        }

        public static void main (String[] args) {
            ContaV2 contaSERPRO = new ContaV2();
            contaSERPRO.saldo = 600000000;
            ContaV2 correnteJairzinho = new ContaV2();
            correnteJairzinho.saldo = 1000;
            ContaV2 poupancaJairzinho = new ContaV2();
            poupancaJairzinho.saldo = 0;

            System.out.println("--- Saldos antes do 1º Salário do SERPRO ---");
            System.out.printf("SERPRO: %.2f%n", contaSERPRO.saldo);
            System.out.println("Conta Corrente Jairzinho: " + correnteJairzinho.saldo);
            System.out.println("Poupanca Jairzinho: " + poupancaJairzinho.saldo);

            contaSERPRO.transfere(correnteJairzinho, 7500);
            correnteJairzinho.transfere(poupancaJairzinho, 3000);

            System.out.println("--- Saldos após o 1º Salário do SERPRO ---");
            System.out.printf("SERPRO: %.2f%n", contaSERPRO.saldo);
            System.out.println("Conta Corrente Jairzinho: " + correnteJairzinho.saldo);
            System.out.println("Poupanca Jairzinho: " + poupancaJairzinho.saldo);



           
        }
}
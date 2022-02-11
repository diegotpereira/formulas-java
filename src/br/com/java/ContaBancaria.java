package br.com.java;

public class ContaBancaria {
    
    public static void main(String[] args) {
        
        Conta conta  = new Conta();
        conta.setSaldo(600.0);

        conta.depositar(300.0);

        conta.verificarSaldo();
    }
}

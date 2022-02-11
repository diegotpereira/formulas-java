package br.com.java.conta;

public class Conta {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void verificarSaldo() {
        System.out.println("Seu saldo é: " + getSaldo());
    }
}

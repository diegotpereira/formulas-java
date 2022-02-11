package br.com.java.conta;

public class Conta {
    
    private Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void verificarSaldo() {
        System.out.println("Seu saldo é: " + getSaldo());
    }
}

package br.com.java.abstratos;

public abstract class Conta {

	private double saldo;
	
	public abstract void imprimirExtratoDetlhado();

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
}

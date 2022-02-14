package br.com.java.encapsulamento;

public class Conta {
	
	private double saldo;

	// Metodos publicos
	public void deposita(double valor) {
		this.saldo += valor;
		this.descontaTarifa();
	}

	// Metodos publicos
	public void saca(double valor) {
		this.saldo -= valor;
		this.descontaTarifa();
	}
	
	// Metodos privados
	private void descontaTarifa() {
		this.saldo -= 0.1;
	}
}

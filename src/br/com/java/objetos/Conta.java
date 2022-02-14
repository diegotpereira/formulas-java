package br.com.java.objetos;

public class Conta {
	double saldo;
	double limite;
	int numero;

	Agencia agencia;

	Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	Conta(int numero) {
		this.numero = numero;
	}

	Conta(int numero, double limite) {
		this(numero);
		this.limite = limite;
	}

	void deposita(double valor) {
		this.saldo += valor;
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	void imprimeExtrato() {
		System.out.println("Saldo: " + this.saldo);
	}

	void imprimeExtrato(int dias) {
		
	}

	double consultaSaldoDisponivel() {
		return this.saldo + this.limite;
	}
	void transfere(Conta destino, double valor){
		this.saldo -= valor;
		destino.saldo += valor;
	}
}

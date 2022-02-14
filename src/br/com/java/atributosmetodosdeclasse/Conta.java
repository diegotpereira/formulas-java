package br.com.java.atributosmetodosdeclasse;

public class Conta {
	
	// Atributo de classe
	static int contador;

	// Atributo de Instancia
	int numero;

	// Construtor
	Conta() {
		Conta.contador++;
		this.numero = Conta.contador;
	}

	static void zeraContador() {
		System.out.println("Contador: " + Conta.contador);
		System.out.println("Zerando o contador de contas...");
		Conta.contador = 0;
	}
}

package br.com.java.interfaces;

public class Teste {
	
	public static void main(String[] args) {
		
		GeradorDeExtrato g = new GeradorDeExtrato();
		ContaCorrente c = new ContaCorrente();
		g.geraExtrato(c);
	}
}

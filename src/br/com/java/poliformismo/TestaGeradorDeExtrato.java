package br.com.java.poliformismo;

import br.com.java.conta.ContaCorrente;
import br.com.java.conta.ContaPoupanca;

public class TestaGeradorDeExtrato {
	
	public static void main(String[] args) {
		
		GeradorDeExtrato gerador = new GeradorDeExtrato();

		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(1000);

		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(1000);

		gerador.imprimirExtratoBasico(cp);
		gerador.imprimirExtratoBasico(cc);
	}
}

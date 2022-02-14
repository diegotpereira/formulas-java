package br.com.java.interfaces;

public class TestaGeradorDeExtrato {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(500);
		cp.deposita(500);

		GeradorDeExtrato ge = new GeradorDeExtrato();
		ge.geraExtrato(cc);
		ge.geraExtrato(cp);
	}
}

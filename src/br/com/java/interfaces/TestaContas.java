package br.com.java.interfaces;

class TestaContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(500);
		cp.deposita(500);

		cc.saca(100);
		cp.saca(100);

		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}
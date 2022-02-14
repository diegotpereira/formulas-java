package br.com.java.atributosmetodosdeclasse;

public class TesteAtributos {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		f.valeRefeicaoDiario = 15;

		System.out.println(f.valeRefeicaoDiario);

		Funcionario.reajustaValeRefeicaoDiario(0.1);
	}
}

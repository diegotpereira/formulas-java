package br.com.java.object;

public class Objetos {
	
	public static void main(String[] args) {
		
		//Repositorio repositorio = new Repositorio();
		//repositorio.adiciona("Rafael");
		//Object o = repositorio.pega(0);
		//String s = (String)o;

		//System.out.println(s);

		// Substituido pelo toString()
		Conta conta = new Conta();
		
		//String descricao = conta.gerarDescricao();

		System.out.println(conta);

		// Metodo equals
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		System.out.println(conta1.compara(conta2));

		System.out.println(conta1.equals(conta2));
	}
}

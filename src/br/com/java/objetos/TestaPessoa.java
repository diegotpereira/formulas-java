package br.com.java.objetos;

public class TestaPessoa {

	public static void main(String[] args) {
		
		// Chamando o primeiro construtor
		Pessoa p1 = new Pessoa("123456x");

		Pessoa p2 = new Pessoa(123456789);

		System.out.println(p1.toString());
		System.out.println(p2);
	}
}

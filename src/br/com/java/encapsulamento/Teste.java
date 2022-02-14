package br.com.java.encapsulamento;

public class Teste {
	
	public static void main(String[] args) {
		Funcionario f = new Funcionario();

		// atributo privado só pode ser acessado 
		// por código escrito na própria classe do atributo.
		//f.nome = "Fulano de Tal";
		//f.salario = 2000;

		//System.out.println(f.nome);
		//System.out.println(f.salario);
		
		// 
		f.setNome("Fulano de Tal");
		f.setSalario(2000);

		System.out.println(f.getNome());
		System.out.println(f.getSalario());
	}
}

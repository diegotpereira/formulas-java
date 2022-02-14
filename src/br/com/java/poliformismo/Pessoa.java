package br.com.java.poliformismo;

public class Pessoa {
	
	protected String nome;

	public String getNome() {
		System.out.println("Nome da pessoa: " + nome);
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

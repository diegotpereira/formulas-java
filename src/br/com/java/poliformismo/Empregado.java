package br.com.java.poliformismo;

public class Empregado extends Pessoa{

	public String getNome() {
		System.out.println("Nome do empregado: " + nome);
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

package br.com.java.poliformismo;

public class Aluno extends Pessoa{
	
	public String getNome() {
		System.out.println("Nome do aluno: " + nome);
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}

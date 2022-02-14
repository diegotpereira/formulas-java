package br.com.java.encapsulamento;

public class Cliente {
	
	private String nome;
	double salario;

	public String consultaNome() {
		return this.nome;
	}

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
}

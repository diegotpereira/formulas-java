package br.com.java.heranca;

public class Funcionario {
	private String nome;
	private double salario;
	private int codigo;

	public double calcularBonificacao() {

		return this.salario * 0.1;
	}

	public String getNome() {
		return nome;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}

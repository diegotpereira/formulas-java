package br.com.java.heranca;

public class Emprestimo extends Servico{
	
	// Geral
	private Cliente contratante;
	private Funcionario responsavel;
	private String dataDeContratacao;

	// Emprestimo
	private double valor;
	private double taxa;
}

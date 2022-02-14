package br.com.java.heranca;

public class Servico {
	
	// Geral
	private Cliente contratante;
	private Funcionario responsavel;
	private String dataDeContratacao;

	// Emprestimo
	private double valor;
	private double taxa;

	// Seguro de veiculo
	private Veiculo veiculo;
	private double valorDoSeguroDeVeiculo;

	public double calculaTaxa() {
		return 10;
	}
}

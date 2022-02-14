package br.com.java.heranca;

public class SeguroDeVeiculo extends Servico{
	

	// Geral 
	private Cliente contratante;
	private Funcionario responsavel;
	private String dataDeContratacao;

	// Seguro de veiculo
	private Veiculo veiculo;
	private double valorDoSeguroDeVeiculo;
	private double franquia;
}

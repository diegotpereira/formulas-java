package br.com.java.objetos;

public class RegistraAluno {
	
	private String nome;
	private String endereco;
	private int idade;
	private double notaMatematica;
	private double notaPortugues;
	private double notaGeografia;

	private static int contadorEstudante;

	// retorna o nome do estudante
	public String getNome() {
		return nome;
	}

	// define ou altera o nome do estudante
	public void setNome(String temp) {
		this.nome = temp;
	}

	// retorno o endereço do estudante
	public String getEndereco() {
		return endereco;
	}

	// define ou altera o endreço do estudante
	public void setEndereco(String temp) {
		this.endereco = temp;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public double getMedia() {
		double resultado = 0;
		resultado = (notaMatematica + notaPortugues + notaGeografia) / 3;

		return resultado;
	}

	// define ou altera as notas do estudante
	public void setNotaMatematica(double temp) {
		notaMatematica = temp;
	}

	public void setNotaPortugues(double temp) {
		notaMatematica = temp;
	}

	public void setNotaGeografia(double temp) {
		notaMatematica = temp;
	}

	public static int getQuantidadeAlunos() {
		return contadorEstudante;
	}

	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Idade: " + idade);
	}

	public void imprimir(double mNota, double pNota, double gNota) {
		System.out.println("Nome: " + nome);
		System.out.println("Nota Matemática: " + mNota);
		System.out.println("Nota Português: " + pNota);
		System.out.println("Nota Geografia: " + gNota);
	}
}

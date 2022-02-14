package br.com.java.poliformismo;

public class TesteAluno3 {

	public static void main(String[] args) {
		Pessoa ref;

		Aluno aluno = new Aluno();
		aluno.setNome("Beatriz");

		Empregado empregado = new Empregado();
		empregado.setNome("Carlos");

		// não compila
		//ref.aluno;
		//ref.getNome();

		//ref.empregado;
		//ref.getNome();
	}
}
package br.com.java.poliformismo;

public class TesteAluno2 {
	
	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa();
		joao.setNome("João");
		joao.getNome();

		Aluno ana = new Aluno();
		ana.setNome("Ana");
		ana.getNome();

		Empregado mario = new Empregado();
		mario.setNome("Mario");
		mario.getNome();

	}
}

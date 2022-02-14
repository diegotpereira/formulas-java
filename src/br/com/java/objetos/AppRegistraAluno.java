package br.com.java.objetos;

public class AppRegistraAluno {
	
	public static void main(String[] args) {
		
		// cria 3 objetos RegistraAluno
		RegistraAluno ana = new RegistraAluno();
		RegistraAluno beto = new RegistraAluno();
		RegistraAluno carlos = new RegistraAluno();

		ana.setNome("Ana Machado");
		ana.setEndereco("Av Brasil, 1000");
		ana.setIdade(21);
		ana.setNotaMatematica(9.7);
		ana.setNotaPortugues(8.2);
		ana.setNotaGeografia(7.4);

		ana.imprimir();

		
		beto.setNome("Roberto Silva");
		carlos.setNome("Carlos Alberto");

		//System.out.println(ana.getNome());
		//System.out.println("Contador: " + RegistraAluno.getQuantidadeAlunos());

		
	}
}

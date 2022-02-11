package br.com.java.heranca;

public class TestaFuncionarios {
	
	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setNome("Gerente de Tal");
		g.setSalario(2000);
		g.setUsuario("gerente.tal");
		g.setSenha("12345");

		Telefonista t = new Telefonista();
		t.setNome("Funcionaria de Tal");
		t.setSalario(1000);
		t.setEstacaoDeTarabalho(13);

		Secretaria s = new Secretaria();
		s.setNome("Secretaria de Tal");
		s.setSalario(1500);
		s.setRamal(158);

		System.out.println("Gerente");
		System.out.println("Nome: " + g.getNome());
		System.out.println("Salário: " + g.getSalario());
		System.out.println("Usuário: " + g.getSenha());
		System.out.println("Senha: " + g.getSenha());
		System.out.println("Bonificação: " + g.calcularBonificacao());

		System.out.println("Telefonista");
		System.out.println("Nome: " + t.getNome());
		System.out.println("Salário: " + t.getSalario());
		System.out.println("Estação de trabalho: " + t.getEstacaoDeTarabalho());
		System.out.println("Bonificação: " + t.calcularBonificacao());

		System.out.println("Secretaria");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Salário: " + s.getSalario());
		System.out.println("Estação de trabalho: " + s.getRamal());
		System.out.println("Bonificação: " + s.calcularBonificacao());
	}
}

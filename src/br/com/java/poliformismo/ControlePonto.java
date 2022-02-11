package br.com.java.poliformismo;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.java.heranca.Funcionario;

public class ControlePonto {

	// O sistema do banco deve possuir um controle de ponto para 
	// registrar a entrada e saída dos funcionários.
	
	public void registrarEntrada(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Entrada: " + f.getCodigo());
		System.out.println("Data: " + sdf.format(agora));
	}

	public void registrarSaida(Funcionario f) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Saída: " + f.getCodigo());
		System.out.println("Data: " + sdf.format(agora));
	}
}

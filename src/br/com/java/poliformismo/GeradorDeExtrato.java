package br.com.java.poliformismo;


import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.java.conta.Conta;

public class GeradorDeExtrato {
	
	public void imprimirExtratoBasico(Conta c) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Saldo: " + c.getSaldo());
	}
}

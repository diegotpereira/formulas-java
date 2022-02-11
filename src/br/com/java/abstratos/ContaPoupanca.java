package br.com.java.abstratos;

import java.text.SimpleDateFormat;
import java.util.Date;


// ESSA CLASSE NÃO COMPILA
public class ContaPoupanca extends Conta{

	private int dataNascimento;

	@Override
	public void imprimirExtratoDetlhado() {
		
		System.out.println("EXTRATO DETALHADO DE CONTA POUPANÇA");

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date agora = new Date();

		System.out.println("Data: " + sdf.format(agora));
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Data de Nascimento: " + this.dataNascimento);
		
	}
	
}

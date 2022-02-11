package br.com.java.arrays;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		// Criando array
		
		int [] numeros = new int[100];
		int [] numerosA = new int []{100 ,87};
		int [] numerosB = {101, 88};

		// Modificando o array
		numeros[0] = 136;
		numeros[99] = 17;

		// Percorrendo o array
		for(int index = 0; index < 100; index++) {
			numeros[index] = index;
		}
		


		//System.out.println(numeros[99]);
		//System.out.println(numerosA[1]);
		//System.out.println(numerosB[1]);
		//System.out.println(numeros);

		imprimeArray();
		imprimeArrayForeach();

		// Ordenando um Array
		String [] nomes = new String[] {"Fulano de Tal", "Rodrigo Castro", "Jonas Manoel"};
		Arrays.sort(nomes);

		for(String nome : nomes) {
			System.out.println(nome);
		}

		// Duplicando um Array
		String [] nomesDuplicar = new String[] {"Fulano", "Beltrano", "Ciclano"};
		String [] nomesDuplicados = Arrays.copyOf(nomesDuplicar, 10);
		

		System.out.println(nomesDuplicados);

	}
	
	// recuperar a quantidade de posições de um array 
	// acessando o seu atributo length.
	public static void imprimeArray() {

		int[] numerosC = {10, 2};
		for(int index = 0; index < numerosC.length; index++) {
			//System.out.println(numerosC[index]);
		}
	}

	public static void imprimeArrayForeach() {
		int [] numerosD = {11, 3};
		for(int numero : numerosD) {
			//System.out.println(numero);
		}
	}

	
}

package br.com.java.collections;

import java.util.LinkedList;
import java.util.List;

// testar o desempenho do for tradicional e do foreach.
public class TesteContains {
	
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		int size = 100000;

		for(int index = 0; index < size; index++) {
			linkedList.add(index);
		}

		long tempo = TesteContains.forTradicional(linkedList);
		System.out.println("For tradicional: " + tempo + "ms");

		tempo = TesteContains.foreach(linkedList);
		System.out.println("Foreach: " + tempo + "ms");
	}

	public static long forTradicional(List<Integer> lista) {
		long inicio = System.currentTimeMillis();

		for(int index = 0; index < lista.size(); index++) {
			int x = lista.get(index);
		}
		long fim = System.currentTimeMillis();

		return fim - inicio;
	}

	public static long foreach(List<Integer> lista) {
		long inicio = System.currentTimeMillis();

		for(int x : lista) {

		}
		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}

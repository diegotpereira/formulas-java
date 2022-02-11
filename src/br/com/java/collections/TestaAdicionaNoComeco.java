package br.com.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaAdicionaNoComeco {
	
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		LinkedList linkedList = new LinkedList<>();

		long tempo = TestaAdicionaNoComeco.adicionaNoComeco(arrayList);
		System.err.println("ArrayList: " + tempo + "ms");

		tempo = TestaAdicionaNoComeco.adicionaNoComeco(linkedList);
		System.out.println("LinkdList: " + tempo + "ms");
	}

	public static long adicionaNoComeco(List lista) {
		long inicio = System.currentTimeMillis();

		int size = 100000;

		for(int index = 0; index < size; index++) {
			lista.add(0, index);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}

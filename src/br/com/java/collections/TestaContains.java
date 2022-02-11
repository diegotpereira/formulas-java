package br.com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaContains {
	
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		HashSet hashSet = new HashSet<>();

		long tempo = TestaContains.contains(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");

		tempo = TestaContains.contains(hashSet);
		System.out.println("HasSet: " + tempo + "ms");
	}
	public static long contains(Collection colecao) {
		int size = 100000;

		for(int index = 0; index < size; index++) {
			colecao.add(index);
		}

		long inicio = System.currentTimeMillis();

		for(int index = 0; index < size; index++) {
			colecao.contains(index);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}

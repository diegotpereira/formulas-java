package br.com.java.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteGet {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList<>();
		LinkedList linkedList = new LinkedList<>();

		long tempo = TesteGet.get(arrayList);
		System.out.println("ArrayList: " + tempo + "ms");

		tempo = TesteGet.get(linkedList);
		System.out.println("LinkdList: " + tempo + "ms");
	}
	public static long get(List lista) {
		
		int size = 100000;

		for(int index = 0; index < size; index++) {
			lista.add(index);
		}
		long inicio = System.currentTimeMillis();

		for(int index = 0; index < size; index++) {
			lista.get(index);
		}

		long fim = System.currentTimeMillis();

		return fim - inicio;
	}
}

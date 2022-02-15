package br.com.java.aplicacoesgraficas;

import java.awt.*;

public class JanelaGrid extends Frame{
	private final int rows = 3, cols = 4;
	public JanelaGrid() {
		setTitle("GridLayout");
		setSize(240, 100);
		setLayout(new GridLayout(rows, cols));
	}
	public void addButton(int contar) {
		int max = rows * cols;
		
		if(contar < max)
		   max = contar;

		for(int index = 1; index <= max; ++index)
		   add(new Button("B" + index));
	}
	public static void main(String[] args) {
		JanelaGrid j = new JanelaGrid();
		int qtde = 10;

		try {
			if(args.length > 0)
			  qtde = Integer.parseInt(args[0]);

		} catch (Exception e) {
			//TODO: handle exception
		}
		j.addButton(qtde);
		j.validate();
		j.setVisible(true);
	}
}

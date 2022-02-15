package br.com.java.aplicacoesgraficas;

import java.awt.*;

public class JanelaFlow  extends Frame{
	public JanelaFlow() {
		setTitle("FlowLayout");
		setSize(240, 100);
		setLayout(new FlowLayout());
	}
	public void addButton(int contar) {
		for(int index = 1; index <= contar; ++index) 
		add(new Button("B" + index));
	}
	public static void main(String[] args) {
		JanelaFlow j = new JanelaFlow();
		int qtde = 10;

		try {
			if(args.length > 0)
			    qtde = Integer.parseInt(args[0]);
		} catch (Exception e) {
			
		}

		j.addButton(qtde);
		j.validate();
		j.setVisible(true);
	}
}

package br.com.java.aplicacoesgraficas;

import java.awt.*;

public class JanelaBorder extends Frame{
	public JanelaBorder() {
		setTitle("BorderLayout");
		setSize(240, 100);

		add(new Button("Norte"), BorderLayout.NORTH);
		add(new Button("Sul"), BorderLayout.SOUTH);
		add(new Button("Leste"), BorderLayout.EAST);
		add(new Button("Oeste"), BorderLayout.WEST);
		add(new Button("Centro"), BorderLayout.CENTER);
	}	
	public static void main(String[] args) {
		JanelaBorder j = new JanelaBorder();
		j.validate();
		j.setVisible(true);
	}
}

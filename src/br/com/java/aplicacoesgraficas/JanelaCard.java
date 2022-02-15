package br.com.java.aplicacoesgraficas;

import java.awt.*;
import java.awt.event.*;

public class JanelaCard extends Frame{
	Panel central = new Panel();
	CardLayout c1 = new CardLayout();
	
	class FirstHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			c1.first(central);
		}
	}
	class LastHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			c1.last(central);
		}
	}
	class NextHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			c1.next(central);
		}
	}
	class PreviousHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			c1.previous(central);
		}
	}
	public JanelaCard() {
		setTitle("CardLayout");
		setSize(240, 200);

		Button proximo = new Button("Proximo");
		proximo.addActionListener(new NextHandler());

		Button anterior = new Button("Anterior");
		anterior.addActionListener(new PreviousHandler());

		Button primeiro = new Button("Primeiro");
		primeiro.addActionListener(new FirstHandler());

		Button ultimo = new Button("Ultimo");
		ultimo.addActionListener(new LastHandler());

		add(primeiro, BorderLayout.NORTH);
		add(ultimo, BorderLayout.SOUTH);
		add(anterior, BorderLayout.WEST);
		add(proximo, BorderLayout.EAST);
		add(central, BorderLayout.CENTER);

		central.setLayout(c1);

		central.add(new Label("Primeiro painel"), "Primeiro");
		central.add(new Label("Segundo painel"), "Segundo");
		central.add(new Label("Terceiro painel"), "Terceiro");
		central.add(new Label("Quarto painel"), "Quarto");
		central.add(new Label("Quinto painel"), "Quinto");
	}
	public static void main(String[] args) {
		JanelaCard j = new JanelaCard();
		j.setVisible(true);
	}
}

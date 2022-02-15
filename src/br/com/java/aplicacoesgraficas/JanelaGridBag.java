package br.com.java.aplicacoesgraficas;

import java.awt.*;
import java.awt.event.*;

public class JanelaGridBag extends Frame{
	GridBagLayout gb = new GridBagLayout();

	private final int noLinhas = 3;
	
	public JanelaGridBag() {
		setTitle("GridBagLayout");
		setSize(320, 200);
		setLayout(gb);

		List lEsq = new List(noLinhas, true);
		lEsq.add("Um");
		lEsq.add("Dois");
		lEsq.add("Tres");
		lEsq.add("Quatro");
		lEsq.add("Cinco");
		lEsq.add("Seis");
		lEsq.add("Sete");

		Button add = new Button(">>");
		Button limpar = new Button("Limpar");
		Button fechar = new Button("Fechar");

		TextArea tDir = new TextArea("", noLinhas, 10, TextArea.SCROLLBARS_NONE);

		GridBagConstraints gc = new GridBagConstraints();
		gc.gridx = 0;
		gc.gridy = 0;
		gc.gridwidth = 1;
		gc.gridheight = 3;
		gc.fill = GridBagConstraints.VERTICAL;
		add(lEsq, gc);
		gc.gridx = 2;
		add(tDir, gc);

		Insets margens = new Insets(4, 3, 4, 3);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.gridwidth = 1;
		gc.gridheight = 1;
		gc.fill = GridBagConstraints.BOTH;
		gc.ipadx = 4;
		gc.ipady = 4;
		gc.insets = margens;
		add(add, gc);
		gc.gridy = 1;
		add(limpar, gc);
		gc.gridy = 2;
		add(fechar, gc);
	}
	public static void main(String[] args) {
		JanelaGridBag jgb = new JanelaGridBag();
		jgb.setVisible(true);
	}
}

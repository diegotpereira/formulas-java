package br.com.java.aplicacoesgraficas;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class JanelaBox extends JFrame{
	public JanelaBox() {
		setTitle("BoxLayout");
		setSize(240, 120);

		Box h = Box.createHorizontalBox();
		Box v = Box.createVerticalBox();

		String [] lista = {"Um", "Dois", "Tres", "Quatro", 
		                    "Cinco", "Seis", "Sete"};
		
	    JList j1 = new JList(lista);
		j1.setFixedCellWidth(70);

		int mis = ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;
		j1.setSelectionMode(mis);

		JScrollPane lEsq = new JScrollPane(j1);
		lEsq.setMinimumSize(new java.awt.Dimension(100, 100));

		JButton add = new JButton(">>");
		JButton limpar = new JButton("Limpar");
		JButton fechar = new JButton("Fechar");
		JTextArea tDir = new JTextArea();
		v.add(add);
		v.add(limpar);
		v.add(fechar);

		h.add(lEsq);
		h.add(v);
		h.add(tDir);

		getContentPane().add(h);
	}
	public static void main(String[] args) {
		JanelaBox jb = new JanelaBox();
		jb.setVisible(true);
		jb.validate();
	}
}

package br.com.java.aplicacoesgraficas;

import java.awt.*;
import java.awt.event.*;
public class Janela extends Frame{
	
	class WindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			dispose();
			System.exit(0);
		}
		public void windowActivated(WindowEvent we) {
			we.getWindow().validate();
		}
	}
	public Janela() {
		this("Janela");
	}
	public Janela(String titulo) {
		setTitle(titulo);
		setSize(320, 200);
		addWindowListener(new WindowHandler());
	}

	public static void main(String[] args) {
		Janela j = new Janela();
		j.setVisible(true);
	}
}

package br.com.java.aplicacoesgraficas;

import javax.swing.*;
import java.awt.event.*;

public class SJanela extends JFrame{
	class WindowHandler extends WindowAdapter {
		public void windowClosing(WindowEvent we) {
			dispose();
			System.exit(0);
		}
	}
	public SJanela() {
		this("Janela");
	}
	public SJanela(String title) {
		setSize(200, 120);
		setTitle(title);
		addWindowListener(new WindowHandler());
	}
	public static void main(String[] args) {
		SJanela je = new SJanela();
		je.show();
	}
}

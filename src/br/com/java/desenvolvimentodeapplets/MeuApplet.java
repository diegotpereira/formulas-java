package br.com.java.desenvolvimentodeapplets;

import java.applet.*;

public class MeuApplet extends Applet{
	public void init() {
		System.out.println("Meu Applet inicializando com dimesão " + getSize());
	}
	public void start() {
		System.out.println("Meu Applet deve executar");
	}
	public void stop() {
		System.out.println("Meu Applet deve parar");
	}
	public void destroy() {
		System.out.println("Adeus, Meu Applet");
	}
}

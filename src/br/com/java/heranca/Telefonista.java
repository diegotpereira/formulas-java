package br.com.java.heranca;

public class Telefonista extends Funcionario{
	
	private int estacaoDeTarabalho;
	private int ramal;

	public int getEstacaoDeTarabalho() {
		return estacaoDeTarabalho;
	}

	public void setEstacaoDeTarabalho(int estacaoDeTarabalho) {
		this.estacaoDeTarabalho = estacaoDeTarabalho;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
}

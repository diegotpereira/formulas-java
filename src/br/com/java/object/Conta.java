package  br.com.java.object;

public class Conta {
	
	private int numero;
	private double saldo;

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	//  descrição textual dos objetos da classe 
	//public String gerarDescricao() {

	//	return "Conta número: " + this.numero + " possui saldo a " + this.saldo;
	//}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}

	// metodo equals
	public boolean compara(Conta outra) {
		return this.numero == outra.numero;
	}

	public boolean equals(Object obj) {
		Conta outra = (Conta) obj;

		return this.numero == outra.numero;
	}
}

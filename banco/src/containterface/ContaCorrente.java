package containterface;

public class ContaCorrente implements ContaTributavel {

	private double saldo;

	public double getSaldo() {
		return this.saldo;
	}

	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
	
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}

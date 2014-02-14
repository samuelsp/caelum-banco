package br.com.caelum.banco.conta;

import br.com.caelum.banco.sistema.ValorInvalidoException;

public abstract class Conta {

	protected double saldo;
	private double numero;
	private String nome;
		

	public void setNumero(double numero) {
		this.numero = numero;
	}

	public double getNumero() {
		return this.numero;
	}
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(numero);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (Double.doubleToLongBits(numero) != Double
				.doubleToLongBits(other.numero))
			return false;
		return true;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public abstract void atualiza(double taxa);

	public String toString() {
		return "O saldo atual de sua conta é " + this.saldo + ".";
	}

	void saca(double valor) {
		this.saldo -= valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}

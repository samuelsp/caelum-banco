package br.com.caelum.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{	
	
	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNome().compareTo(o.getNome());
	}
		
	/*
	@Override
	public int compareTo(ContaPoupanca o) {
		return (int) (o.getNumero() - this.getNumero());
	}
	*/
}

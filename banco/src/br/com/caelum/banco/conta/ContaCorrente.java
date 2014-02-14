package br.com.caelum.banco.conta;

import br.com.caelum.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel, Comparable<Conta> {
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;

	}

	@Override
	public int compareTo(Conta o) {
		if(this.getNumero() < o.getNumero())
			return -1;		
		else if(this.getNumero() > o.getNumero())
			return 1;		
		else
			return 0;
	}

	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}

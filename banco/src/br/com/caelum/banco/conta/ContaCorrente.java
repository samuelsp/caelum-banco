package br.com.caelum.banco.conta;

import br.com.caelum.banco.sistema.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;

	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}

}

package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaPoupanca;
import br.com.caelum.banco.sistema.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
	}
}

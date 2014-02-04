package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();

		c1.setNumero(12);
		c2.setNumero(12);
		c1.setNome("Maria");
		c2.setNome("Maria");

		if (c1 == c2) {
			System.out.println("São iguais.");
		} else {
			System.out.println("Não são iguais.");
		}

		System.out.println(c1.equals(c2) ? "São iguais." : "Não são iguais.");

	}

}

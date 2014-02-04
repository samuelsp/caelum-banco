package br.com.caelum.banco;

import br.com.caelum.banco.conta.ContaCorrente;
import br.com.caelum.banco.sistema.GerenciadorDeImpostoDeRenda;
import br.com.caelum.banco.sistema.SeguroDeVida;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);

		System.out.printf("O valor total de tributos pagos é: %.2f",
				gerenciador.getTotal());

	}
}

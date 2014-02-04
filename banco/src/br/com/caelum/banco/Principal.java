package br.com.caelum.banco;

import br.com.caelum.banco.conta.Conta;
import br.com.caelum.banco.conta.ContaCorrente;

/**
 * Classe Principal do sistema Banco
 * 
 * @author Samuel Silva Pereira da Cunha
 *
 */

public class Principal {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();		
		try {
			conta.deposita(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(conta.getSaldo());
		System.out.println(conta);

	}

}

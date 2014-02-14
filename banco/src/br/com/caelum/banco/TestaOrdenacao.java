package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.Random;

import br.com.caelum.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new ArrayList<ContaPoupanca>();
				
		ContaPoupanca c1 = new ContaPoupanca(); 
		c1.setNumero(1973);
		c1.setNome("Rodrigo");
		contas.add(c1);
				
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		c2.setNome("Marcos");
		contas.add(c2);
		  
		ContaPoupanca c3 = new ContaPoupanca(); 
		c3.setNome("Samuel");
		c3.setNumero(1854);
		contas.add(c3);		 

		/*
		for (int i = 0; i < 20; i++) {
			ContaPoupanca cp = new ContaPoupanca();
			cp.setNumero(new Random().nextInt(1000));
			contas.add(cp);
		}
		*/

		// ordena do menor para o maior
		Collections.sort(contas);

		// ordena do maior para o menor
		//Collections.reverse(contas);

		// embaralha todos os elementos de uma lista
		//Collections.shuffle(contas);

		// rotaciona os elementos de uma lista
		// Collections.rotate(contas, -1);

		for (int i = 0; i < contas.size(); i++) {			
			System.out.println("numero: " + contas.get(i).getNome());
		}

	}
}

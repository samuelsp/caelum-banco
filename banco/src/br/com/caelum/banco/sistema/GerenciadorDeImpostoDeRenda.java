package br.com.caelum.banco.sistema;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionado tributável: "+t);		
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
	}

}

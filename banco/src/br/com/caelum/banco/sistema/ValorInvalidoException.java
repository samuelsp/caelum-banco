package br.com.caelum.banco.sistema;
@SuppressWarnings("serial")

/**
 * Classe que lança uma exceção para valores negativos inseridos no método deposita da classe Conta
 * 
 * @author Samuel Silva Pereira da Cunha
 *
 */

public class ValorInvalidoException extends RuntimeException {
	/**
	 * Retorna uma string e o valor inválido
	 * 
	 * @param valor
	 */
	
	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}
	
	/**
	 * 
	 * Retorna uma string para valores inválidos
	 * 
	 * @param message
	 */
	
	ValorInvalidoException(String message) {
		super(message);
	}

}

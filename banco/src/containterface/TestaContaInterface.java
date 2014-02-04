package containterface;

public class TestaContaInterface {
	public static void main(String[] args) {
		ContaTributavel ct = new ContaCorrente();
		ct.deposita(1000);
		ct.atualiza(0.02);
		ct.calculaTributos();
		System.out.println(ct.getSaldo());
		
		Conta cp = new ContaPoupanca();
		cp.deposita(1000);
		cp.atualiza(0.01);
		cp.saca(100);		
		System.out.println(cp.getSaldo());
	}
	

}

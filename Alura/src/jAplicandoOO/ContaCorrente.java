package jAplicandoOO;

public class ContaCorrente extends ContaBancaria {
	
	
	
	public ContaCorrente(int numeroConta, String titular) {
		super(numeroConta, titular);
		// TODO Auto-generated constructor stub
	}

	public void cobrarTarifaMensal () {
		sacar(15.5);
	}
	

}

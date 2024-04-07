package jAplicandoOO;

public class ContaBancaria {

	private int numeroConta;
	private double saldo;
	private String titular;
		
	public ContaBancaria(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public void depositar(double valor) {
		
		System.out.println("Novo saldo R$ " + (this.saldo += valor));
	}
	
	public void sacar (double valor) {
		if (this.saldo < valor) {
			System.out.println("Saldo insuficiente.");
		} else {
			this.saldo -= valor;
			System.out.println("Saque efetuado. Novo saldo R$ " + this.saldo);
		}
	}
	
	public void consultarSaldo() {
		System.out.println("O saldo é R$ " + this.saldo);
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}

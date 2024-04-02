package jEntendentoOO;

public class Conta {
	
	private int agencia;
	private int nrConta;
	private Cliente titular;
	private double saldo;
	private static int totalContas;
	
	public Conta (int agencia, int nrConta) {
		Conta.totalContas++;
		this.agencia = agencia;
		this.nrConta = nrConta;
			
	}
	
	public void deposita(double valor){
		
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere (double valor, Conta contaDestino) {
		
		if (saca(valor)) {
			contaDestino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void atribuirCliente(Cliente clienteTitular) {
		
		this.setTitular(clienteTitular);		
		
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência não pode ser negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNrConta() {
		return this.nrConta;
	}

	public void setNrConta(int nrConta) {
		if (nrConta <= 0) {
			System.out.println("O número da conta não pode ser negativo");
			return;
		}
		this.nrConta = nrConta;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static 
	
	int getTotalContas () {
		return Conta.totalContas;
	}


	
	
}

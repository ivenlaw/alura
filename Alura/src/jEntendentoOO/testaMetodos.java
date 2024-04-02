package jEntendentoOO;

public class testaMetodos {
	
	public static void main(String[] args) {
		
		Cliente artur = new Cliente();
		artur.cadastraCliente("Artur Viana", "111.111.111-11", "bancario");
		
		Cliente fabricio = new Cliente();
		fabricio.cadastraCliente("Fabricio Mendes", "222.2222.222-22", "jornalista");
		
		Conta contaUm = new Conta(0001, 0100);
		contaUm.atribuirCliente(artur);
		contaUm.deposita(200);
		
		System.out.println("O saldo inicial da contaUm é R$ " + contaUm.getSaldo());
		
		Conta contaDois = new Conta(0001, 0200);
		contaDois.atribuirCliente(fabricio);
		contaDois.deposita(500);
		
		System.out.println("O saldo inicial da contaDois é R$ " + contaDois.getSaldo());
	
		
		contaUm.deposita(5000);
		System.out.println("O saldo da contaUm depois do depósito é R$ " + contaUm.getSaldo());
		
		contaDois.saca(300);
		System.out.println("O saldo da contaDois depois do saque é R$ " + contaDois.getSaldo());
		
		contaUm.transfere(1000, contaDois);
		System.out.println("Referente a conta de " + contaUm.getTitular().getNome() + " o saldo depois da transferência é R$ " + contaUm.getSaldo());
		System.out.println("Referente a conta de " + contaDois.getTitular().getNome() + " o"
				+ " saldo depois da transferência é R$ " + contaDois.getSaldo());
	
		contaUm.getTitular().setNome("Artur Moreira Viana");
		System.out.println("O titular da contaUm é " + contaUm.getTitular().getNome());
		
		System.out.println("O total de contas abertas é " + Conta.getTotalContas());
	}

}

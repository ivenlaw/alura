package jEntendentoOO;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String profissao;

	
	public Cliente cadastraCliente (String novoNome, String novoCpf, String novaProfissao) {
		
		Cliente novoCliente = new Cliente ();
		this.setNome(novoNome);
		this.cpf = novoCpf;
		this.profissao = novaProfissao;
		
		return novoCliente;
		
	}

	public String getNome() {
		return this.nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getProfissao() {
		return this.profissao;
	}


	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}

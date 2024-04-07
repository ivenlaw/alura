package jTrabalhandoComListas;

public class ProdutoPerecivel extends Produto {
	
	private String dataValidade;

	public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
		super(nome, preco, quantidade);
		// TODO Auto-generated constructor stub
		this.setDataValidade(dataValidade);
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

}

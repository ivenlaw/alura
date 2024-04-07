package jAplicandoOO;

public class Produto {
	
	private String nome;
	private double preco;
	
	public void aplicarDesconto(double percentual) {
		this.preco -= (this.preco * percentual / 100); 
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}

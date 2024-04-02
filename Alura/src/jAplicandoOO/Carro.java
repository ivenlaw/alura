package jAplicandoOO;

public class Carro {
	
	private String modelo;
	private int ano;
	private String cor;
	
	public Carro (String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	
	public double idadeCarro() {
		return (2024 - this.ano);
	}

	public void fichaTecnica() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Cor: " + this.cor);
		System.out.println("Idade do carro: " + this.idadeCarro());
	}
}

package jAplicandoOO;

public class Carro {
	
	private String modelo;
	private int ano;
	private String cor;
	private double precoAno1;
	private double precoAno2;
	private double precoAno3;
	
	
	public Carro (String modelo, int ano, String cor) {
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
	}
	
	public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
		this.precoAno1 = precoAno1;
		this.precoAno2 = precoAno2;
		this.precoAno3 = precoAno3;
	}
	
	public double idadeCarro() {
		return (2024 - this.ano);
	}

	public void fichaTecnica() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Cor: " + this.cor);
		System.out.println("Idade do carro: " + this.idadeCarro());
		System.out.println("Preço do Ano 1: " + this.precoAno1);
		System.out.println("Preço do Ano 2: " + this.precoAno2);
		System.out.println("Preço do Ano 3: " + this.precoAno3);
		System.out.println("Menor preço: " + this.calcularMenorPreco());
		System.out.println("Maior preço: " +
		this.calcularMaiorPreco());
	}
	
	private double calcularMenorPreco () {
		double menorPreco = this.precoAno1;
		
		if (this.precoAno2 < menorPreco) {
			menorPreco = this.precoAno2;
		} 
		if (this.precoAno3 < menorPreco) {
			menorPreco = this.precoAno3;
		}
		
		return menorPreco;
	}
	
	private double calcularMaiorPreco () {
		double maiorPreco = this.precoAno1;
		
		if (this.precoAno2 > maiorPreco) {
			maiorPreco = this.precoAno2;
		}
		if (this.precoAno3 > maiorPreco) {
			maiorPreco = this.precoAno3;
		}
		
		return maiorPreco;
	}
}

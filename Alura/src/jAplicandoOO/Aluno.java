
package jAplicandoOO;

public class Aluno {

	private String nome;
	private int idade;
	private double nota1;
	private double nota2;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void fichaAluno() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
	
	public double calcularMedia() {
		return (this.nota1 + this.nota2)/2;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}
	
	
}


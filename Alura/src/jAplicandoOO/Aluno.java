package jAplicandoOO;

public class Aluno {

	private String nome;
	private int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void fichaAluno() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
	}
}

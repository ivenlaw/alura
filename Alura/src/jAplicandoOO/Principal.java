package jAplicandoOO;

public class Principal {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.saudacao();
		
		Calculadora numero = new Calculadora();
		System.out.println(numero.dobroNumero(4)); 
		
		Musica musicaUm = new Musica("Oceano", "Djavan", 1989);
		musicaUm.avalia(8.5);
		musicaUm.avalia(10);
		musicaUm.fichaTecnica();
		
		Carro carroUm = new Carro ("Uno", 1985, "azul");
		carroUm.fichaTecnica();
		
		Aluno alunoUm = new Aluno ("Alfredo Borba", 10);
		Aluno alunoDois = new Aluno ("Marcos Dias", 14);
		alunoUm.fichaAluno();
		alunoDois.fichaAluno();
		
	}	
}

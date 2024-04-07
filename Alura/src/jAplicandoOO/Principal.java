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
		carroUm.definirPrecos(14500.90, 48051.50, 79500.40);
		carroUm.fichaTecnica();
		
		Aluno alunoUm = new Aluno ("Alfredo Borba", 10);
		Aluno alunoDois = new Aluno ("Marcos Dias", 14);
		alunoUm.fichaAluno();
		alunoDois.fichaAluno();
		alunoUm.setNota1(4.5);
		alunoUm.setNota2(10);
		System.out.println(alunoUm.getNome() + " tem média " + alunoUm.calcularMedia());
		
		ContaCorrente fichaConta = new ContaCorrente(1565, "Monica Tavares");
		fichaConta.depositar(145.78);
		System.out.println("Titular:" + fichaConta.getTitular());
		System.out.println("Numero de conta: " + fichaConta.getNumeroConta());
		fichaConta.consultarSaldo();
		fichaConta.sacar(500);
		fichaConta.sacar(50);
		fichaConta.cobrarTarifaMensal();
		fichaConta.consultarSaldo();
		
		IdadePessoa pessoa1 = new IdadePessoa("Monica", 25);
		System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
		System.out.println(pessoa1.verificarIdade());
		pessoa1.setNome("Rafaela");
		pessoa1.setIdade(12);
		System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
		System.out.println(pessoa1.verificarIdade());
		
		Produto produto = new Produto();
		produto.setNome("Arroz");
		produto.setPreco(10.75);
		System.out.println("O " + produto.getNome() + " custa R$ " + produto.getPreco());
		produto.aplicarDesconto(10);
		System.out.println("Depois do desconto o " + produto.getNome() + " custa R$ " + produto.getPreco());
		
		Livro livro = new Livro();
		livro.setTitulo("A lógica do jogo");
		livro.setAutor("Marcus Becker");
		livro.exibirDetalhes();
		
		Cachorro cachorro = new Cachorro();
		cachorro.emitirSom();
		cachorro.abanarRabo();
		
		Gato gato = new Gato();
		gato.emitirSom();
		gato.arranhaMoveis();
		
		ConversorMoeda real = new ConversorMoeda();
		real.converterDolarParaReal(100.00);
		
		CalculadoraSalaRetangular areaSala = new CalculadoraSalaRetangular();
		areaSala.calcularArea(3.5, 7);
		areaSala.calcularPerimetro(3.5, 7);
				
		TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
		tabuada.mostrarTabuada(5);
	}	
}

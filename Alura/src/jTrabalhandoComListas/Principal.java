package jTrabalhandoComListas;

import java.util.ArrayList;


import jEntendentoOO.Circulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**** QUESTAO 1 unidade 2 **** \n");
		
		ArrayList<Pessoa> listaDePessoa = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa("Vanessa Lima", 18);
		Pessoa pessoa2 = new Pessoa("Marcos Dias", 25);
		Pessoa pessoa3 = new Pessoa("Mirtes Joanes", 22);
		
		listaDePessoa.add(pessoa1);
		listaDePessoa.add(pessoa2);
		listaDePessoa.add(pessoa3);
		
		System.out.println("Tamanho da lista: " + listaDePessoa.size());
		
		System.out.println("Primeira Pessoa: " + listaDePessoa.get(0));
		
		System.out.println("Lista de Pessoas: ");
		for (Pessoa pessoas : listaDePessoa) {
			System.out.println(pessoas);
		}
		
		System.out.println("\n\n**** QUESTAO 2  unidade 2 **** \n");
		
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto produto1 = new Produto ("Maizena", 23.50, 3);
		Produto produto2 = new Produto ("Qboa", 3.50, 5);
		Produto produto3 = new Produto ("Macarrão", 7.80, 3);
		
		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);
		
		System.out.println("O tamanho da lista de produtos é: " + listaDeProdutos.size());
		System.out.println("O segundo produto da lista é " + listaDeProdutos.get(1).getNome());
		
		System.out.println("\n\n**** QUESTAO 4  unidade 2 **** \n");
		
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Alface", 4.90, 8, "10/04/2024");
		System.out.println("O " + produtoPerecivel.getNome() + " custa R$ " + produtoPerecivel.getPreco() + " e temos no estoque " + produtoPerecivel.getQuantidade() + " com validade até " + produtoPerecivel.getDataValidade());
		System.out.println(produtoPerecivel);
		
		System.out.println("\n\n**** QUESTAO 1  unidade 3 **** \n");
		
		for (Produto item : listaDeProdutos) {
			System.out.println(item.getNome());
		}
		
		System.out.println("\n\n**** QUESTAO 2  unidade 3 **** \n");
		
		Cachorro cao1 = new Cachorro("Pastor");
		Animal animal = (Animal) cao1;
		System.out.println(animal.getNome());
 
		System.out.println("\n\n**** QUESTAO 3  unidade 3 **** \n");
		
		Animal cao2 = new Cachorro("Pastor");
		if (cao2 instanceof Cachorro) {
			Cachorro cao3 = (Cachorro) cao2;
			System.out.println(cao3.getNome());
		} else {
			System.out.println("O Objeto não é um cachorro.");
		}

		System.out.println("\n\n**** QUESTAO 4  unidade 3 **** \n");
		
		double somaPreco = 0;
		for (Produto produtos : listaDeProdutos) {
			somaPreco += produtos.getPreco();
		}
		
		double precoMedio = somaPreco/listaDeProdutos.size();
		System.out.println("O Preço médio dos produtos é R$ " + precoMedio);
		
		System.out.println("\n\n**** QUESTAO 5  unidade 3 **** \n");
		
		Circulo circulo = new Circulo();
		circulo.setRaio(5);
		
		Quadrado quadrado = new Quadrado();
		quadrado.setLado(8);
		
		ArrayList<Forma> formas = new ArrayList<>();
		formas.add(quadrado);
		formas.add(circulo);
		
		for(Forma itens : formas) {
			System.out.println(itens.calcularArea());			
		}
		
		System.out.println("\n\n**** QUESTAO 6  unidade 3 **** \n");
		
		ContaBancaria conta1 = new ContaBancaria("1452", 147.52);
		ContaBancaria conta2 = new ContaBancaria("1478", 481.78);
		ContaBancaria conta3 = new ContaBancaria("1456", 3259.45);
		ContaBancaria conta4 = new ContaBancaria("1496", 14.52);
		ContaBancaria conta5 = new ContaBancaria("1487", 174.14);
		
		ArrayList<ContaBancaria> listaContas = new ArrayList<>();
		listaContas.add(conta1);
		listaContas.add(conta2);
		listaContas.add(conta3);
		listaContas.add(conta4);
		listaContas.add(conta5);
		
		ContaBancaria maiorSaldo = listaContas.get(0);		
		for(ContaBancaria saldo : listaContas) {
			if(saldo.getSaldo() > maiorSaldo.getSaldo()) {
				maiorSaldo = saldo;
			}
		}
		
		System.out.println("A conta com o maior saldo é a número " + maiorSaldo.getNumeroConta() + " com o saldo de R$ " + maiorSaldo.getSaldo());
		
		System.out.println("\n\n**** QUESTAO 1  unidade 4 **** \n");
		
		
		
		
		
		
		
		
		
	}

	
}

package jCriandoPrimApp;

public class Desconto {

	public static void main(String[] args) {
		double precoOriginal = 333.99;
		double percentualDesconto = 5;
		
		System.out.println("O preço com desconto é R$ " + (precoOriginal - (precoOriginal*percentualDesconto/100)));
	}
}

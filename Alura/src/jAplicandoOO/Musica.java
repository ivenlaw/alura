package jAplicandoOO;

public class Musica {

	private String titulo;
	private String artista;
	private int anoLancamento;
	private double avaliacao;
	private int numAvaliacoes;

	
	public Musica(String titulo, String artista, int anoLancamento) {
		this.titulo = titulo;
		this.artista = artista;
		this.anoLancamento = anoLancamento;
	}

	public void avalia (double nota) {
		numAvaliacoes++;
		this.avaliacao += nota;
	}
	
	public double mediaAvalacoes() {
		return (this.avaliacao / this.numAvaliacoes);
	}
	
	public void fichaTecnica() {
		System.out.println("Título: " + this.titulo);
		System.out.println("Artista: " + this.artista);
		System.out.println("Ano de Lancamento: " + this.anoLancamento);
		System.out.println("Avaliação média: " + this.mediaAvalacoes() + " num total de " + this.numAvaliacoes + " avalações.");
	}
	
	
}

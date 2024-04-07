package jTrabalhandoComListas;

public class Quadrado implements Forma {

	private double lado;
	
	
	
	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

}

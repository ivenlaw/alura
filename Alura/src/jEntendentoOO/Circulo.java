package jEntendentoOO;

import jTrabalhandoComListas.Forma;

public class Circulo implements Forma {

	private double raio;
	
	
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;

	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

}

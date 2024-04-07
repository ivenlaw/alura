package jAplicandoOO;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

	@Override
	public void calcularArea(double altura, double largura) {
		// TODO Auto-generated method stub
		double area = altura * largura;
		System.out.println("A área da sala é " + area);
		
	}

	@Override
	public void calcularPerimetro(double altura, double largura) {
		// TODO Auto-generated method stub
		double perimetro = (altura + largura) * 2;
		System.out.println("O perímero da sala é " + perimetro);
		
	}

}

package jAplicandoOO;

public class TabuadaMultiplicacao implements Tabuada {

	@Override
	public void mostrarTabuada(int numero) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 11; i++) {
			System.out.println(numero + " * " + i + " = " + (numero*i));
		}
	}

}

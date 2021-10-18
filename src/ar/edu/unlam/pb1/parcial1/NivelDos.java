package ar.edu.unlam.pb1.parcial1;

public class NivelDos extends Nivel{
    Integer matrizDeNivel[][]= new Integer[10][10];
    Integer puntos = 3000;

	public NivelDos() {
		super.setMatriz(matrizDeNivel);
		super.setPuntos(puntos);
	}
    
}

package ar.edu.unlam.pb1.parcial1;

public class NivelTres extends Nivel {
    Integer matrizDeNivel[][]= new Integer[12][12];
    Integer puntos = 4000;

	public NivelTres() {
		super.setMatriz(matrizDeNivel);
		super.setPuntos(puntos);
	}
    


}
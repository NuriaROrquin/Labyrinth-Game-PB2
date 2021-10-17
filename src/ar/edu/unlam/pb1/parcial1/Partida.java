package ar.edu.unlam.pb1.parcial1;

public class Partida {
    
	Nivel nivelActual;
	Jugador nuevoJugador;
	

	public Partida(String nombre) {
		this.nuevoJugador = new Jugador(nombre);
	}
	
	public void ElegirNivel(int nivel) {
		if(nivel == 1) {
			this.nivelActual = new NivelUno();
			
		}
		if(nivel == 2) {
			this.nivelActual = new NivelDos();
			
		}
		if(nivel == 3) {
			this.nivelActual = new NivelTres();
			
		}
		nivelActual.pintarMatrizAleatoriamente();
	}
	
	public Boolean seMueveElJugador(char tecla) {
		
		int[][] solucion = nivelActual.getSolucion();
		
		Boolean resultado = nuevoJugador.mover(tecla, solucion);
		
		return resultado;
		
	}
}

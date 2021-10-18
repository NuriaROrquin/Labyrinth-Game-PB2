package ar.edu.unlam.pb1.parcial1;

public class Partida {
    
	Nivel nivelActual;
	Jugador nuevoJugador;
	Integer vidasActual = 3;
	Boolean ganoPartida;
	Integer puntosIniciales;
	
	public Partida(String nombre) {
		this.nuevoJugador = new Jugador(nombre);
	}
	
	public void ElegirNivel(Integer nivel) {
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
	
}

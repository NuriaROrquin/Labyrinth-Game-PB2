package ar.edu.unlam.pb1.parcial1;

public class Partida {
    
	Nivel nivelActual;
	Jugador nuevoJugador;
	Integer vidasActual = 3;
	Boolean ganoPartida;
	Integer puntosPorVida = vidasActual * 2000;

	public Partida() {
		// TODO Auto-generated constructor stub
	}
	
	public Partida(String nombre, Integer vidasActual, Boolean ganoPartida) {
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

	public boolean terminarJuego (boolean ganoPartida){
		
		if (vidasActual >= 1){
			System.out.println("Felicidades ganaste con " + vidasActual + " vidas y " + puntosPorVida + " puntos");
		return ganoPartida;
		}
		else{
			System.out.println("Que lastima, te has quedado sin vidas, vuelve a intentarlo");
			return false;
		}
		
	}
}

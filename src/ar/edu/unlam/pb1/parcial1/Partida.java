package ar.edu.unlam.pb1.parcial1;

public class Partida {
    
	Nivel nivelActual;
	Jugador nuevoJugador;
	Jugador vidasActual;
	Integer puntosPorVida;
	

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

	public void terminarJuego (Integer vidasActual){
		puntosPorVida = vidasActual * 2000;
		if (vidasActual >= 1){
			System.out.println("Felicidades ganaste con " + vidasActual + " vidas y " + puntosPorVida + " puntos");
		}
		if(vidasActual == 0){
			System.out.println("Que lastima, te has quedado sin vidas, vuelve a intentarlo");
		}
	}
}

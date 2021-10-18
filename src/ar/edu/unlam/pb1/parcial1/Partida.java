package ar.edu.unlam.pb1.parcial1;

public class Partida {
    
	Nivel nivelActual;
	Jugador nuevoJugador;
	int direccion = 1;
	Boolean ganoPartida;
	Integer vida;


	public Partida() {
		// TODO Auto-generated constructor stub
	}	

	public Partida(String nombre, Integer vidasActual, Boolean ganoPartida) {
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


	public void terminarJuego (){
		
		if (!nuevoJugador.getSinVida()){
			System.out.println("Felicidades! Ganaste!");
		
		}
		else{
			System.out.println("Que lastima, te has quedado sin vidas, vuelve a intentarlo");
			
		}
		
	}
	
	

}

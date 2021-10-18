package ar.edu.unlam.pb1.parcial1;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre, null, null);
		
		nuevaPartida.ElegirNivel(1);
		
		do {
			ingresarLetra(teclado, nuevaPartida.nuevoJugador, nuevaPartida);
		} while (!nuevaPartida.nuevoJugador.getTriunfo() && nuevaPartida.nuevoJugador.getVidas() >= 1);
		
		if(nuevaPartida.nuevoJugador.getTriunfo()) {
			System.out.println("Ganaste!");
		} else {
			System.out.println("Perdistee");
		}
		
		
	}

	private static void ingresarLetra(Scanner teclado, Jugador uno, Partida nuevaPartida) {
		System.out.println("Ingrese una tecla");
		
		char teclaIngresada = teclado.nextLine().charAt(0);
		
		
		if(uno.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion())) {
			System.out.println("Vas bien!");
		}else if(!uno.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion()) && !uno.getTriunfo()) {
			System.out.println("Chocaste con obstaculo");
			nuevaPartida.nuevoJugador.restarVidaAlChocarConObstaculo();
		}else {
			
		}
		
	}

}

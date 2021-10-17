package ar.edu.unlam.pb1.parcial1;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		
		nuevaPartida.ElegirNivel(1);
		
		Jugador uno = new Jugador(nombre);
		
		if (nuevaPartida.seMueveElJugador('s')) {
		
			System.out.println("Se Pudo");
		} else {
			System.out.println("No se pudo");
		}
		
	}

}

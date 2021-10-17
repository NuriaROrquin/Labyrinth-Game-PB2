package ar.edu.unlam.pb1.parcial1;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre, null, null);
		
		nuevaPartida.ElegirNivel(1);
		
		Jugador uno = new Jugador(nombre);
		
		ingresarLetra(teclado, uno, nuevaPartida);
		
	}

	private static void ingresarLetra(Scanner teclado, Jugador uno, Partida nuevaPartida) {
		System.out.println("Ingrese una tecla");
		
		char teclaIngresada = teclado.nextLine().charAt(0);
		
		if(uno.getVidas() > 1 && uno.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion())) {

			System.out.println("Se Pudo mover");
			
			ingresarLetra(teclado, uno, nuevaPartida);

		}else {
			System.out.println("No se pudo mover");
			System.out.println("Se acabaron tus vidas");
		}
				
		
		
	}

}

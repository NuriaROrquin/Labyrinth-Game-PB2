package ar.edu.unlam.pb1.parcial1;

import java.util.Scanner;

public class MainTest {
	
	static Scanner teclado = new Scanner(System.in);
	
	private static final int EMPEZAR_JUEGO = 1, SALIR = 9;

	public static void main(String[] args) {
		
		Integer opcionIngresada;
		String nombre = "";
		Integer nivelActual = 0;
		
		do {
			mostrarMenu();
			opcionIngresada = teclado.nextInt();
			determinarAccionARealizar(opcionIngresada, nombre, nivelActual);
		}while (opcionIngresada!=9);
		
	}
	
	private static void determinarAccionARealizar(Integer opcionIngresada, String nombre, Integer nivelActual) {
		switch(opcionIngresada) {
		case EMPEZAR_JUEGO:
			System.out.println("Ingresa tu nombre");
			nombre = teclado.next();
			System.out.println("Hola " + nombre + "!");
			System.out.println("Vamos a jugar!");
			Partida nuevaPartida = new Partida(nombre);
			System.out.println("En que nivel queres jugar? 1, 2 o 3?");
			elegirNivel(nuevaPartida, nivelActual);
			dibujarMatriz(nuevaPartida);
			pedirLetra(nuevaPartida);
			break;
		case SALIR:
			break;
		}
	}

	private static void pedirLetra(Partida nuevaPartida) {
		do {
			ingresarLetra(nuevaPartida);
		} while (!nuevaPartida.nuevoJugador.getTriunfo() && nuevaPartida.nuevoJugador.getVidas() >= 1);

		obtenerEstadoDeFinalizacion(nuevaPartida);
	}

	private static void dibujarMatriz(Partida nuevaPartida) {
		if(nuevaPartida.nivelActual.getSePuedeDibujarLaMatriz()) {
			pintarSolucion(nuevaPartida.nivelActual.getSolucion(), nuevaPartida.nivelActual.getN());
		}
	}

	private static void mostrarMenu() {
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println(EMPEZAR_JUEGO + " - Empezar el juego");
		System.out.println(SALIR + " - Salir");
		System.out.println("************************");
	}

	private static void elegirNivel(Partida nuevaPartida, Integer nivelActual) {
		nivelActual = teclado.nextInt();
		nuevaPartida.ElegirNivel(nivelActual);
	}

	private static void obtenerEstadoDeFinalizacion(Partida nuevaPartida) {
		if(nuevaPartida.nuevoJugador.getTriunfo()) {
			System.out.println("Ganaste! Tus puntos son " + nuevaPartida.nivelActual.getPuntos());
			System.out.println("Jugamos de nuevo?");
		} else {
			System.out.println("Perdiste todas tus vidas :(");
		}
	}

	private static void pintarSolucion(int[][] sol, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
            	System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

	private static void ingresarLetra(Partida nuevaPartida) {
		System.out.println("Ingrese una tecla");
		
		char teclaIngresada = teclado.next().charAt(0);
		
		Boolean seMovio = nuevaPartida.nuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		
		if(seMovio) {
			System.out.println("Vas bien!");
		}else if(!seMovio && !nuevaPartida.nuevoJugador.getMovimientoInvalido() && !nuevaPartida.nuevoJugador.getTriunfo()) {
			System.out.println("Chocaste con obstaculo");
			nuevaPartida.nuevoJugador.restarVidaAlChocarConObstaculo();
			nuevaPartida.nivelActual.descontarPuntos();
		}else if(nuevaPartida.nuevoJugador.getMovimientoInvalido()) {
			System.out.println("No podes moverte a ese lugar por que no hay posicion");
		}
		
	}

}

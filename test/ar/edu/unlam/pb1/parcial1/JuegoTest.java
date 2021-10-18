package ar.edu.unlam.pb1.parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
<<<<<<< Updated upstream
=======
	
	@Test
	public void queElegiCorrectamenteElNivel2(){
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		Jugador NuevoJugador = new Jugador(nombre);
		nuevaPartida.ElegirNivel(2);
		
		char teclaIngresada = 83;
		Boolean resultadoMover = NuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		Integer valorEsperado = 10;
		Integer valorObtenido = NuevoJugador.obtenerTamañoMatriz();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	
	@Test
	public void queElegiCorrectamenteElNivel3(){
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		Jugador NuevoJugador = new Jugador(nombre);
		nuevaPartida.ElegirNivel(3);
		
		char teclaIngresada = 83;
		Boolean resultadoMover = NuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		Integer valorEsperado = 12;
		Integer valorObtenido = NuevoJugador.obtenerTamañoMatriz();
		
		assertEquals(valorEsperado,valorObtenido);
		
	}
	
	@Test
	public void queElJugadorLeQuedenDosVidas() {
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		Jugador NuevoJugador = new Jugador(nombre);
		nuevaPartida.ElegirNivel(1);
		
		char teclaIngresada = 83;
		Boolean resultadoMover = NuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		char teclaIngresada2 = 68;
		Boolean resultadoMover2 = NuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		
		Integer valorEsperado = 2;
		Integer valorObtenido = NuevoJugador.restarVidaAlChocarConObstaculo();
		
		assertEquals(valorEsperado,valorObtenido);
	}*/
	
	

>>>>>>> Stashed changes

}

package ar.edu.unlam.pb1.parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoTest {

	@Test
	public void sePuedeCrearUnJugador() {
		Jugador NuevoJugador = new Jugador("Juan");
		assertNotNull(NuevoJugador);
	}
	
	@Test
	public void sePuedeCrearUnaPartida() {
		String nombre = "Juan";
		Partida nuevaPartida = new Partida(nombre);
		assertNotNull(nuevaPartida);
	}
	
	@Test
	public void elJugadorseMovio(){
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		nuevaPartida.ElegirNivel(1);
		
		char teclaIngresada = 83;
		
		Boolean valorEsperado = true;	
		Boolean valorObtenido = nuevaPartida.nuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		//la matriz solucion es random. Se esta moviendo para abajo, asi que cuando en la matriz solucion hay un uno en la posicion de abajo, el test es exitoso.
		
		assertEquals(valorEsperado,valorObtenido);
	}

	@Test
	public void queAlChocarConUnObstaculoSeResteUnaVida() {
		String nombre = "Juan";
		Partida partida = new Partida(nombre);
		Integer valorEsperado = 2;
		
		partida.nuevoJugador.restarVidaAlChocarConObstaculo();
		
		Integer valorObtenido = partida.nuevoJugador.getVidas();
		
		assertEquals(valorEsperado, valorObtenido);	
	}
		
	public void queElegiCorrectamenteElNivel1(){
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		nuevaPartida.ElegirNivel(1);
		
		Integer valorEsperado = 6;
		Integer valorObtenido = nuevaPartida.nuevoJugador.obtenerTamanoMatriz();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queElegiCorrectamenteElNivel2(){
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		nuevaPartida.ElegirNivel(2);

		char teclaIngresada = 68;
		nuevaPartida.nuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		Integer valorEsperado = 10;
		Integer valorObtenido = nuevaPartida.nuevoJugador.obtenerTamanoMatriz();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	
	@Test
	public void queElegiCorrectamenteElNivel3(){
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		nuevaPartida.ElegirNivel(3);
		
		char teclaIngresada = 83;
		nuevaPartida.nuevoJugador.mover(teclaIngresada, nuevaPartida.nivelActual.getSolucion());
		
		Integer valorEsperado = 12;
		Integer valorObtenido = nuevaPartida.nuevoJugador.obtenerTamanoMatriz();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void queElJugadorLeQuedenDosVidas() {
		
		String nombre = "Juan";
		
		Partida nuevaPartida = new Partida(nombre);
		nuevaPartida.ElegirNivel(1);

		
		nuevaPartida.nuevoJugador.restarVidaAlChocarConObstaculo();
		
		Integer valorEsperado = 2;
		Integer valorObtenido = nuevaPartida.nuevoJugador.getVidas();
		
		assertEquals(valorEsperado,valorObtenido);
	}
	


}

package ar.edu.unlam.pb1.parcial1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JuegoTest {

	@Test
	public void queAlQuedarseSinVidasTermineElJuego() {
		
		Partida partida = new Partida ();
		boolean valorEsperado = false;
		
		boolean valorObtenido = partida.terminarJuego(valorEsperado);
		
		assertEquals(valorEsperado, valorObtenido);		
		
		
	}

	@Test
	public void queAlChocarConUnObstaculoSeResteUnaVida() {
		
		Jugador jugador = new Jugador ();
		boolean valorEsperado = true;
		
		boolean valorObtenido = jugador.restarVidaAlChocarConObstaculo();
		
		assertEquals(valorEsperado, valorObtenido);		
		
		
	}

}

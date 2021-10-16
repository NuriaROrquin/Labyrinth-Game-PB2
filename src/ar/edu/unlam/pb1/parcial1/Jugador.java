package ar.edu.unlam.pb1.parcial1;

public class Jugador {
    
	private String nombre = "Rocio";
    private Integer posicionX;
    private Integer posicionY; 


    public Jugador(String nombre) {
		this.nombre = nombre;
	}
    
    public Boolean mover (char direccion) {
    	Boolean seMovio = false;
    	
    	if (direccion == 87 || direccion == 119) { //w W arriba
    		posicionY += 1;
    		seMovio = true;
    	} else if (direccion == 83 || direccion ==  115) { // s S abajo
    		posicionY -= 1;
    		seMovio = true;
    	} else if (direccion ==  68 || direccion ==  100) { // d D derecha
    		posicionX += 1;
    		seMovio = true;
    	} else if (direccion == 65 || direccion == 97) { // a A izquierda
    		posicionX -= 1;
    		seMovio = true;
    	} else {
    		return seMovio;
    	}
    	return seMovio;
    }
    
    
}

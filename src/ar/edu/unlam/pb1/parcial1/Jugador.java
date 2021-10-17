package ar.edu.unlam.pb1.parcial1;

public class Jugador {

    private Integer posicionX = 0;
    private Integer posicionY = 0; 
    private int[][] copiaSolucion;
    private Integer tama�oMatriz;
    private Integer copiaX = 0;
    private Integer copiaY = 0;
	private Integer vidas = 3;

    String nombre;
    Integer[][] posicion = new Integer[0][0];

    public Jugador(String nombre) {
		this.nombre = nombre;
	}
    
    public Boolean mover (char direccion, int solucion[][]) {
    	Boolean seMovio = false;
    	this.copiaSolucion = solucion;
    	
    	if (direccion == 87 || direccion == 119) { //w W arriba
    		copiaY -= 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    			if (evaluarMovimiento(solucion)) {
        			seMovio = true;
        		}else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else if (direccion == 83 || direccion ==  115) { // s S abajo
    		copiaY += 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    			if (evaluarMovimiento(solucion)) {
        			seMovio = true;
        		}else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else if (direccion ==  68 || direccion ==  100) { // d D derecha
    		copiaX += 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionX = copiaX;
    			if (evaluarMovimiento(solucion)) {
        			seMovio = true;
        		}else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else if (direccion == 65 || direccion == 97) { // a A izquierda
    		copiaX -= 1;

    		if (esSeguro(solucion, copiaX, copiaY)) { //evaluo si se sale de la matriz
    			this.posicionX = copiaX;
    			if (evaluarMovimiento(solucion)) { //evaluo si choca con obstaculo
        			seMovio = true;
        		}else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else {
    		return seMovio;
    	}
    	
    	return seMovio;
    }

    public Boolean evaluarMovimiento(int solucion[][]) {
    	this.copiaSolucion = solucion;
    	Boolean sePuedeMover = false;
    	
    	if (solucion[posicionY][posicionX] == 1 ) {
    		
    		sePuedeMover = true;
    	}
        System.out.println(sePuedeMover);
    	return sePuedeMover;
    }

    public Integer obtenerTama�oMatriz () {
    	tama�oMatriz = copiaSolucion.length;
    	return tama�oMatriz;
    }
    
    private boolean esSeguro(int[][] matriz, int x, int y) {
        boolean isSecure;
        
        isSecure = (x >= 0 && x < obtenerTama�oMatriz() && y >= 0 && y < obtenerTama�oMatriz());

        return isSecure;
    }

	public Integer restarVidaAlChocarConObstaculo () {
		if(vidas>1) {
			this.vidas -= 1;
		}
		/*else{
			return terminarJuego()
		}*/
		
		return vidas;
	}

	
	public Integer getVidas() {
		return vidas;
	}
   
	
}

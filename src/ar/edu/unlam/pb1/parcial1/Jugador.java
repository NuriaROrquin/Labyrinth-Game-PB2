package ar.edu.unlam.pb1.parcial1;

public class Jugador {
<<<<<<< Updated upstream
	
=======

    private Integer posicionX = 0;
    private Integer posicionY = 0; 
    private int[][] copiaSolucion;
    private Integer tamanoMatriz;
    private Integer copiaX = 0;
    private Integer copiaY = 0;
	private Integer vidas = 3;
	private Boolean triunfo = false;
	private Boolean esGanador = false;

>>>>>>> Stashed changes
    String nombre;


    public Jugador(String nombre) {
		this.nombre = nombre;
	}
<<<<<<< Updated upstream
=======
    
    public Boolean mover (char direccion, int solucion[][]) {
    	Boolean seMovio = false;
    	this.copiaSolucion = solucion;
    	
    	if (direccion == 87 || direccion == 119) { //w W arriba
    		copiaY -= 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			} else if(llegoALaMeta(posicionX,posicionY))
        			{
    				 esGanador = true;
        			}
        		else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else if (direccion == 83 || direccion ==  115) { // s S abajo
    		copiaY += 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			} else if(llegoALaMeta(posicionX,posicionY))
        			{
    				 esGanador = true;
        			}
        		else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else if (direccion ==  68 || direccion ==  100) { // d D derecha
    		copiaX += 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionX = copiaX;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			} else if(llegoALaMeta(posicionX,posicionY))
        			{
    				 esGanador = true;
        			}
        		else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else if (direccion == 65 || direccion == 97) { // a A izquierda
    		copiaX -= 1;

    		if (esSeguro(solucion, copiaX, copiaY)) { //evaluo si se sale de la matriz
    			this.posicionX = copiaX;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			} else if(llegoALaMeta(posicionX,posicionY))
        			{
    				 esGanador = true;
        			}
        		else {
        			restarVidaAlChocarConObstaculo();
        		}
    		}
    		
    	} else {
    		Boolean gano = llegoALaMeta(posicionX,posicionY);
    		return seMovio;
    	}
    	
    	return seMovio;
    }

    public Boolean getEsGanador() {
		return esGanador;
	}

	public void setEsGanador(Boolean esGanador) {
		this.esGanador = esGanador;
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

    public Integer obtenerTamanoMatriz () {
    	tamanoMatriz = copiaSolucion.length;
    	return tamanoMatriz;
    }
    
    private boolean esSeguro(int[][] matriz, int x, int y) {
        boolean isSecure;
        
        isSecure = (x >= 0 && x < obtenerTamanoMatriz() && y >= 0 && y < obtenerTamanoMatriz());

        return isSecure;
    }

	public Integer restarVidaAlChocarConObstaculo () {
		if(vidas>1) {
			this.vidas -= 1;
		}
		/*else{terminarJuego()}*/
		
		return vidas;
	}

	
	public Integer getVidas() {
		return vidas;
	}
	
	public Boolean llegoALaMeta(Integer posicionX, Integer posicionY)
	{
		if(posicionX == obtenerTamanoMatriz()-1 && posicionY == obtenerTamanoMatriz()-1)
		{
		triunfo = true;
		System.out.println("Ganaste");
		return triunfo;
		}else {
			return triunfo;
		}
	}
	
	
   
	
>>>>>>> Stashed changes
}

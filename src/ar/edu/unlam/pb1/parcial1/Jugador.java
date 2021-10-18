package ar.edu.unlam.pb1.parcial1;

public class Jugador {

    private Integer posicionX = 0;
    private Integer posicionY = 0; 
    private int[][] copiaSolucion;
    private Integer tamanoMatriz;
    private Integer copiaX = 0;
    private Integer copiaY = 0;
	private Integer vidas = 3;
	private Boolean triunfo = false;
	private Boolean movimientoInvalido = false;

    String nombre;
    Integer[][] posicion = new Integer[0][0];

    public Jugador(String nombre) {
		this.nombre = nombre;
	}
	public Jugador() {
		
	}
    
    public Boolean mover (char direccion, int solucion[][]) {
    	Boolean seMovio = false;
    	this.copiaSolucion = solucion;
    	
    	if (direccion == 87 || direccion == 119) { //w W arriba
    		copiaX = posicionX;
    		copiaY = posicionY - 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			}
    		}else {
    			movimientoInvalido = true;
    		}
    		
    	} else if (direccion == 83 || direccion ==  115) { // s S abajo
    		copiaX = posicionX;
    		copiaY = posicionY + 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			}
    		}else {
    			movimientoInvalido = true;
    		}
    		
    	} else if (direccion ==  68 || direccion ==  100) { // d D derecha
    		copiaY = posicionY;
    		copiaX = posicionX + 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionX = copiaX;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			} 
    		}else {
    			movimientoInvalido = true;
    		}
    		
    	} else if (direccion == 65 || direccion == 97) { // a A izquierda
    		copiaY = posicionY;
    		copiaX = posicionX - 1;

    		if (esSeguro(solucion, copiaX, copiaY)) { //evaluo si se sale de la matriz
    			this.posicionX = copiaX;
    			if (evaluarMovimiento(solucion) && !llegoALaMeta(posicionX,posicionY)) { //evaluo si choca con obstaculo y si no llegue a la meta
        			seMovio = true;
    			} 
    		}else {
    			movimientoInvalido = true;
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


	public void restarVidaAlChocarConObstaculo () {
		this.vidas -= 1;
	}
	
	public Integer getVidas() {
		return vidas;
	}
	
	public Boolean llegoALaMeta(Integer posicionX, Integer posicionY){
		if(posicionX == obtenerTamanoMatriz()-1 && posicionY == obtenerTamanoMatriz()-1){
			triunfo = true;
		}
		
		return triunfo;
	}
	
	public Boolean getTriunfo() {
		return triunfo;
	}
	
	public Boolean getMovimientoInvalido() {
		return movimientoInvalido;
	}
	
	
   
	
}

package ar.edu.unlam.pb1.parcial1;

public class Jugador {

	private String nombre = "Rocio";
    private Integer posicionX = 0;
    private Integer posicionY = 0; 
    private int[][] copiaSolucion;
    private Integer tamanoMatriz;
    private Integer copiaX = 0;
    private Integer copiaY = 0;
	private Integer vidas = 3;
	private Boolean triunfo = false;
	private Boolean sinVida = false;



    public Jugador(String nombre) {
		this.nombre = nombre;
	}
    
    public Boolean mover (char direccion, int solucion[][]) {
    	Boolean seMovio = false;
    	this.copiaSolucion = solucion;
    	
    	if (direccion == 87 || direccion == 119) { //w W arriba
    		copiaY += 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    		}
    		if (evaluarMovimiento(solucion)) {
    		return seMovio = true;
    		}
    	} else if (direccion == 83 || direccion ==  115) { // s S abajo
    		copiaY -= 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionY = copiaY;
    		}
    		if (evaluarMovimiento(solucion)) {
    		return seMovio = true;
    		}
    	} else if (direccion ==  68 || direccion ==  100) { // d D derecha
    		copiaX += 1;
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionX = copiaX;
    		}
    		if (evaluarMovimiento(solucion)) {
    		return seMovio = true;
    		}
    	} else if (direccion == 65 || direccion == 97) { // a A izquierda
    		copiaX -= 1;
    		
    		if (esSeguro(solucion, copiaX, copiaY)) {
    			this.posicionX = copiaX;
    		}
    		if (evaluarMovimiento(solucion)) {
    		return seMovio = true;
    		}
    	} else {
    		return seMovio;
    	}
    	return seMovio;
    }

    public Boolean evaluarMovimiento(int solucion[][]) {
    	this.copiaSolucion = solucion;
    	Boolean sePuedeMover = false;
    	
    	
    	
    	if (solucion[posicionX][posicionY] == 1 && esSeguro(copiaSolucion, posicionX, posicionY)) {
    		
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

    
	public boolean restarVidaAlChocarConObstaculo () {
		
		if(vidas>=1) {
			this.vidas -= 1;
			if (vidas == 0) {
				sinVida = true;
			}
		}
		
		return sinVida;
	}
	
	public Integer getVidas() {
		return vidas;
	}
	
	public Boolean llegoALaMeta(Integer posicionX, Integer posicionY)
	{
		if(posicionX == obtenerTamanoMatriz() && posicionY == obtenerTamanoMatriz())
		{
		triunfo = true;
		return triunfo;
		}else {
			return triunfo;
		}
	}
	
	public boolean getSinVida() {
		return sinVida;
	}

   
}



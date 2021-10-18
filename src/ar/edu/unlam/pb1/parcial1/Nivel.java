package ar.edu.unlam.pb1.parcial1;

import java.util.Random;

public class Nivel {
    Integer matriz[][];
    Random rnd = new Random();
	static int N;
    private int solucion[][];
    private Boolean sePuedeDibujarLaMatriz = false;

	public boolean pintarMatrizAleatoriamente() {
		
		for(int i=0;i<matriz.length;i++) {
            for(int j=0;j<matriz[i].length;j++) {
            	int x = (int)(rnd.nextDouble() * 11.0);
            	if(x<2) {
            		matriz[i][j] = 0;
            	}else {
            		matriz[i][j] = 1;
            	}
            }
        }

        N = matriz.length;
        solucion = new int[N][N];
        return resolverCamino(matriz, solucion);
    }

    private boolean resolverCamino(Integer[][] matriz, int[][] solucion) {
        if (solveMazeUtil(matriz, 0, 0, solucion) == false) {
            pintarMatrizAleatoriamente();
        }

        sePuedeDibujarLaMatriz = true;
        return sePuedeDibujarLaMatriz;
    }

    private boolean solveMazeUtil(Integer[][] matriz, int x, int y, int[][] sol) {

        if (x == N - 1 && y == N - 1
                && matriz[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }


        if (esSeguro(matriz, x, y) == true) {

            if (sol[x][y] == 1)
                return false;


            sol[x][y] = 1;


            if (solveMazeUtil(matriz, x + 1, y, sol))
                return true;


            if (solveMazeUtil(matriz, x, y + 1, sol))
                return true;


            if (solveMazeUtil(matriz, x - 1, y, sol))
                return true;


            if (solveMazeUtil(matriz, x, y - 1, sol))
                return true;


            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    private boolean esSeguro(Integer[][] matriz, int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N && matriz[x][y] == 1);
    }
    
    public Integer[][] getMatriz() {
		return matriz;
	}
    
	public void setMatriz(Integer[][] matriz) {
		this.matriz = matriz;
	}
	
	public int[][] getSolucion() {
		return solucion;
	}

	public void setSolucion(int[][] solucion) {
		this.solucion = solucion;
	}

	
	public int getN() {
		return N;
	}

	
	public Boolean getSePuedeDibujarLaMatriz() {
		return sePuedeDibujarLaMatriz;
	}
    
	

}

package ar.edu.unlam.pb1.parcial1;

import java.util.Random;

public class Nivel {
    Integer matriz[][];
    Random rnd = new Random();
	 static int N;
     int solucion[][];
	 Integer vidas = 3;


     
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
	            return false;
	        }

	        pintarSolucion(solucion);
	        return true;
	    }

	    private void pintarSolucion(int[][] sol) {
	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {

	            	System.out.print(" " + sol[i][j] + " ");
	            	
	            }
	            System.out.println();
	            
	        }
	    }

	    private boolean solveMazeUtil(Integer[][] matriz, int x, int y, int[][] sol) {
	        // if (x, y is goal) return true
	        if (x == N - 1 && y == N - 1
	                && matriz[x][y] == 1) {
	            sol[x][y] = 1;
	            return true;
	        }

	        // Check if maze[x][y] is valid
	        if (esSeguro(matriz, x, y) == true) {
	            // Check if the current block is already part of solution path.
	            if (sol[x][y] == 1)
	                return false;

	            // mark x, y as part of solution path
	            sol[x][y] = 1;

	            /* Move forward in x direction */
	            if (solveMazeUtil(matriz, x + 1, y, sol))
	                return true;

	            /* If moving in x direction doesn't give
	            solution then Move down in y direction */
	            if (solveMazeUtil(matriz, x, y + 1, sol))
	                return true;

	            /* If moving in y direction doesn't give
	            solution then Move backwards in x direction */
	            if (solveMazeUtil(matriz, x - 1, y, sol))
	                return true;

	            /* If moving backwards in x direction doesn't give
	            solution then Move upwards in y direction */
	            if (solveMazeUtil(matriz, x, y - 1, sol))
	                return true;

	            /* If none of the above movements works then
	            BACKTRACK: unmark x, y as part of solution
	            path */
	            sol[x][y] = 0;
	            return false;
	        }

	        return false;
	    }

	    private boolean esSeguro(Integer[][] matriz, int x, int y) {
	        // if (x, y outside maze) return false
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

		public Integer restarVidaAlChoqarConObstaculo () {
	    
			vidas = -1;
			return vidas;
			if (vidas < 1) {
				//terminarJuego
			}
			 }
	 


		public void setSolucion(int[][] solucion) {
			this.solucion = solucion;
		}
	    
}

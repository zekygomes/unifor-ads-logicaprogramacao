package desafio_matriz;

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Scanner in = new Scanner(System.in);	
		int determinante;	
		int [][] matriz = new int [][]{
				{5, 2, 1},
				{-2, 3, 4}, 
				{0, 2, 3}
		};
		
		imprimeMatriz(matriz, 3, 3);
		
		determinante = determinante(matriz, 3, 3);
		System.out.println("det Matriz = "+ determinante);
	}
	
	
	static int determinante (int m[][],int numLin, int numCol){
		int numColDet = numCol + 2; 
		int	nLin1=0,nCol=0,nCol1=0, soma=0, mult1=1, mult2=1;
		int nLin2=0, nCol0=numLin-1, nCol2=nCol0, sub=0, determinante;
		int [][] detMatriz = new int [numLin][numColDet];
		
		for (int i = 0; i < numLin; i++) {
			for (int j = 0; j < numCol; j++) {
				detMatriz[i][j] = m[i][j];
				int z=0;
				for(int y = numCol; y < numColDet; y++){
					detMatriz[i][y] = m[i][z];
					z++;
					}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				mult1 = mult1 * detMatriz[nLin1][nCol1];
				mult2 = mult2 * detMatriz[nLin2][nCol2];
				nLin1= nLin1 + 1;
				nCol1= nCol1 + 1;
				nLin2= nLin2 + 1;
				nCol2= nCol2 - 1;
			}
			
		nLin1= 0;
		nCol++;
		nCol1= nCol;
		nLin2= 0;
		nCol0++;
		nCol2= nCol0;
			
		soma = soma + mult1;
		mult1 = 1;	
		sub = sub - mult2;
		mult2 = 1;
		}
		
		determinante = soma + sub;
		return determinante;
	}
	
	static void imprimeMatriz(int m[][],int numLin, int numCol){
		for (int i = 0; i < numLin; i++) {
			for (int j = 0; j < numCol; j++) {
				System.out.printf("%d\t",m[i][j]);
			}
			System.out.println();
		}
	}
	
}

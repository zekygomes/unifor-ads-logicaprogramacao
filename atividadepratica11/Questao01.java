package atividadepratica11;

public class Questao01 {
	/*
	 * Construa um algoritmo que dada uma matriz predefinida A3x2, imprima os elementos da matriz de
	 * forma tabular, conforme mostrado abaixo.
	 */
	
	public static void main(String[] args) {
		int [][] A = new int[][]{
			{2,3},
			{4,5},
			{6,7}
		};
		
		imprimeMatrizInt(A, 3, 2);
	}
	
	static void imprimeMatrizInt(int m[][],int numLin, int numCol){
		for (int i = 0; i < numLin; i++) {
			System.out.print("|");
			for (int j = 0; j < numCol; j++) {
				System.out.printf(" %d ",m[i][j]);
			}
			System.out.println("|");
		}
	}


}

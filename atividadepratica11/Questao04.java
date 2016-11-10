package atividadepratica11;

import java.util.Random;
import java.util.Scanner;

public class Questao04 {
	/*
	 * Construa um algoritmo que crie e leia duas matrizes A e B de elementos inteiros. O seu
	 * algoritmo deve ler também o número de linhas e colunas que cada matriz deverá conter. Com base nessas
	 * duas matrizes, verifique se é possível realizar a multiplicação das mesmas. Caso seja possível, crie uma
	 * matriz R resultando a multiplicação das matrizes A e B.
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int numLinA, numColA,numLinB, numColB;
		int [][] A, B, R;
		
		System.out.println("Informe o número de Linhas da Matriz A:");
		numLinA = in.nextInt();
		System.out.println("Informe o número de Colunas da Matriz A:");
		numColA = in.nextInt();
		
		System.out.println("Informe o número de Linhas da Matriz B:");
		numLinB = in.nextInt();
		System.out.println("Informe o número de Colunas da Matriz B:");
		numColB = in.nextInt();
		
		A = new int[numLinA][numColA];
		B = new int[numLinB][numColB];
		
		System.out.println("Informe os valores de A");
		for (int i = 0; i < numLinA; i++) {
			for (int j = 0; j < numColA; j++) {
				System.out.printf("A [%d] [%d]:\n",i,j);
				A[i][j] = ale.nextInt(10);
			}
		}
		
		System.out.println("Informe os valores de B");
		for (int i = 0; i < numLinB; i++) {
			for (int j = 0; j < numColB; j++) {
				System.out.printf("B [%d] [%d]:\n",i,j);
				B[i][j] = ale.nextInt(10);
			}
		}
		
		if(numColA==numLinB){
			R = new int[numLinA][numColB];
			
			
			for (int i=0; i < numLinA; i++){
				for (int j= 0; j < numColB; j++){
					for(int z= 0; z < numLinA; z++){
					R [i][j] = R[i][j] + A[i][z] * B[i][z];
					}
				}
			}
			System.out.println("Matriz A");
			imprimeMatrizInt(A, numLinA, numColA);
			System.out.println("Matriz B");
			imprimeMatrizInt(B, numLinB, numColB);
			System.out.println("A multiplicação de A x B é:");
			imprimeMatrizInt(R, numLinA, numColB);
		}else
			System.out.println("Não é possível multiplicar as Matrizes");
		
		
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

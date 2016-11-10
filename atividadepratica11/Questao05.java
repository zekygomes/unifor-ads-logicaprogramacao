package atividadepratica11;

import java.util.Random;
import java.util.Scanner;

public class Questao05 {
	/*
	 * Construa um algoritmo que solicita ao usuário o numero de linhas e colunas de uma matriz A, e
	 * depois crie e inicialize essa matriz. Da mesma forma, o algoritmo deve ler o numero de linhas e colunas de
	 * uma matriz B. Verifique se é possível somar / subtrair ou multiplicar os elementos da matriz A e B, que deve
	 * gerar uma matriz R, resultante de A e B.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int numLinA, numColA,numLinB, numColB, opcao = 0;
		int [][] A, B;
		boolean somaSub=false, mult=false;
		
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
		
		if(numLinA==numLinB && numColA==numColB){
			System.out.println("É possível somar ou subtrair as matrizes");
			somaSub =true;
		}else{
			System.out.println("Não é possível somar ou subtrair as matrizes");
			somaSub =false;
		}
		if(numColA==numLinB){
			System.out.println("É possível multiplicar as matrizes");	
			mult = true;
		}else{
			System.out.println("Não é possível multiplicar as Matrizes");
			mult = false;
		}
		
		if(somaSub=true){
			System.out.println("Digite: 1 para Soma \nDigite: 2 para Subtração");
			}
		if(mult=true){
			System.out.println("Digite: 3 para multiplicar");
		}
		
		if(opcao == 1){
			somaMatrizes(A, B, numLinA, numColB);
			}else
				if(opcao == 2){
					subtrairMatrizes(A, B, numLinA, numColA);
					}else
						if(opcao == 3){
							multMatrizes(A, numLinA, numColA, B, numLinB, numColB);
						}		
		
	}
	
	static int [] [] multMatrizes (int A [][], int nLinA, int nColA, int B [][], int nLinB, int nColB){
		int [][] result = new int [nLinA][nColB];
		for (int i=0; i < nLinA; i++){
			for (int j= 0; j < nColB; j++){
				for(int z= 0; z < nLinA; z++){
				result [i][j] = result [i][j] + A[i][z] * B[i][z];
				}
			}
		}
		imprimeMatrizInt(result, nLinA, nColB);
		return result;
	}
	
	static int [] [] somaMatrizes (int A [][], int B [][], int nLin, int nCol){
		int [][] result = new int [nLin][nCol];
		for (int i=0; i < nLin; i++){
			for (int j= 0; j < nCol; j++){
				result [i][j] = A[i][j] + B[i][j];
				}
			}
		imprimeMatrizInt(result, nLin, nCol);
		return result;
	}
	
	static int [] [] subtrairMatrizes (int A [][], int B [][], int nLin, int nCol){
		int [][] result = new int [nLin][nCol];
		for (int i=0; i < nLin; i++){
			for (int j= 0; j < nCol; j++){
				result [i][j] = A[i][j] - B[i][j];
				}
			}
		imprimeMatrizInt(result, nLin, nCol);
		return result;
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

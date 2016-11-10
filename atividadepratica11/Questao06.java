package atividadepratica11;

import java.util.Random;
import java.util.Scanner;

public class Questao06 {
	/*
	 * Construa um algoritmo que solicita ao usuário o numero de linhas e colunas de uma matriz A, e
	 * depois crie e inicialize essa matriz. Da mesma forma, o algoritmo deve ler o numero de linhas e colunas de
	 * uma matriz B. Verifique se é possível somar / subtrair ou multiplicar os elementos da matriz A e B, que deve
	 * gerar uma matriz R, resultante de A e B.
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int numLinA, numColA,numLinB, numColB, opcao=0;
		int [][] A, B;
		
		
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
		do{
		System.out.println("0 – Sair\n1 – Soma\n2 – Subtração\n3 – Multiplicação\n4 – Calcular matriz transposta");
		opcao = in.nextInt();
		
		switch(opcao){
		case 1:{
			if(numLinA==numLinB && numColA==numColB){
				somaMatrizes(A, B, numLinA, numColA);
			}else{
				System.out.println("Não é possível somar as matrizes");
			}
			break;
		}
		case 2:{
			if(numLinA==numLinB && numColA==numColB){
				subtrairMatrizes(A, B, numLinA, numColA);
			}else{
				System.out.println("Não é possível somar ou subtrair as matrizes");
			}
			
			break;
		}
		case 3:{
			if(numColA==numLinB){
				multMatrizes(A, numLinA, numColA, B, numLinB, numColB);
			}else{
				System.out.println("Não é possível multiplicar as Matrizes");
			}
			
			break;
		}
		case 4:{
			int mopcao=0;
			System.out.println("1 Matriz A\n2 Matriz B");
			mopcao = in.nextInt();
			if(mopcao==1)
			matrizTransposta(A, numLinA, numColB);
			else
				matrizTransposta(B,numLinB ,numColB );
			break;
		}
		case 0:{
			System.out.println("Sistema Finalizado!");
			System.exit(0);
			break;
		}
		}
		
		}while (opcao!=0);
	}
	
	static int [] [] multMatrizes (int A [][], int nLinA, int nColA, int B [][], int nLinB, int nColB){
		int [][] matrizMultiplicacao = new int [nLinA][nColB];
		for (int i=0; i < nLinA; i++){
			for (int j= 0; j < nColB; j++){
				for(int z= 0; z < nLinA; z++){
				matrizMultiplicacao [i][j] = matrizMultiplicacao [i][j] + A[i][z] * B[i][z];
				}
			}
		}
		imprimeMatrizInt(matrizMultiplicacao, nLinA, nColB);
		return matrizMultiplicacao;
	}
	
	static int [] [] somaMatrizes (int A [][], int B [][], int nLin, int nCol){
		int [][] matrizSoma = new int [nLin][nCol];
		for (int i=0; i < nLin; i++){
			for (int j= 0; j < nCol; j++){
				matrizSoma [i][j] = A[i][j] + B[i][j];
				}
			}
		
		imprimeMatrizInt(matrizSoma, nLin, nCol);
		return matrizSoma;
	}
	
	static int [] [] subtrairMatrizes (int A [][], int B [][], int nLin, int nCol){
		int [][] matrizSubtracao = new int [nLin][nCol];
		for (int i=0; i < nLin; i++){
			for (int j= 0; j < nCol; j++){
				matrizSubtracao [i][j] = A[i][j] - B[i][j];
				}
			}
		imprimeMatrizInt(matrizSubtracao, nLin, nCol);
		return matrizSubtracao;
	}

	static int [][] matrizTransposta(int[][] m, int nLinhas, int nColunas){
		int [][] matrizTransposta = new int [nColunas][nLinhas];
		
		 for (int i=0; i<nLinhas; i++) {
		      for (int j=0; j<nColunas; j++) {
		        matrizTransposta[j][i] = m [i][j];
		      }
		    }
		 imprimeMatrizInt(matrizTransposta, nColunas, nLinhas);
		 return matrizTransposta;
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

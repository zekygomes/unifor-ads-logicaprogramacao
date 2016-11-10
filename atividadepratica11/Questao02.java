package atividadepratica11;

import java.util.Random;
import java.util.Scanner;

public class Questao02 {
	/*
	 * Construa um algoritmo que leia uma matriz A5x4, com n�meros reais. Cria um subalgoritmo que
	 * receba uma matriz de entrada e imprima todos os seus elementos. Voc� deve chamar esse subalgoritmo no
	 * programa principal, passando a matriz A5x4 criada anteriormente como par�metro, para que seus elementos
	 * possam ser impressos
	 */
	
	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int numLin = 5, numCol = 4;
		double [][] A = new double[numLin][numCol];
		
		for (int i = 0; i < numLin; i++) {
			for (int j = 0; j < numCol; j++) {
				System.out.printf("Insira os valores:\nA [%d] [%d]:\n",i,j);
				A[i][j] = ale.nextDouble()*100;
			}
		}
		
		imprimeMatrizReal(A, numLin, numCol);
	}
	
	static void imprimeMatrizReal(double m[][],int numLin, int numCol){
		for (int i = 0; i < numLin; i++) {
			System.out.print("|");
			for (int j = 0; j < numCol; j++) {
				System.out.printf(" %1.2f\t",m[i][j]);
			}
			System.out.println("|");
		}
	}


}

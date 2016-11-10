package atividadepratica11;

import java.util.Random;
import java.util.Scanner;

public class Questao03 {
	/*
	 * Construa um algoritmo que leia a matricula e tr�s notas (np1, np2, nf) de cada um dos 10 alunos
	 * que fizeram prova final na disciplina de algoritmos. Crie um subalgoritmo que receba essa matriz como
	 * par�metro e imprima a matricula e m�dia final, caso o aluno tenha sido aprovado.
	 * DICA. A m�dia final consiste na m�dia aritm�tica das 3 notas. A nota m�nima para aprova��o ser� 7,0
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int numLin = 10, numCol = 4, x=0;
		double [][] notaAlunos = new double[numLin][numCol];
		
		for (int i = 0; i < numLin; i++) {
			System.out.println("Informe o N�mero de Matr�cula:");
			notaAlunos[i][x]=in.nextDouble();
			for (int j = 1; j < numCol; j++) {
				System.out.printf("Informe as tr�s notas: %d� Nota\n",j);
				notaAlunos[i][j] = in.nextDouble();
			}

		}
		
		imprimeAprovados(notaAlunos, numLin, numCol);
	}
	
	static void imprimeAprovados(double m[][],int numLin, int numCol){
		double cont=0, media=0;
		System.out.println("Aprovados\n| Mat. \t\tMedia |");
		for (int i = 0; i < numLin; i++) {
			
			for (int j = 1; j < numCol; j++) {
				cont = cont + m[i][j];
				}
			media = cont/3;
			if(media>=7){
				System.out.printf("| %.0f \t %.1f |\n",m[i][0],media);
			
			}
			media=0;
			cont=0;
		}
	}


}

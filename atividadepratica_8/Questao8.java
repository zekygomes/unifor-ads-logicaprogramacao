// Falta finalizar

package atividadepratica_8;
import java.util.Random;
import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int [] tempDia = new int [365];
		@SuppressWarnings("unused")
		int [] B = new int [365];
		@SuppressWarnings("unused")
		int menorTemp = 50, maiorTemp=0,soma = 0, mediaTemp;
		
		for(int i = 0; i<tempDia.length;i++){
			tempDia[i] = ale.nextInt((49 - 20) + 1) + 20;
			
			if(tempDia[i] < menorTemp)
				menorTemp = tempDia[i];
			
			if(tempDia[i] > maiorTemp)
				maiorTemp = tempDia[i];
			
			soma = soma + tempDia[i];
		}

		
		
	}}
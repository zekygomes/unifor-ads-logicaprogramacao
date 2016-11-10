package atividadepratica09;

import java.util.Scanner;

public class ExercicioAula {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double [] num = new double [20];
		
		System.out.println("Digite 20 números reais qualquer: ");
		for(int i = 0; i < num.length;i++){
			num [i] = in.nextDouble();
		}
		
		ordemCrescente(num);
		imprimeVetor(num);		
	}
	
	static void ordemCrescente(double[] n){
		double temp = n[0];
		for(int i = 0;i<n.length;i++){
			for(int j = i+1;j<n.length;j++){
			
			if (n[j] < n[i]){
				temp =n[i];
				n[i] = n[j];
				n[j]=temp;
				}
			}
		}
	}
	
	static void imprimeVetor(double [] n){
		for(int i = 0; i< n.length;i++){
			System.out.printf("Vetor[%d]: %.1f\n",i,n[i]);
		}
	}
	
}

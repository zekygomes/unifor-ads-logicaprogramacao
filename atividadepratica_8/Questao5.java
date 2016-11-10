package atividadepratica_8;
import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A:",i+1);
			A[i] = in.nextInt();
		}
		System.out.println("\nNúmeros Positivos: ");

		for(int i = 0; i<A.length;i++){
			if(A[i]>0)
				System.out.printf("%d\n ", A[i]);
		}

	}

}

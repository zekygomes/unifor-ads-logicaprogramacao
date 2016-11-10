package atividadepratica08;
import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		int soma = 0;
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A:",i+1);
			A[i] = in.nextInt();
		}
		
		for(int i = 0; i<A.length;i++){
			if(A[i]%2==0)
				soma++;
		}
	System.out.printf("\nTotal de números pares: %d\n", soma);
	
	}

}

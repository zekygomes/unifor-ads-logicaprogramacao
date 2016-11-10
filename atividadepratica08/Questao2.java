package atividadepratica08;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		int [] B = new int [10];
		int [] C = new int [10];
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A:",i+1);
			A[i] = in.nextInt();
		}
		
		for(int i = 0; i<B.length;i++){
			System.out.printf("Digite o elemento %d de B:",i+1);
			B[i] = in.nextInt();
		}

		for(int i = 0; i<C.length;i++){
			C[i] = A[i]*B[i];
			
		System.out.printf("C %d = %d\n", i+1, C[i]);
		}
	}
}

package atividadepratica08;
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		int [] B = new int [10];
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A:",i+1);
			A[i] = in.nextInt();
		}

		for(int i = 0; i<A.length;i++){
			if(A[i]%2 == 0)
				B[i] = A[i]*5;
			else
				B[i] = A[i]+5;
		
		System.out.printf("B %d = %d\n", i+1, B[i]);
		}
	}
}
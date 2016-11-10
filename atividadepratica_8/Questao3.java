package atividadepratica_8;
import java.util.Scanner;

public class Questao3{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		int [] B = new int [10];
		int x;
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A:",i+1);
			A[i] = in.nextInt();
		}
		System.out.println("Digite a variável X: ");
		x = in.nextInt();
		
		for(int i = 0; i<B.length;i++){
			B[i] = A[i]*x;
		
		System.out.printf("B %d = %d\n", i+1, B[i]);
		}
	}

}

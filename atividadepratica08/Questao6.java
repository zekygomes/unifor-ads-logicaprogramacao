package atividadepratica08;
import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		int [] B;
		int n = 0, b=0;
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A:",i+1);
			A[i] = in.nextInt();
			if(A[i]>0)
				n++;
		}
		B = new int [n];
		
		for(int i = 0; i<A.length;i++){
			if(A[i]>0){
			B[b] = A[i];
			b++;
			}
		}
		for(int i = 0; i<B.length;i++){
		System.out.printf("B %d = %d\n", i+1, B[i]);
		}
		
	}
}

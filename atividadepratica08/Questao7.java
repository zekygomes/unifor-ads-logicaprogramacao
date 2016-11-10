package atividadepratica08;
import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n; 
		double somaA=0,somaB=0, lucroUnMedio;
		double [] A, B;
		
		
		System.out.println("Quantos itens diferente h� no estoque? ");
		n = in.nextInt();
		
		A = new double [n];
		B = new double [n];
				
		for(int i = 0; i<A.length;i++){
			System.out.printf("Pre�o de Compra - Item %d: R$",i+1);
			A[i] = in.nextInt();
			System.out.printf("Pre�o de Venda - Item %d: R$",i+1);
			B[i] = in.nextInt();
			
			somaA = somaA+ A[i];
			somaB = somaB+ B[i];
		}
		lucroUnMedio = (somaB-somaA)/n;
		System.out.printf("Lucro Unit�rio M�dio: R$ %.2f",lucroUnMedio);
		
		for(int i = 0; i<A.length;i++){
			if(B[i]-A[i]>lucroUnMedio)
				System.out.printf("\nLucro Unit�rio do Item %d = R$ %.2f\n", i+1, B[i]-A[i]);
		}
		
	}

}

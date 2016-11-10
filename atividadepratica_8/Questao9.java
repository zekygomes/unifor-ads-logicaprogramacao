//Falta finalizar

package atividadepratica_8;
import java.util.Random;
import java.util.Scanner;

public class Questao9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		boolean [] A = new boolean [365];
		int cont = 0, locGratis, qntCliente;
		@SuppressWarnings("unused")
		int [] B;
		
		System.out.println("Qual a quantidade de clientes? ");
		qntCliente = in.nextInt();		
		
		for(;qntCliente>=0;qntCliente--){
		for(int i = 0; i<A.length;i++){
			A[i] = ale.nextBoolean();
			
			if (A[i]==true)
				cont++;
		}
		}
		locGratis = cont/10;

		B = new int [locGratis];
		
		System.out.printf("\nNúmero de Locações: %d\nTotal de Locações Gratuitas: %d",cont, locGratis);
			
	}
}

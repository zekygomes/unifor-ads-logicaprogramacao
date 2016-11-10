package atividadepratica_8;
import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		//Random ale = new Random();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int [] A = new int [10];
		int cod;
		
		for(int i = 0; i<A.length;i++){
			System.out.printf("Digite o elemento %d de A: \n",i+1);
			//A[i]=ale.nextInt(10);
			A[i] = in.nextInt();
		}
		do{
		System.out.println("Digite o código: 0 - 1 - 2");
		cod = in.nextInt();
		
		switch(cod){
			case 1:{
				for(int i = 0; i<A.length;i++){
					System.out.printf("A %d = %d\n", i+1, A[i]);
				}
				break;
			}
			case 2:{
				for(int i = A.length; i > 0 ;i--){
					System.out.printf("A %d = %d\n", i, A[i-1]);
				}
				break;
			}
			case 0:{
				System.exit(0);
			}
		}
		}while(cod != 0);
		
	}

}

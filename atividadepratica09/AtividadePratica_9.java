package atividadepratica09;

import java.util.Scanner;

public class AtividadePratica_9 {
	static long [] matriculas = new  long[]{16001, 16002, 16053, 16032, 16234, 16023, 16045, 16289, 15143};
	static String [] nomes = new String[]{"Alexandre", "Breno   ", "Diego   ", "Fernando", "Francisco", "Gabriela", "Joaquim ", "Leonardo","Lucas   "};
	static double [] notasNP1= new double [] {8.5, 8.2, 7.1, 4.3, 7.3, 7.4, 9.2, 8.9, 6.7};
	static double [] notasNP2 = new double [] {9.0, 7.8, 9.5, 9.5, 8.9, 7.8, 6.7, 9.3, 10.0};
	
	public static void main(String[] args) {
		int opcao;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		do{
		System.out.println("\nEscolha uma das opções:");
		System.out.println("1 - Imprimir Matrículas");
		System.out.println("2 - Imprimir Nomes");
		System.out.println("3 - Ver Sitaução/Resultado");
		System.out.println("4 - Relatório Geral");
		System.out.println("5 - Buscar Matrícula");
		System.out.println("6 - Ver Maior Média Geral");
		System.out.println("0 - Sair");
		opcao = in.nextInt();
		
		switch (opcao) {
		case 1: imprimeMatriculas(matriculas);;
			break;
		case 2: imprimeNomes(nomes);
			break;
		case 3:situacao(notasNP1, notasNP2);	
			break;
		case 4: impTabular(matriculas, nomes, notasNP1);
			break;
		case 5: {
			System.out.println("Digite o número da matrícula: ");
			long a = in.nextLong();
			buscaMatricula(a);
			break;
			}
		case 6: maiorMedia();
			break;
		case 0: System.exit(0);
		default:
			System.out.println("Opção incorreta!");
			break;
		}
		
		}while(opcao!=0);
			
		//imprimeMatriculas(matriculas);
		//imprimeNomes(nomes);
		//situacao(notasNP1, notasNP2);
		//impTabular(matriculas, nomes, notasNP1);
		maiorMedia();
		buscaMatricula(160853);
	}

	static void imprimeMatriculas(long [] a){
		System.out.println("Matrículas: ");
		for(int i = 0; i< a.length;i++){
			System.out.printf("%d\n",a[i]);
		}
	}	
	
	static void imprimeNomes(String [] a){
		System.out.println("Nomes: ");
		for(int i = 0; i< a.length;i++){
			System.out.printf("%s\n",a[i]);
		}
	}

	static void situacao (double [] a, double [] b){
		System.out.println(" Nome\t\tMatricula\tSituação");
		for(int i = 0; i < a.length ; i++){
			
		double media = ( a[i] + b[i] ) / 2;
		if(media>=8.0)
			System.out.printf(" %s\t  %d\t\tAprovado\n",nomes[i],matriculas[i] );
			else
				System.out.printf(" %s\t  %d\t\tReprovado\n",nomes[i],matriculas[i] );		
		}		
	}

	static void impTabular(long [] a, String [] b, double [] c){
		System.out.println("Matricula\tNome\t\tNP1\tNP2 ");
		System.out.println("-------------------------------------------- ");
		for(int i = 0; i< a.length;i++){
			System.out.printf(" %d\t\t%s\t%.1f\t%.1f\n",a[i],b[i],c[i],notasNP2[i]);
		}
	}

	static void buscaMatricula(long a){
		int indice = 0;
		for(int i = 0; i< matriculas.length;i++){
			
			if(a == matriculas[i])
				indice = i;
		}

		if(indice != 0)
			System.out.printf("Indice: %d\n",indice);
				else
					System.out.println("Matrícula inexistente");

	}
	
	static void maiorMedia(){
		double maiorMedia=0;
		int j = 0;
		
		for(int i = 0; i < notasNP1.length ; i++){

		double media = ( notasNP1[i] + notasNP2[i] ) / 2;
		
		if(media> maiorMedia){
			maiorMedia = media;
			j = i;
			}
		if(i==notasNP1.length-1)
			System.out.printf("Matrícula: %d\nNome: %s\t\nMaior Média Geral: %.1f\n",matriculas[j],nomes[j],maiorMedia);
		}

		
	
	}
	
}

package desafio_matriz;

import java.util.Scanner;

public class Desafio1 {
	static Scanner in = new Scanner(System.in);	
	static int [][] matriz = new int [][] {
			{ 0,  2, 11,  6, 15, 11,  1},
			{ 2,  0,  7, 12,  4,  2, 15},
			{11,  7,  0, 11,  8,  3, 13},
			{ 6, 12, 11,  0, 10,  2,  1},
			{15,  4,  8, 10,  0,  5, 13},
			{11,  2,  3,  2,  5,  0, 14},
			{ 1, 15, 13,  1, 13, 14,  0} 
	};
			
	public static void main(String[] args) {
		tempoCidades(matriz);
		System.out.println();
		imprimeUnico(matriz);
		System.out.println();
		tempoVariasCidades(matriz);
		System.out.println();
		melhorTrajeto(matriz);
			
	}
	
	static void tempoCidades(int matriz[][]){
		int cid1, cid2;
				
		do{
			System.out.println("Digite a cidade de origem: \nCidades: 0 ; 1 ; 2 ; 3 ; 4 ; 5 ; 6 ");
			cid1 = in.nextInt();
			System.out.println("Digite a cidade de destino: \nCidades: 0 ; 1 ; 2 ; 3 ; 4 ; 5 ; 6 ");
			cid2 = in.nextInt();
			
			if((cid1 <= 6 && cid1 > 0)&&(cid2 <= 6 && cid2 > 0)){
				if(cid1 == cid2)
					break;
				else{
					System.out.printf("O tempo entre as cidades %d e %d é: %d hora(s) \n\n", cid1, cid2, matriz[cid1][cid2]);
					}
			} else
				System.out.println("Informações Inválidas\n");
		}while(cid1 != cid2);
	}

	static void imprimeUnico(int matriz[][]){
	//Elabore um algoritmo que imprima a tabela sem repetições (apenas o
	//triângulo superior e o triângulo inferior).
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz.length;j++){
				if(i==j)
					System.out.printf("  \t");
				else {
					if(matriz[i][j]<10)
						System.out.printf("0%d\t",matriz[i][j]);
					else
						System.out.printf("%d\t",matriz[i][j]);
					
				}
			}
			System.out.println();
		}
		
	}

	static void tempoVariasCidades(int matriz[][]){
		int cid0 = 0, cid2, soma=0;
		
		System.out.println("Trajeto até Cidade0\nDigite a cidade de Saída:");
		cid0 = in.nextInt();
		System.out.println("Digite a próxima cidade:");
		cid2 = in.nextInt();
		
		if((cid0 <= 6 && cid0 > 0)&&(cid2 <= 6 && cid2 > 0)){	
			if(cid2 == 0){
				System.out.printf("O tempo total entre as cidades é: %d hora(s) \n", matriz[cid0][cid2]);
			}	else{
					soma = matriz[cid0][cid2];
				
					do{
						int temp = cid2;
						System.out.println("Digite a próxima cidade:");
						cid2 = in.nextInt();
				
						soma = soma + matriz[temp][cid2];
					
						}while(cid2 != 0);
					System.out.printf("O tempo total até a Cidade0 é: %d hora(s) \n", soma );
				}
			}else
				System.out.println("Informações Inválidas\nTente novamente!");
		}
	
	static void melhorTrajeto(int matriz[][]){
		int cid0, cid1,cid2, cid3;
		int soma1=0,soma2=0;
		
		System.out.println("Informe seu roteiro de viagem\nCidade de Origem:");
		cid0 = in.nextInt();
		System.out.println("Primeira cidade opcional:");
		cid1 = in.nextInt();
		System.out.println("Segunda cidade opcional:");
		cid2 = in.nextInt();
		System.out.println("Destino final:");
		cid3 = in.nextInt();
		
		if((cid0 <= 6 && cid0 > 0)&&(cid1 <= 6 && cid1 > 0)&&(cid2 <= 6 && cid2 > 0)&&(cid3 <= 6 && cid3 > 0)){
		soma1 = matriz[cid0][cid1];
		soma1 = soma1 + matriz[cid1][cid3];
		
		soma2 = matriz[cid0][cid2];
		soma2 = soma2 + matriz[cid2][cid3];
		} else{
			System.out.println("Informações Invaálidas\nTente novamente!");
			System.exit(0);}
		if(soma1<soma2){
			System.out.printf("A melhor opção: Cidade%s\nTempo de viagem: %d hora(s)\n", cid1, soma1);
			System.out.printf("A segunda opção: Cidade%s\nTempo de viagem: %d hora(s)", cid2, soma2);
		}else	{
			System.out.printf("A melhor opção: Cidade%s\nTempo de viagem: %d hora(s)\n", cid2, soma2);
			System.out.printf("A segunda opção: Cidade%s\nTempo de viagem: %d hora(s)", cid1, soma1);
			}
		
	}
	
}

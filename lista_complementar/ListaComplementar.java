package lista_complementar;

import java.util.Random;
import java.util.Scanner;

public class ListaComplementar {
	static int idade [] = new int [150];
	static int voto [] = new int [150];
	static int [] numCandidato = new int[]{12,22,13,40,10};
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ale = new Random();
		int opcao;
		
		for(int i=0;i<idade.length;i++){
			//System.out.println("Qual sua idade?");
			idade[i]=ale.nextInt((90 - 16) + 1) + 16;
			//System.out.println("Qual sua inten��o de voto?");
			//System.out.println("Roberto Claudio � 12\nCapit�o Wagner � 22\n"
			//		+ "Luizianne � 13\nHeitor F�rrer � 40\nRonaldo Martins � 10\n");
			voto[i]=numCandidato[ale.nextInt(numCandidato.length)];
		}
		
		
		do{
			System.out.println("\nEscolha uma das op��es:");
			System.out.println("0 � Encerrar o programa");
			System.out.println("1 - Calcular a m�dia das idades dos eleitores de cada candidato.");
			System.out.println("2 � Calcular a mediana das idades do total de participantes.");
			System.out.println("3 � Calcular a moda dos votos.");
			System.out.println("4 � Imprimir percentual de votos de cada candidato.");
			opcao= in.nextInt();
			
			switch (opcao) {
			case 1: mediaIdade(idade, voto);
				break;
			case 2: medianaIdade(idade);
				break;
			case 3: modaVoto(voto);	
				break;
			case 4: porcentagemVoto(voto);
				break;
			case 0: System.out.println("Programa Encerrado");
				System.exit(0);
			default:
				System.out.println("Op��o inv�lida!");
				break;
			}
		}while(opcao!=0);
			
	}

	static void mediaIdade(int[]idade,int[]voto){
		int cont12=0,cont22=0,cont13=0,cont40=0,cont10=0;
		double media12 = 0,media22 = 0,media13 = 0,media40 = 0,media10 = 0;
		int soma12=0,soma22=0,soma13=0,soma40=0,soma10=0;

		for(int i=0;i<idade.length;i++){
			if(voto[i] == 12){
					soma12 = soma12 + idade[i];
					cont12++;
				} else
					if(voto[i] == 22){
						soma22 = soma22 + idade[i];
						cont22++;
					}else
						if(voto[i] == 13){
							soma13 = soma13 + idade[i];
							cont13++;
						}else
							if(voto[i] == 40){
								soma40 = soma40 + idade[i];
								cont40++;
							}else
								if(voto[i] == 10){
									soma10 = soma10 + idade[i];
									cont10++;
								}
		}
		media12 = soma12 / cont12;
		media22 = soma22 / cont22;
		media13 = soma13 / cont13;
		media40 = soma40 / cont40;
		media10 = soma10 / cont10;
		//System.out.printf("Quantidade de votos: \n12 : %d\n22 : %d\n13 : %d\n40 : %d\n10 : %d\n",cont12,cont22,cont13,cont40,cont10);
		System.out.printf("\tM�dias de idade:\nN� Candidato\tM�dia de idade \n\t12 \t\t%.1f\n\t22 \t\t%.1f\n\t13 \t\t%.1f\n\t40 \t\t%.1f\n\t10 \t\t%.1f\n",media12,media22,media13,media40,media10);
			
	}
	
	static void medianaIdade(int[]idade){
		int temp=0, medio=0,tempv=0;
		double mediana=0;
		medio = idade.length / 2;
		
		for(int i = 0;i<idade.length;i++){
			for(int j = i+1;j<idade.length;j++){
			
			if (idade[j] < idade[i]){
				temp =idade[i];
				tempv = voto[i];
				voto[i] = voto [j];
				idade[i] = idade[j];
				idade[j]=temp;
				voto[j]=tempv;
				}
			}
		}
			
		if(idade.length%2==0){
			mediana = (idade[medio]+idade[medio-1])/2;
		}else
			if(idade.length%2==1){
				mediana = idade[medio];
			}
	System.out.printf("Mediana de Idades = %.0f anos\n",mediana);	
	}
	
	static void modaVoto(int[]voto){
		int maior=0,cont12=0,cont22=0,cont13=0,cont40=0,cont10=0;
		int [] contar = new int[5];
		
		for(int i=0;i<voto.length;i++){
			if(voto[i] == 12){
				cont12++;
			} else
				if(voto[i] == 22){
					cont22++;
				}else
					if(voto[i] == 13){
						cont13++;
					}else
						if(voto[i] == 40){
							cont40++;
						}else
							if(voto[i] == 10){
								cont10++;
							}
			
		}
		contar[0]=cont12;
		contar[1]=cont22;
		contar[2]=cont13;
		contar[3]=cont40;
		contar[4]=cont10;
		
		for(int i=0;i<contar.length;i++){
			if(maior < contar[i]){
				maior=contar[i];
			}
		}
		System.out.println("A maior inten��o de voto:");
		
		if(maior==cont12){
			System.out.println("Roberto Claudio � N�12 \nInten��es de voto: "+ cont12);
		}else
			if(maior==cont22){
				System.out.println("Capit�o Wagner � N�22 \nInten��es de voto: "+ cont22);
			}else
				if(maior==cont13){
					System.out.println("Luizianne � N�13 \nInten��es de voto: "+ cont13);
				}else
					if(maior==cont40){
						System.out.println("Heitor F�rrer � N�40 \nInten��es de voto: "+ cont40);
					}else
						if(maior==cont10){
							System.out.println("Ronaldo Martins � N�10 \nInten��es de voto: "+ cont10);
						}
	}
	
	static void porcentagemVoto(int[]voto){
		double cont12=0,cont22=0,cont13=0,cont40=0,cont10=0;
		double perc12,perc22,perc13,perc40,perc10, total=voto.length;
		
		for(int i=0;i<voto.length;i++){
			if(voto[i] == 12){
				cont12++;
			} else
				if(voto[i] == 22){
					cont22++;
				}else
					if(voto[i] == 13){
						cont13++;
					}else
						if(voto[i] == 40){
							cont40++;
						}else
							if(voto[i] == 10){
								cont10++;
							}
		}
		
			perc12= (cont12*100/total);
			perc22= (cont22*100/total);
			perc13= (cont13*100/total);
			perc40= (cont40*100/total);
			perc10= (cont10*100/total);
		
		System.out.println("Percentual de cada candidato: ");
		System.out.printf("Roberto Claudio � %.2f ", perc12);
		System.out.print("%");
		System.out.printf("\nCapit�o Wagner � %.2f ", perc22);
		System.out.print("%");
		System.out.printf("\nLuizianne � %.2f ", perc13);
		System.out.print("%");
		System.out.printf("\nHeitor F�rrer � %.2f ", perc40);
		System.out.print("%");
		System.out.printf("\nRonaldo Martins � %.2f ", perc10);
		System.out.println("%");
		
	}
}

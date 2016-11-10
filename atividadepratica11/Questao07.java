package atividadepratica11;

import java.util.Scanner;

public class Questao07 {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int numFunc;
		long [] cpf;
		double [] []salario;
		
		//número de funcionários que se deseja cadastrar.
		System.out.println("Informe o número de Funcionários a ser cadastrado:");
		numFunc = in.nextInt();
		cpf = new long [numFunc];
		salario = new double[numFunc][4];
		
		if(numFunc==0){
			System.exit(0);
		}
		
		//solicitar o CPF e o salário de cada funcionário.
		for (int i = 0; i < numFunc; i++){
			System.out.println("Informe o CPF:");
			cpf[i] = in.nextLong();
			System.out.println("Salário bruto do Funcionário:");
			salario[i][0] = in.nextDouble();
		}
		
		for (int i = 0; i < numFunc; i++){
			if(salario[i][0]<= 1399.12){
				salario[i][1]=salario[i][0]*0.08;
			}else
				if(salario[i][0] >=1399.13 && salario[i][0]<=2331.88){
					salario[i][1]=salario[i][0]*0.09;
				} else
					if(salario[i][0] >=2331.89 && salario[i][0]<=4663.75){
						salario[i][1]=salario[i][0]*0.11;
					} 
			}
		
		for (int i = 0; i < numFunc; i++){
			if(salario[i][0]<= 1903.98){
				salario[i][2]=0;
			}else
				if(salario[i][0] >= 1903.99 && salario[i][0]<=2826.65){
					salario[i][2]=salario[i][0]*0.075;
				} else
					if(salario[i][0] >=2826.66 && salario[i][0]<=3751.05){
						salario[i][2]=salario[i][0]*0.15;
				} else
					if(salario[i][0] >=3751.06 && salario[i][0]<=4664.68){
						salario[i][2]=salario[i][0]*0.225;
					} else
						if(salario[i][0] >=4664.69){
							salario[i][2]=salario[i][0]*0.275;
						}
			}
		for (int i = 0; i < numFunc; i++){
			salario[i][3] = salario[i][0] - salario[i][1]-salario[i][2] ;
		}
	imprimeSalarioGeral(cpf, salario, numFunc, 4);	
	
	}
	static void imprimeSalarioGeral(long [] cpf,  double [][] salario, int numLin, int numCol){
		System.out.println("  CPF \t\t\tSal. Bruto\t\tINSS\t\tIR\t\tSal. Líquido");
		for (int i = 0; i < numLin; i++) {
			System.out.print("|");
			System.out.printf("%d",cpf[i]);
			for (int j = 0; j < numCol; j++) {
				System.out.printf("\t\t%.2f",salario [i][j]);
			}
			System.out.println("|");
		}
	}
}

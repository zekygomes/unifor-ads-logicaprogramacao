package atividadepratica07;
import java.util.Scanner;

public class AtividadePratica7 {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	
	char opcaoEle, opcaoTurno;
	char eUseTurno = 0, eMaisUse = 0, mFluxo, fluxo = 0;
	int qntA = 0, qntB = 0, qntC = 0, qntM, qntV, qntN, maiorUseTurno, menorUseTurno = 0;
	int qntM_A = 0, qntM_B = 0, qntM_C = 0, totalTurno, mediaUseEle = 0;
	int qntV_A = 0, qntV_B = 0, qntV_C = 0, totalEle;
	int qntN_A = 0, qntN_B = 0, qntN_C = 0, percMaiorTurno,percMenorTurno,percMediaEle;
		
	for(int i=0;i<15;i++){

	System.out.println("Qual elevador você mais usa?\n A, B ou C");
	opcaoEle = in.next().charAt(0);
	System.out.println("Qual horário?\n M-Matutino, V-Vespertino ou N-Noturno");
	opcaoTurno = in.next().charAt(0);
		
	switch (opcaoEle){
	case'A':{
		if(opcaoTurno =='M')
			qntM_A++;
			else if(opcaoTurno =='V')
				qntV_A++;
				else if(opcaoTurno =='N')
					qntN_A++;
		break;
	}
	case'B':{
		if(opcaoTurno =='M')
			qntM_B++;
			else if(opcaoTurno =='V')
				qntV_B++;
				else if(opcaoTurno =='N')
					qntN_B++;
		break;
	}
	case'C':{
		if(opcaoTurno =='M')
			qntM_C++;
			else if(opcaoTurno =='V')
				qntV_C++;
				else if(opcaoTurno =='N')
					qntN_C++;
		break;
			}
		}
	}
	//qnt geral por turnos
	qntM = qntM_A + qntM_B + qntM_C;
	qntV = qntV_A + qntV_B + qntV_C;
	qntN = qntN_A + qntN_B + qntN_C;
	totalTurno = qntM + qntV + qntN;
	
	qntA = qntM_A + qntV_A + qntN_A;
	qntB = qntM_B + qntV_B + qntN_B;
	qntC = qntM_C + qntV_C + qntN_C;
	totalEle = qntA + qntB + qntC;
	
	
	//Elevador mais usado de todos E o turnno de maior fluxo de uso dele
	if(qntA>=qntB && qntA>qntC){
		eMaisUse = 'A';
		if (qntM_A>=qntV_A && qntM_A>qntN_A)
			fluxo = 'M';
			else if (qntV_A>qntM_A && qntV_A>=qntN_A)
				fluxo = 'V';
				else
					fluxo ='N';
		}else 
			if(qntB>qntA && qntB>=qntC){
				eMaisUse = 'B';
				if (qntM_B>=qntV_B && qntM_B>qntN_B)
					fluxo = 'M';
					else if (qntV_B>qntM_B && qntV_B>=qntN_B)
						fluxo = 'V';
						else
							fluxo ='N';
				}else	{
					eMaisUse = 'C';
					if (qntM_C>=qntV_C && qntM_C>qntN_C)
						fluxo = 'M';
						else if (qntV_C>qntM_C && qntV_C>=qntN_C)
							fluxo = 'V';
							else
								fluxo ='N';	
			}
	
	//Período mais usado de todos E o elevador desse período
	if(qntM>=qntV && qntM>qntN){
		maiorUseTurno = qntM;
		mFluxo = 'M';
			if (qntM_A>=qntM_B && qntM_A>qntM_C)
			eUseTurno = 'A';
			else if (qntM_B>qntM_A && qntM_B>=qntM_C)
				eUseTurno = 'B';
				else
					eUseTurno ='C';	
		
		}else 
			if(qntV>qntM && qntV>=qntN){
				maiorUseTurno = qntV;
				mFluxo = 'V';
					if (qntV_A>=qntV_B && qntV_A>qntV_C)
					eUseTurno = 'A';
					else if (qntV_B>qntV_A && qntV_B>=qntV_C)
						eUseTurno = 'B';
						else
							eUseTurno ='C';	
			}else	{
					maiorUseTurno = qntN;
					mFluxo = 'N';
						if (qntN_A>=qntN_B && qntN_A>qntN_C)
						eUseTurno = 'A';
						else if (qntN_B>qntN_A && qntN_B>=qntN_C)
							eUseTurno = 'B';
							else
								eUseTurno ='C';
					}	
	
	//Percentual de maior e menor uso nos turnos
	switch (mFluxo){
	case 'M': { if(qntV<=qntN)
					menorUseTurno = qntV;
				else
					menorUseTurno = qntN;
				break;
			}
	case 'V': { if (qntM<=qntN)
					menorUseTurno = qntM;
				else
					menorUseTurno = qntN;
				break;
			}
	case 'N': {	if (qntM<=qntV)
					menorUseTurno = qntM;
				else
					menorUseTurno = qntV;
				break;
			}
	}
	
	percMaiorTurno = ((maiorUseTurno / totalTurno)* 100);
	percMenorTurno =  ((menorUseTurno/ totalTurno)* 100);
	
	//Percentual de uso do elevador de média utilização
	switch (eMaisUse){
	case 'A': { if(qntB<=qntC)
					mediaUseEle = qntC;
				else
					mediaUseEle = qntB;
				break;
			}
	case 'B': { if (qntA<=qntC)
					mediaUseEle = qntC;
				else
					mediaUseEle = qntA;
				break;
			}
	case 'C': {	if (qntA<=qntB)
					mediaUseEle = qntB;
				else
					mediaUseEle = qntA;
				break;
			}
	}
	percMediaEle = (mediaUseEle / totalEle)* 100;
	
	System.out.printf("Elevador mais usado: %c\tHorário de maior fluxo: %c\n", eMaisUse, fluxo);
	System.out.printf("Período mais usado: %c\tElevador nesse período: %c\n", mFluxo, eUseTurno );
	System.out.printf("Percentual do Horário mais usado: %d\t Menos usado: %d\n",percMaiorTurno ,percMenorTurno );
	System.out.println("Porcentagem de uso do elevador de média utilização: "+ percMediaEle);
}
}
package prova1_2018_2;

import java.util.Scanner;

public class P1Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int competidores = in.nextInt();
		int distancia = in.nextInt();
		
		String vencedor = "";
		int tempoVencedor=0;
		
		String competidor="";
		int tempoLivre = 0;
		int distanciaObs =0;
		int tempoObs=0;
		int quantObs = 0;
		int tempoTotal = 0;
		int tempo2=0;
		
		
		for (int i =0;i<competidores;i++) {
			competidor = in.next();
			tempoLivre = in.nextInt();
			distanciaObs = in.nextInt();
			tempoObs=in.nextInt();
			
			
			quantObs= distancia/distanciaObs;
			
			tempoTotal= (tempoLivre*60) + (quantObs*tempoObs);
			tempo2=tempo2+tempoTotal;
			
			
			if(i!=0 && tempoTotal<tempoVencedor) {
				vencedor=competidor;
				tempoVencedor=tempoTotal;
				
				
			}else if(i==0) {
				vencedor = competidor;
				tempoVencedor=tempoTotal;
			}
			
		}
		
		
		System.out.printf("%s venceu a corrida em %d segundos!", vencedor, tempoVencedor);
		in.close();
	}

}

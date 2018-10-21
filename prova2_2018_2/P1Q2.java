package prova2_2018_2;

import java.util.Scanner;

public class P1Q2 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
			int linhas = in.nextInt();
			int colunas =  in.nextInt();
			int[][] matrizValores = new int[linhas][colunas];
			int i=0;
			int j=0;
			int x=0;
			int y=0;
			double somatorio=0.00;
			int tempo=0;
			double resultado=0.00;
			//====================preenchimento da matriz e valores========
			for(i=0; i<linhas; i++) {
				for (j=0;j<colunas;j++) {
					matrizValores[i][j]=in.nextInt();
				}
			}
			int jogadas=in.nextInt();
			for(i=0;i<jogadas;i++) {
				x=in.nextInt()-1;
				y=in.nextInt()-1;
				somatorio=somatorio+matrizValores[x][y];
				
			}
			tempo = in.nextInt();
			resultado = (double) somatorio/tempo;
			
			System.out.printf("%.2f", resultado);
			in.close();
	}

}

package lista5;

import java.util.Scanner;

public class L5Q6 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int pessoas=in.nextInt();
		int conexoes=in.nextInt();
		int[][] matrizAdj = new int[conexoes][pessoas];
		int [][] matRelacoes=new int [conexoes][2];
		String [] nomes=new String [pessoas];
		int i=0;
		int j=0;
		boolean resposta=false;
		
		//preenchimento da matriz dos nomes
		for(i=0;i<pessoas;i++) {
			nomes[i]=in.next();			
		}
		//preenchimento da matriz das conexões
		for(i=0;i<conexoes;i++) {
			matRelacoes[i][0]=in.nextInt();
			matRelacoes[i][1]=in.nextInt();
		}
		//captura dos nomes de comeo e final
		String nomecomeco=in.next();
		String nomefinal=in.next();
		
		for(i=0;i<conexoes;i++) {
			for(j=0;j<pessoas;j++) {
				matRelacoes[i][j]=-1;
			}
		}
		
		
		//preechimento da matriz auxiliar/adjacente para método recursivo
		for(i=0;i<conexoes;i++) {
			if(j==matRelacoes[i][0]) {
				j=i;
			matrizAdj[j][matRelacoes[i][0]]=matRelacoes[i][1];
			}else {
				j=0;
			}
		}
		
		
		resposta = recursao(matrizAdj,pessoas-1);
		if(resposta) {
			System.out.println("We're all in this together!");
		}else {
			System.out.println("Mentira, nenhum filme da Disney da errado, nunca.");
		}
		//fechamento do objeto in(entrada de informações)
		in.close();
	}
	public static boolean recursao(int matriz[][], int primeiraColuna, int finalColuna, int proxPos) {
		int colunaFinal=finalColuna;
		int colunaPrimeira=primeiraColuna;
		int proximaPos=proxPos;
		return recursao(matriz,colunaPrimeira,colunaFinal,proximaPos);
	}
}

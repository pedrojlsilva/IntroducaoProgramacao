package prova2_2018_2;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int qtdFichas=in.nextInt();
		int i=0;
		int j=0;
		int temp=0;
		String[] nome=new String[qtdFichas];
		int[] tamanho = new int[qtdFichas];
		int[] tamanhoAux = new int[qtdFichas];
		boolean controle=true;
		
		//=====preenchimento do array=========
		for(i=0;i<qtdFichas;i++) {
			nome[i]=in.next();
			tamanho[i]=in.nextInt();
			tamanhoAux[i]=tamanho[i];
		}
		//======ordenacao=======
		for(i=0;i<qtdFichas;i++) {
			for(j=0;j<qtdFichas;j++) {
				if(tamanhoAux[i]<tamanhoAux[j]) {
					temp=tamanhoAux[i];
					tamanhoAux[i]=tamanhoAux[j];
					tamanhoAux[j]=temp;
				}
				
			}
		}
		//==============posicao======
		int pos=in.nextInt()-1;
		for(i=0;i<qtdFichas && controle ;i++) {
			if(tamanhoAux[pos]==tamanho[i]) {
				controle=false;
				pos=i;
			}
		}
		
		System.out.printf("Naruto devera usar a shuriken %s para esta maquina.", nome[pos]);
		in.close();
	}

}

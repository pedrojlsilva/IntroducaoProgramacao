package lista1;

import java.util.Scanner;

public class L1Q3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int moedas = in.nextInt();
		
		
		int verde = in.nextInt();
		int vermelho = in.nextInt();
		int roxo = in.nextInt();
		int amarelo = in.nextInt();
		
		int max=0;
		
		int benefVerde = 80/verde;
		int benefVermelho = 100/vermelho;
		int benefRoxo = 120/roxo;
		int benefAmarelo =80/amarelo;
		
		if(moedas < verde && moedas< vermelho && moedas<roxo && moedas<amarelo) {
			System.out.println("Acho que vou a pe :(");
			
		}else {
			if(benefVerde>benefVermelho) {
				max = benefVerde;
			} else {
				max=benefVermelho;
			}
			if (max>benefRoxo){
				
			} else {
				max=benefRoxo;
			}
			if(max>benefAmarelo) {
				
			}else {
				max=benefAmarelo;
			}
				
			if(max==benefVerde && moedas>=verde) {
				System.out.println("Verde");
			}else if(max==benefVermelho && moedas>=vermelho) {
				System.out.println("Vermelho");
			}else if(max==benefRoxo && moedas>=roxo) {
				System.out.println("Roxo");
			}else if(max==benefAmarelo && moedas>=amarelo) {
				System.out.println("Amarelo");
			}
		}
		in.close();
	}

}

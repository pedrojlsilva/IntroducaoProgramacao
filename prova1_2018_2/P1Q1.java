package prova1_2018_2;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dinheiro = in.nextInt();
		in.nextLine();
		
		int soma = 0;
		int gasto =0;
		
		for (int i=0; i<6;i++) {
			soma = in.nextInt();
			in.nextLine();
			gasto = gasto + soma;
		}
		
		if(gasto<=dinheiro) {
			System.out.printf("Mario gastara um total de R$ %d.", gasto);
		}else {
			int dinheiroFaltante = gasto-dinheiro;
			System.out.printf("Infelizmente nao sera possivel comprar tudo, faltam R$ %d.", dinheiroFaltante);
			
		}
		in.close();

	}

}

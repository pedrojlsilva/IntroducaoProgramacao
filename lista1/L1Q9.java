package lista1;

import java.util.Scanner;

public class L1Q9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int comprimento = in.nextInt();
		int largura=in.nextInt();
		in.nextLine();
		String tipo = in.nextLine();
		int coordenadaX = in.nextInt();
		int coordenadaY = in.nextInt();
		
		if(tipo.equals("Saque")) {
			if(coordenadaX >= comprimento/4 && coordenadaX < comprimento/2) {
				if(coordenadaY>=0 && coordenadaY<=largura) {
					System.out.println("A bola foi rebatida");
				}else {
					System.out.println("A bola foi para fora");
				}			
			}else {
				System.out.println("A bola foi para fora");
			}
			
		}else if(tipo.equals("Bola Normal")) {
			if(coordenadaX >= 0 && coordenadaX < comprimento/2) {
				if(coordenadaY>=0 && coordenadaY<=largura) {
					System.out.println("A bola foi rebatida");
				}else {
					System.out.println("A bola foi para fora");
				}			
			}else {
				System.out.println("A bola foi para fora");
			}
			
		}
		in.close();

	}

}

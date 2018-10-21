package lista_treinamento;

import java.util.Scanner;

public class oferenda {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int diamantes = in.nextInt();
		if (diamantes<=10) {
			System.out.println("Arthur");
		}else if (diamantes>10 && diamantes<=30) {
			System.out.println("Luiz");
		}else if (diamantes>30 && diamantes<=100) {
			System.out.println("Pedro");
		} else if(diamantes>100) {
			System.out.println("Nenhum");
		}
		in.close();
	}

}

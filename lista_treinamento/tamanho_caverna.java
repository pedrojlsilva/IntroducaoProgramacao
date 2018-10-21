package lista_treinamento;

import java.util.Scanner;

public class tamanho_caverna {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int base = in.nextInt();
		int altura = in.nextInt();
		int volume = (base*base)*altura;
		System.out.println(volume);
		in.close();
	}

}

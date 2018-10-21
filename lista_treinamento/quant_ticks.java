package lista_treinamento;

import java.util.Scanner;

public class quant_ticks {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int dias = in.nextInt();
		int casas = in.nextInt();
		int total = (dias*108000);
		int media = total/casas;
		System.out.println(media);
		in.close();
	}

}

package lista_treinamento;

import java.util.Scanner;

public class nickname {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String nomePrimeiro = in.nextLine();
		String nomeSegundo = in.nextLine();
		System.out.println(nomePrimeiro+nomeSegundo);
		in.close();
	}

}

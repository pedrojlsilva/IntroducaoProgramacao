package lista_treinamento;

import java.util.Scanner;

public class doacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int quantidade = in.nextInt();
		int divisao = quantidade/3;
		int resto = quantidade % 3;
		System.out.println(divisao);
		System.out.println(resto);
		in.close();
	}

}

package prova1;

import java.util.Scanner;

public class P1Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String texto=in.nextLine();
		String aux = texto.toLowerCase();
		texto = texto.toLowerCase();
		aux = aux.replace(" ", "");
		texto = texto.replace(" ", "");
		boolean controle=true;
		
		
		if(aux.length()==texto.length()) {
			for (int x = 0; x<aux.length(); x++) {
				if(aux.charAt(x)==texto.charAt(texto.length()-(x+1))) {
					
				}else {
					controle=false;
				}
			}
		}
		
		if(controle) {
			System.out.println("SIM");
		}else {
			System.out.println("NAO");
		}
		in.close();
	}

}

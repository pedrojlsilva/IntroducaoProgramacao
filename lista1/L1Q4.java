package lista1;

import java.util.Scanner;

public class L1Q4 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);// TODO Auto-generated method stub
		String canoDireita = in.nextLine();
		String canoMeio = in.nextLine();
		String canoEsquerda = in.nextLine();
		
		if((canoDireita.charAt(0)=='f' || canoDireita.charAt(0)=='F') && (canoDireita.charAt(canoDireita.length()-1)=='r' || canoDireita.charAt(canoDireita.length()-1)=='R')) {
			System.out.println("Direita");
		}else if((canoMeio.charAt(0)=='f' || canoMeio.charAt(0)=='F') && (canoMeio.charAt(canoMeio.length()-1)=='r' || canoMeio.charAt(canoMeio.length()-1)=='R')) {
			System.out.println("Meio");
		}else if((canoEsquerda.charAt(0)=='f' || canoEsquerda.charAt(0)=='F') && (canoEsquerda.charAt(canoEsquerda.length()-1)=='r' || canoEsquerda.charAt(canoEsquerda.length()-1)=='R')) {
			System.out.println("Esquerda");
		}else {
			System.out.println("Vou em frente");
		}
		in.close();
	}

}

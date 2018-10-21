package lista1;

import java.util.Scanner;

public class L1Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String objeto = in.nextLine();
		
			switch(objeto) {
			
			case "Zero":
				System.out.println("0");
			break;
			
			case "Um":
				System.out.println("1");
			break;
			
			case "Dois":
				System.out.println("2");
			break;
			
			case "Tres":
				System.out.println("3");
			break;
			
			case "Quatro":
				System.out.println("4");
			break;
			
			case "Cinco":
				System.out.println("5");
			break;
			case "Seis":
				System.out.println("6");
			break;
			case "Sete":
				System.out.println("7");
			break;
			case "Oito":
				System.out.println("8");
			break;
			
			case "Nove":
				System.out.println("9");
			break;
						
			}
			in.close();
	}

}

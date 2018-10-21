package lista1;

import java.util.Scanner;

public class L1Q10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String direcao1mario = in.next();
		int comprimentomario = in.nextInt();
		in.nextLine();
		String direcao2mario = in.next();
		comprimentomario = comprimentomario + in.nextInt();
		in.nextLine();
		String direcao3mario = in.next();
		comprimentomario = comprimentomario + in.nextInt();
		in.nextLine();
		String direcao4mario = in.next();
		comprimentomario = comprimentomario + in.nextInt();
		
		in.nextLine();
		in.nextLine();
		
		String direcao1yoshi = in.next();
		int comprimentoyoshi = in.nextInt();
		in.nextLine();
		String direcao2yoshi = in.next();
		comprimentoyoshi = comprimentoyoshi + in.nextInt();
		in.nextLine();
		String direcao3yoshi = in.next();
		comprimentoyoshi = comprimentoyoshi + in.nextInt();
		in.nextLine();
		String direcao4yoshi = in.next();
		comprimentoyoshi = comprimentoyoshi + in.nextInt();
		
		in.nextLine();
		in.nextLine();
		
		String direcao1toad = in.next();
		int comprimentotoad = in.nextInt();
		in.nextLine();
		String direcao2toad = in.next();
		comprimentotoad = comprimentotoad + in.nextInt();
		in.nextLine();
		String direcao3toad = in.next();
		comprimentotoad = comprimentotoad + in.nextInt();
		in.nextLine();
		String direcao4toad = in.next();
		comprimentotoad = comprimentotoad + in.nextInt();
		
		boolean mario = true;
		boolean yoshi = true;
		boolean toad = true;
	
		if ((direcao1mario.equals("Esquerda")  && direcao2mario.equals("Esquerda") && direcao3mario.equals("Esquerda") ) || ( direcao2mario.equals("Esquerda") && direcao3mario.equals("Esquerda") && direcao4mario.equals("Esquerda") )) {
			System.out.println("Mario caiu em um buraco negro.");
			mario = false;
			
		}
		if ((direcao1yoshi.equals("Esquerda") && direcao2yoshi.equals("Esquerda") && direcao3yoshi.equals("Esquerda")) || ( direcao2yoshi.equals("Esquerda") && direcao3yoshi.equals("Esquerda") && direcao4yoshi.equals("Esquerda") )) {
			System.out.println("Yoshi caiu em um buraco negro.");
			yoshi = false;
		}
		if ((direcao1toad.equals("Esquerda") && direcao2toad.equals("Esquerda") && direcao3toad.equals("Esquerda")) || ( direcao2toad.equals("Esquerda") && direcao3toad.equals("Esquerda") && direcao4toad.equals("Esquerda") )) {
			System.out.println("Toad caiu em um buraco negro.");
			toad = false;
		}
		

		
		if (comprimentomario<=comprimentoyoshi && comprimentomario<=comprimentotoad) {
			if(mario) {
			System.out.println("Mario venceu a corrida!");
			}else {
				if (((comprimentoyoshi<=comprimentotoad) && yoshi) || (comprimentoyoshi>=comprimentotoad && !toad)) {
					System.out.println("Yoshi venceu a corrida!");
				}else {
				    if(toad){
					System.out.println("Toad venceu a corrida!");
				    }
				}
			}
		}
		else if(comprimentoyoshi<=comprimentomario && comprimentoyoshi<=comprimentotoad) {
			if(yoshi) {
			System.out.println("Yoshi venceu a corrida!");
			}else {
				if (((comprimentomario<=comprimentotoad) && mario) || (comprimentomario>=comprimentotoad && !toad)) {
					System.out.println("Mario venceu a corrida!");
				}else {
				    if(toad){
					System.out.println("Toad venceu a corrida!");
				    }
				}
			}
		}else if(comprimentotoad<=comprimentomario && comprimentotoad<=comprimentoyoshi) {
			if(toad) {
			System.out.println("Toad venceu a corrida!");
			}else {
				if (((comprimentomario<=comprimentoyoshi) && mario)|| (comprimentomario>=comprimentoyoshi && !yoshi)) {
					System.out.println("Mario venceu a corrida!");
				}else {
				    if(yoshi){
					System.out.println("Yoshi venceu a corrida!");
				    }
				}
			}
		}
		in.close();
	}

}

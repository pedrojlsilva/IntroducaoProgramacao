package lista1;

import java.util.Scanner;

public class L1Q7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String heroi= in.nextLine();
		String flor = in.nextLine();
		int bowserLife = in.nextInt();
		
		int lifeFlor=0;
		
		if (heroi.equals("Mario")) {
			if(flor.equals("FireFlower")) {	
				lifeFlor=73;
			}
			if(flor.equals("IceFlower")) {
				lifeFlor=50;
			}
			if(flor.equals("BoomerangFlower")) {
				lifeFlor=32;
			}
			
			if((lifeFlor*4)>=bowserLife) {
				System.out.println("Mario conseguiu derrotar o Bowser e salvar a princesa Peach.");
			}else {
				System.out.println("O Bowser conseguiu escapar.");
			}
			
		} else if(heroi.equals("Luigi")) {
			if(flor.equals("FireFlower")) {	
				lifeFlor=70	;
			}
			if(flor.equals("IceFlower")) {
				lifeFlor=45;
			}
			if(flor.equals("BoomerangFlower")) {
				lifeFlor=28;
			}
			if((lifeFlor*4)>=bowserLife) {
				System.out.println("Luigi conseguiu derrotar o Bowser e salvar a princesa Peach.");
			}else {
				System.out.println("O Bowser conseguiu escapar.");
			}
		}
		in.close();
	}

}

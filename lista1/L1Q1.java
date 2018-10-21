package lista1;

import java.util.Scanner;

public class L1Q1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int objeto = in.nextInt();
		if(objeto>=1 && objeto<=4) {
			switch(objeto) {
			
			case 1:
				System.out.println("Life Mushroom");
			break;
			
			case 2:
				System.out.println("Fire Flower");
			break;
			
			case 3:
				System.out.println("Boost Star");
			break;
			
			case 4:
				System.out.println("Mega Mushroom");
			break;
			
			}
		}
		in.close();
	}

}

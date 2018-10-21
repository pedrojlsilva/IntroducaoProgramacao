package lista1;

import java.util.Scanner;

public class L1Q8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pessoa1= in.nextLine();
		String pessoa2 = in.nextLine();
		String pessoa3 = in.nextLine();
		String pessoa4 = in.nextLine();
		String pessoa5 = in.nextLine();
		String pos1 = "";
		String pos2 = "";
		String pos3 = "";
		String pos4 = "";
		String pos5 = "";
		
		
		if(pessoa1.equals("Princesa")) {
			pos1=pessoa1;
			if(pessoa2.equals("Mario")||pessoa4.equals("Mario")) {
				pos2="Mario";
				if(pessoa2.equals("Toad")||pessoa4.equals("Toad")) {
					pos4="Toad";
				}else {
					pos3="Toad";
				}
			}else if(pessoa3.equals("Mario")||pessoa5.equals("Mario")) {
				pos3="Mario";
				if(pessoa3.equals("Toad")||pessoa5.equals("Toad")) {
					pos5="Toad";
				}else {
					pos2="Toad";
				}
			}if((pessoa2.equals("Luigi")||pessoa4.equals("Luigi"))&& (pos4.equals(""))){
				pos4="Luigi";
			}else if((pessoa3.equals("Luigi")||pessoa5.equals("Luigi"))&& (pos5.equals(""))) {
				pos5="Luigi";
			} 
			
			
			if((pessoa2.equals("Yoshi")||pessoa4.equals("Yoshi"))&& (pos4.equals(""))){
				pos4="Yoshi";
			}else if((pessoa3.equals("Yoshi")||pessoa5.equals("Yoshi"))&& (pos5.equals(""))) {
				pos5="Yoshi";
			}
			
			if((pessoa2.equals("Luigi")||pessoa4.equals("Luigi"))&&(pessoa2.equals("Yoshi")||pessoa4.equals("Yoshi"))) {
				pos2="Luigi";
				pos4="Yoshi";
			}else if((pessoa3.equals("Luigi")||pessoa5.equals("Luigi"))&&(pessoa3.equals("Yoshi")||pessoa5.equals("Yoshi"))) {
				pos3="Luigi";
				pos5="Yoshi";
			}
			
			if((pessoa3.equals("Luigi")||pessoa5.equals("Luigi"))&& (pos3.equals(""))) {
				pos3="Luigi";
			}
			
			
			
		}
		
		
		System.out.println(pos1);
		System.out.println(pos2);
		System.out.println(pos3);
		System.out.println(pos4);
		System.out.println(pos5);
		in.close();

	}

}

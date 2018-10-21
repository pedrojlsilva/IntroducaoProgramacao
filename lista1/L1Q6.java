package lista1;

import java.util.Scanner;

public class L1Q6 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);// TODO Auto-generated method stub
		String impulso = in.nextLine();
		String altura = in.nextLine();
		String distancia = in.nextLine();
		String peso = in.nextLine();
		String yoshi = in.nextLine();
		
		int impulso2 = Integer.parseInt(impulso);
		double altura2 = Double.parseDouble(altura);
		int distancia2 = Integer.parseInt(distancia);
		int peso2 = Integer.parseInt(peso);
		
		if(yoshi.equals("Sim")) {
			impulso2=impulso2+5;
			peso2=peso2+50;
		}else{
		    
		}
		
		double alturaFinal = (Math.pow(impulso2, 3))/(Math.sqrt(altura2)+(distancia2/2)+(peso2/3));
		
		if(alturaFinal>100.00) {
			System.out.println("Voce consegue");
		}else {
			System.out.println("Isso e perda de tempo");
		}
		in.close();
	}
}

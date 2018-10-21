package lista_treinamento;

import java.util.Scanner;

public class distancia_vilas {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        int x = in.nextInt();
		int z = in.nextInt();
		
		int difX=x-34;
		int difZ = z-220;
		
		double dist= Math.pow(difX, 2) + Math.pow(difZ, 2);
		
		float distHogsmeade = (float) Math.sqrt(dist);
		
		difX=x-0;
		difZ = z-0;
		
		dist= Math.pow(difX, 2) + Math.pow(difZ, 2);
		float distKakariko = (float) Math.sqrt(dist);
		
		difX=x-140;
		difZ = z-456;
		
		dist= Math.pow(difX, 2) + Math.pow(difZ, 2);
		float distSolitude = (float) Math.sqrt(dist);
		System.out.printf("Distancia para Hogsmeade: %.2f\n",distHogsmeade);

		System.out.printf("Distancia para Kakariko: %.2f\n", distKakariko);
		
		System.out.printf("Distancia para Solitude: %.2f\n",distSolitude);
		in.close();
	}

}

package prova1;

import java.text.NumberFormat;
import java.util.Scanner;

public class P1Q2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int repeticoes = in.nextInt();
		double signal = 1.00;
		double divisor = 1.00;
		double resultado=0.00;
		
		for(int i=0;i<repeticoes;i++) {
			resultado=(double) resultado + signal * (1.00/divisor);
			signal=signal*(-1.00);
			divisor=divisor+2.00;
			
		}
		NumberFormat nf;
		nf = NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(5);
		resultado=resultado*4;
		
		System.out.println(nf.format(resultado));
		in.close();

	}

}

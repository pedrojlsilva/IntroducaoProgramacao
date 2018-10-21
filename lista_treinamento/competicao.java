package lista_treinamento;

import java.util.Scanner;

public class competicao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int artur = in.nextInt();
		int luis = in.nextInt();
		int pedro = in.nextInt();
		int hora = in.nextInt();
		int max, diferenca, absolute, resultado;
		
		diferenca = artur-luis;
		absolute = Math.abs(diferenca);
		max = (artur + luis + absolute) / 2;
		
		diferenca = max-pedro;
		absolute = Math.abs(diferenca);
		max = (max + pedro + absolute) / 2;
		

		
		resultado = max*hora;
		System.out.println(resultado);
		in.close();
	}

}

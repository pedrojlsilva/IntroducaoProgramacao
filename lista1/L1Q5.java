package lista1;

import java.util.Scanner;

public class L1Q5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);// TODO Auto-generated method stub
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		if (x<y) {
			if(y<z) {
				System.out.printf("%d ",z);
				System.out.printf("%d ",y);
				System.out.printf("%d ",x);
			}else {
				if(x<z) {
					System.out.printf("%d ",y);
					System.out.printf("%d ",z);
					System.out.printf("%d ",x);
				}else {
					System.out.printf("%d ",y);
					System.out.printf("%d ",x);
					System.out.printf("%d ",z);

				}
			}
		}else {
			if(y<z) {
				if(x<z) {
					System.out.printf("%d ",z);
					System.out.printf("%d ",x);
					System.out.printf("%d ",y);
					
					
					
				}else {
					System.out.printf("%d ",x);
					System.out.printf("%d ",z);
					System.out.printf("%d ",y);			
				}
				
			}else {
				System.out.printf("%d ",x);
				System.out.printf("%d ",y);
				System.out.printf("%d ",z);
				}
		}
		in.close();
	}

}

package exercicios;

import java.util.Scanner;

public class ex7 {
public static void main(String[] args) {
	float a, b, c, d, e, f, x, y;
	@SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Entre com valor de A");
	 a = ler.nextFloat();
			 
	System.out.println("Entre com valor de B");
	 b = ler.nextFloat();
		 
	System.out.println("Entre com valor de C");
	 c = ler.nextFloat();
	 
	System.out.println("Entre com valor de D");
	 d = ler.nextFloat();
				 
	System.out.println("Entre com valor de E");
	 e = ler.nextFloat();
					 
	System.out.println("Entre com valor de F");
	 f = ler.nextFloat();
						 
	x = ((c*e)-(b*f))/((a*e)-(b*d));
	y = ((a*f)-(c*d))/((a*e)-(b*d));
			 
	System.out.printf("Resultado de X= %.2f \n", x);
	System.out.printf("Resultado de Y= %.2f", y);
			 
}
}

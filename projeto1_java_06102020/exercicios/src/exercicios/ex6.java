package exercicios;

import java.util.Scanner;

public class ex6 {
 @SuppressWarnings("resource")
public static void main(String[] args) {
	
	 double x1, x2, y1, y2, res;
	 float total;
	 
	Scanner ler = new Scanner(System.in);
	
	 System.out.println("Digite o valor de um ponto. x1= ");
	 x1 = ler.nextInt();
	 
	 System.out.println("Digite o valor de um ponto. x2= ");
	 x2 = ler.nextInt();
	 
	 System.out.println("Digite o valor de um ponto. y1= ");
	 y1 = ler.nextInt();
	 
	 System.out.println("Digite o valor de um ponto. y2= ");
	 y2 = ler.nextInt();
	 
	 res = (Math.pow((x2-x1), 2) + Math.pow(y2-y1, 2));
	 total = (float) Math.sqrt(res);
	 
	 System.out.printf("Distância entre os pontos: %.2f",total );
}
}

/* Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
  D= (R+S)/2  R= (A+B)�  S=(B+C)�*/
package exercicios;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		int A, B, C;
		double S, R, D;
		
		
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite valor de A: ");
		A = ler.nextInt();
		
		System.out.println("Digite valor de B: ");
		B = ler.nextInt();
		
		System.out.println("Digite valor de C: ");
		C = ler.nextInt();
		
		R = Math.pow((A+B), 2);
		
		S = Math.pow((B+C), 2);
		
		D = (float) (R + S); 
		
		System.out.printf("Resultado: %.2f", D);
	}
}


/*Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
package Exercicios;

import java.util.Scanner;

public class ex5 {
	
	public static void main(String[] args) {
		int num = 0, soma = 0;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("N�mero: ");
			num = ler.nextInt();
			soma = soma + num;
		}while(num != 0);
		
		System.out.println("Total: "+ soma);
	}
	
}

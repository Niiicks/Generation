/*Escrever um programa que receba v�rios n�meros inteiros no teclado.
 *  E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */

package Exercicios;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		
		int num = 0;
		float soma = 0, total = 0, media = 0 ;
		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("N�mero: ");
			num = ler.nextInt();

			if(num%3 == 0) {
				soma += num;
				total++;
			}
			
		}while(num != 0);
		
		media = soma/total;
		
		System.out.println("M�dia dos n�meros multiplos de 3: "+ media);
	}
	
}

/*Escrever um programa que receba vários números inteiros no teclado.
 *  E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
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
			System.out.println("Número: ");
			num = ler.nextInt();

			if(num%3 == 0) {
				soma += num;
				total++;
			}
			
		}while(num != 0);
		
		media = soma/total;
		
		System.out.println("Média dos números multiplos de 3: "+ media);
	}
	
}

/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
 */
package exercicios;

import java.util.Scanner;

public class ex1 {
	public static void main (String args[]) 
	{
		int ano, mes = 0, dia = 0, diasTotal;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite quantos anos voc� ja completou de idade: ");
		ano = ler.nextInt();
		
		System.out.println("Digite agora quantos meses: ");
		mes = ler.nextInt();
		
		System.out.println("Digite agora os dias: ");
		dia = ler.nextInt();
		
		diasTotal =(ano * 365) + (mes * 30) + dia;
		
		System.out.printf("Sua idade em dias � %d", diasTotal);
	}
	
}
/*1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa apenas em dias. 
 */
package exercicios;

import java.util.Scanner;

public class ex2 {
	public static void main (String args[]) 
	{
		int dias, dia, mes, ano;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite quantos dias de vida voc� tem: ");
		dias = ler.nextInt();
		
		ano = dias/365;
		mes = (dias%365)/30;
		dia = (dias%365)%30;
		
		System.out.printf("Voc� tem um total de %d anos, %d meses e %d dias de vida", ano, mes, dia);
				
	}
	
}
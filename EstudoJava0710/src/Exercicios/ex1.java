package Exercicios;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class ex1 {
	public static void main(String[] args) {
		int a=0,maior = 0, i;
		Scanner ler = new Scanner(System.in);
		
		for (i = 0; i < 3; i++) {
			
		System.out.println("Digite um n�mero inteiro: ");
		a = ler.nextInt();
			if (a > maior) {
				maior = a;
			};	
		}
		
		System.out.printf("O maior n�mero � %d", maior);
		
		
	}
}

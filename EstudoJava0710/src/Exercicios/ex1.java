package Exercicios;

import java.util.Scanner;

//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class ex1 {
	public static void main(String[] args) {
		int a=0,maior = 0, i;
		Scanner ler = new Scanner(System.in);
		
		for (i = 0; i < 3; i++) {
			
		System.out.println("Digite um número inteiro: ");
		a = ler.nextInt();
			if (a > maior) {
				maior = a;
			};	
		}
		
		System.out.printf("O maior número é %d", maior);
		
		
	}
}

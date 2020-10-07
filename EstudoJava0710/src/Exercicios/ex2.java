package Exercicios;

import java.util.Arrays;
import java.util.Scanner;
//Faça um programa que entre com três números e coloque em ordem crescente.
public class ex2 {
	public static void main(String[] args) {
		int vet[] = new int[3];
		Scanner ler = new Scanner(System.in);
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um número: ");
			vet[i] = ler.nextInt();
		}
		Arrays.sort(vet);
		System.out.println("Ordem Crescente: ");
		
		for (int j = 0; j < vet.length; j++) {
			System.out.print(vet[j] + " ");
		}
	}
}

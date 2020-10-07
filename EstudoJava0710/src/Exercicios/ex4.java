package Exercicios;

import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e 
  exiba se este número é par ou ímpar. Se for par exiba também a raiz 
  quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.*/
public class ex4 {
public static void main(String[] args) {
	int num;
	double x;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	num = ler.nextInt();
	
	if(num%2 == 0) {
		x =  Math.sqrt(num); 
	System.out.printf("Número par. Raiz Quadrada: %.2f", x);
	} else {
		x = Math.pow(num, 2);
		System.out.printf("Número ímpar. %d²: %2f",num,x);
	}
	
	
}
}

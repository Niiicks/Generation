package Exercicios;

import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e 
  exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz 
  quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.*/
public class ex4 {
public static void main(String[] args) {
	int num;
	double x;
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite um n�mero: ");
	num = ler.nextInt();
	
	if(num%2 == 0) {
		x =  Math.sqrt(num); 
	System.out.printf("N�mero par. Raiz Quadrada: %.2f", x);
	} else {
		x = Math.pow(num, 2);
		System.out.printf("N�mero �mpar. %d�: %2f",num,x);
	}
	
	
}
}

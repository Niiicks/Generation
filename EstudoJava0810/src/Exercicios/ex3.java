package Exercicios;

import java.util.Scanner;

//Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for = -99. (WHILE)

public class ex3 {
	
public static void main(String[] args) {
	
	int num = 0, menor = 0, maior = 0;
	
	@SuppressWarnings("resource")
	Scanner x = new Scanner(System.in);
	
	while (num != 99) {
		System.out.println("Digite a idade: ");
		num = x.nextInt();
		if (num<21) {
			menor++;
		} else if(num>50) {
			maior++;
		}
	}
	System.out.printf("Das idades informadas, %d s�o menores de 21 anos, e %d s�o maiores que 50.",menor, maior);
}
}

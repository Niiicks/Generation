package Exercicios;
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
	int par = 0, num, imp = 0;
	
	@SuppressWarnings("resource")
	Scanner x = new Scanner(System.in);
	
	for (int i = 0; i < 10; i++) {
		System.out.println("Digite um n�mero: ");
		num = x.nextInt();
		if (num%2 == 0) {
			par ++;
		} else {
			imp++;
		}		
	}
	
	System.out.printf("Total de %d n�meros pares e %d n�mero �mpares.", par, imp);
}
}

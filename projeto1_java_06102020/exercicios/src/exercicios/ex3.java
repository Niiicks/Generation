/*Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos. 
 */
package exercicios;

import java.util.Scanner;

public class ex3 {
	public static void main (String args[]) {
		int totalSegundos, horas, minutos, segundos;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite total de segundos do evento: ");
		totalSegundos = ler.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos%3600)/ 60;
		segundos = (totalSegundos%3600)%60;
		
		System.out.printf("Dura��o total do evento � %d horas, %d minutos e %d segundos", horas, minutos, segundos);
		
		
	}
}

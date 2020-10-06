/*5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
 * Considerar que a média é ponderada 
 * e que o peso das notas é: 2,3 e 5, respectivamente. 
 */
package exercicios;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 1º Nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite 2º Nota: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Digite 3º Nota: ");
		nota3 = ler.nextFloat();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.printf("Média Ponderada: %.2f", media);
	}
}

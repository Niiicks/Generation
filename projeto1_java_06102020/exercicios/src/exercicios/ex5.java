/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada 
 * e que o peso das notas �: 2,3 e 5, respectivamente. 
 */
package exercicios;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		float nota1, nota2, nota3, media;
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite 1� Nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite 2� Nota: ");
		nota2 = ler.nextFloat();
		
		System.out.println("Digite 3� Nota: ");
		nota3 = ler.nextFloat();
		
		media = ((nota1*2) + (nota2*3) + (nota3*5))/10;
		
		System.out.printf("M�dia Ponderada: %.2f", media);
	}
}

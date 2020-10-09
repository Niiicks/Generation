package Exercicios;

import java.util.Scanner;

public class ex4 {
public static void main(String[] args) {
	int opc=0;
	float[][] matriz1 = new float[2][2];
	float[][] matriz2 = new float[2][2];
	float[][] soma = new float[2][2];
	float[][] subt = new float[2][2];
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Entradas da primeira matriz: ");
	
	for (int i = 0; i < matriz1.length; i++) {
		for (int j = 0; j < matriz1.length; j++) {
			System.out.printf("Número na posição (%d, %d): ", i+1, j+1 );
			matriz1[i][j] = ler.nextFloat();
		}		
	}
	
	System.out.println("\nEntradas da segunda matriz: ");
	for (int i = 0; i < matriz2.length; i++) {
		for (int j = 0; j < matriz2.length; j++) {
			System.out.printf("Número na posição (%d, %d): ", i+1, j+1 );
			matriz2[i][j] = ler.nextFloat();
		}
	}
	

	while(opc != 5) {
		System.out.println("\nEscolha uma opção. ");
		System.out.println("[1] Somar as duas matrizes!				[2] Subtrair a primeira matriz da segunda! ");
		System.out.println("[3] Adicionar uma constante às duas matrizes!		[4] Imprimir as matrizes! ");
		System.out.println("[5] Encerrar");
		
		opc = ler.nextInt();
		
	
	switch(opc) {
	case 1: System.out.println("Resultado da soma: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
				System.out.print("["+ soma[i][j]+"]");
			}		
			System.out.println("");
		}
	break;
	case 2: System.out.println("Resultado da subtração Matriz2 - Matriz1: ");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			subt[i][j] = matriz2[i][j] - matriz1[i][j];
			System.out.print("["+ subt[i][j]+"]");
		}		
		System.out.println("");
	}
	break;
	case 3: System.out.println("Número a ser somado em todas as posições das matrizes: ");
	float num = ler.nextFloat();
	System.out.println("Primeira matriz + constante");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
		//	matriz1[i][j] += num;
			System.out.printf("[%.2f]", matriz1[i][j]+num );
		}		
		System.out.println("");
	}
	System.out.println("Segunda matriz + constante");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
		//	matriz2[i][j] += num;
			System.out.printf("[%.2f]", matriz2[i][j]+num );
		}		
		System.out.println("");
	}
	
	break;
	case 4: System.out.println("Primeira Matriz: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.print("["+ matriz1[i][j]+"]");
			}		
			System.out.println("");
		}
		System.out.println("Segunda matriz: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				
				System.out.print("["+ matriz2[i][j]+"]");
			}	
			System.out.println("");
		}		
	break;	
	
	}
	}
}
}



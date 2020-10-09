package Exercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class ex3 {
public static void main(String[] args) {
	
	int[][] matriz = new int[3][3];
	int contMaior = 0;
	ArrayList<Integer> maior10 = new ArrayList<Integer>();
	Scanner ler = new Scanner(System.in);
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			System.out.printf("Número na posição (%d,%d): ", i+1, j+1);
			matriz[i][j] = ler.nextInt();
			if (matriz [i][j] > 10) {
				maior10.add(matriz[i][j]);
				contMaior++;
			}
		}
	}
	System.out.println("\nTotal de número maior que 10: "+contMaior);
	for(Integer i: maior10) {
		System.out.print("["+i+"]");
	}
}
}

package Exercicios;

import java.util.Scanner;
import java.util.ArrayList;

public class ex2 {
static int rand(int i, int j) {			// M�todo para gerar um n�mero rand�mico, numa faixa espec�fica
	return (int) Math.ceil(Math.random() * (i  - j + 1)) - 1 + j;
	}
	
	public static void main(String[] args) {
	
		 Scanner ler = new Scanner(System.in);
		 ArrayList<Integer> par = new ArrayList<Integer>();
		 ArrayList<Integer> impar = new ArrayList<Integer>();
		 int arr[] = new int[6], contImpar = 0, soma = 0;
		 
		 for (int i = 0; i < arr.length; i++) {
			// System.out.println("Entrada do n�mero: ");      //Para o usu�rio entrar com o n�mero
			// arr[i] = ler.nextInt();							//idem
			 arr[i] = rand(-1000, 1000);
			 System.out.print("["+arr[i]+"]");
			if (arr[i] %2 == 0) {
				par.add(arr[i]);
				soma += arr[i];
			} else {
				impar.add(arr[i]);
				contImpar++;
			}
		}
		 System.out.print("\nN�meros pares : ");
		 
		 for(Integer i: par ) {
			 System.out.print("["+i+"]");
		}
		System.out.println("\nSoma dos pares: "+ soma);
		
		System.out.print("N�meros �mpares : ");
		 
		 for(Integer i: impar ) {
			 System.out.print("["+i+"]");
		}
		 System.out.println("\nQuantidade de �mpares: "+ contImpar);
	}
}

package Exercicios;

import java.util.Scanner;
//Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra
public class ex3 {
	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade < 15) {
			System.out.println("Categoria Infantil");
		} else if(idade >= 15 && idade < 18) {
			System.out.println("Categoria Juvenil");
		} else if(idade >= 18 && idade < 26) {
			System.out.println("Categoria Adulte");
		} else {
			System.out.println("Idade inválida!");
		}
	}
}

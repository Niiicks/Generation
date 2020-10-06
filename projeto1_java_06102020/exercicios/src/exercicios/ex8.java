package exercicios;

import java.util.Scanner;

public class ex8 {
public static void main(String[] args) {
	
	float custo;
	double distribuidor, imposto, preco;
	@SuppressWarnings("resource")
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o custo do automóvel: ");
	custo = ler.nextFloat();
	
	distribuidor = custo*0.28;
	imposto = custo*0.45;
	preco= custo + imposto + distribuidor;
	
	System.out.printf("Preço para consumidor: %2f", preco);
}
}

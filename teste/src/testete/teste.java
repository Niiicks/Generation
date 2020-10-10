package testete;

public class teste {
	static int rand(int i, int j) {			// Método para gerar um número randômico, numa faixa específica
		return (int) Math.ceil(Math.random() * (i  - j + 1)) - 1 + j;
	}
	
public static void main(String args[]) {
		
		int maior = 0, menor = 0, soma = 0, n;
		double x;
		
		n = rand(2, 10);		//aplicação do método para gerar um tamanho de array
		
		int arr[] = new int[n]; // tamanho da array (n)
		
		x = Math.pow(10, 8); // Gerar o número 10 elevado a oitava potência
		
		int value = (int)x; //convertendo número para inteiro (para ser usado na array)
	
		for (int i = 0; i < arr.length; i++) { //gerando números entre -10^8 e 10^8 nas posições da array
			
			arr[i] = rand(-value, value);
			
		}
	
	for (int i = 0; i < arr.length; i++) { //percorrendo array, separando o maior, o menor e fazendo a soma dos números
		
		if(arr[i] > maior) {
			
			maior = arr[i];				
		}
		
		if(arr[i] < menor) {
			
			menor = arr[i];
		}
		
		soma += arr[i];
		
		System.out.print("[" +arr[i]+"]"); // imprime array
	}
	int res1 = (soma - maior) ; // menor soma possível de n números - 1
	int res2 = (soma - menor) ; //maior soma possível de n números -1
	
	System.out.println("\n"+res1);
	System.out.println(res2);
}


}




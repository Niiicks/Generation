package testete;

public class teste {
	static int rand(int i, int j) {			// M�todo para gerar um n�mero rand�mico, numa faixa espec�fica
		return (int) Math.ceil(Math.random() * (i  - j + 1)) - 1 + j;
	}
	
public static void main(String args[]) {
		
		int maior = 0, menor = 0, soma = 0, n;
		double x;
		
		n = rand(2, 10);		//aplica��o do m�todo para gerar um tamanho de array
		
		int arr[] = new int[n]; // tamanho da array (n)
		
		x = Math.pow(10, 8); // Gerar o n�mero 10 elevado a oitava pot�ncia
		
		int value = (int)x; //convertendo n�mero para inteiro (para ser usado na array)
	
		for (int i = 0; i < arr.length; i++) { //gerando n�meros entre -10^8 e 10^8 nas posi��es da array
			
			arr[i] = rand(-value, value);
			
		}
	
	for (int i = 0; i < arr.length; i++) { //percorrendo array, separando o maior, o menor e fazendo a soma dos n�meros
		
		if(arr[i] > maior) {
			
			maior = arr[i];				
		}
		
		if(arr[i] < menor) {
			
			menor = arr[i];
		}
		
		soma += arr[i];
		
		System.out.print("[" +arr[i]+"]"); // imprime array
	}
	int res1 = (soma - maior) ; // menor soma poss�vel de n n�meros - 1
	int res2 = (soma - menor) ; //maior soma poss�vel de n n�meros -1
	
	System.out.println("\n"+res1);
	System.out.println(res2);
}


}




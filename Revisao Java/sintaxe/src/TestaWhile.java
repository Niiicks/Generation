
public class TestaWhile {
	
	public static void main(String[] args) {
		
		int contador = 0;
		int soma = 0;
		
		while(contador <= 1000) {
			
			System.out.println(contador);
			soma += contador;
			contador++;
		}
		System.out.println(soma);
	}
}

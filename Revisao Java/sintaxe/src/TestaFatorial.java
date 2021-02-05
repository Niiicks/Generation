
public class TestaFatorial {
	public static void main(String[] args) {
		
		int n = 6;
		int fatorial = 1; 
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
			System.out.print(i);
			
			if(i < n) {
				System.out.print("x");
			} 
		}
		System.out.print(" = "+fatorial);
	}
}

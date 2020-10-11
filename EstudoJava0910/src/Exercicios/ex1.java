package Exercicios;

public class ex1 {
	public static void main(String[] args) {
		int [] A={1, 0, 5, -2, -5, 7};
		/*int A[] = new int[6], soma=0;
		
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;*/
		
		for (int i = 0; i < A.length; i++) {
			
			if (i == 4) {
				A[i] = 100;
			}
			System.out.println("["+A[i]	+"]");
		}
		soma = A[0]+ A[1] +A[5];
		System.out.println("Soma das posições 0, 1 e 5: "+ soma);
	}
}

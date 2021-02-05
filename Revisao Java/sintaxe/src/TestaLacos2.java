
public class TestaLacos2 {
	public static void main(String args[]) {
		for (int i = 0; i < 100; i++) {
			if(i % 3 == 0) {
				System.out.print(i);				
			}
			if(i % 3 == 0 && i < 99) {
				System.out.print("-");
			}
		}

	}
}
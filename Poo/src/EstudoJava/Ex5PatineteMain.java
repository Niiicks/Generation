package EstudoJava;

public class Ex5PatineteMain {
	public static void main(String[] args) {
		Patinete patinete1 = new Patinete();
		
		patinete1.cor = "Vermelho";
		patinete1.peso = "20";
		patinete1.dados();
		
		patinete1.check();
		
		patinete1.acelera(10);
		
		patinete1.check();
		
		patinete1.acelera(100);
		
		patinete1.check();
	}
}

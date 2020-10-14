package EstudoJava;

public class Ex2AviaoMain {
	public static void main(String[] args) {
		Aviao aviao1 = new Aviao("SpTrans", "Clécia", "87A843BC", "Osasco");
		
		aviao1.embarcar();
		aviao1.decolar();
		aviao1.pousar();
	}
}
